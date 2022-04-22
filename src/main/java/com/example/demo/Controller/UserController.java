package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import com.example.demo.vo.ResponseVo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class UserController {
    @Resource
    UserService userService;
    @Resource
    BvService bvService;
    @Resource
    LoadService loadService;
    @Resource
    PeopleService peopleService;
    @Resource
    ErService erService;
    @Resource
    CommentService commentService;
    @Resource
    VideoService videoService;

    @PostMapping("/add")
    public String users(@RequestBody User user) {
        userService.save(user);
        return "ok";

    }
    @PostMapping("/video/add")
    public String addVideo(@RequestBody Video video) {
        System.out.println(video);
        videoService.save(video);
        return "ok";

    }
    @PostMapping("/video/edit")
    public String editVideo(@RequestBody Video video) {
        System.out.println(video);
        videoService.updateById(video);
        return "ok";

    }
//    @Test
    public void convertColumnNameToPropertyName() {
        String columnName = "";
        String[] s = columnName.split("_");
        if (s.length > 2) {
            columnName = s[1];
        }
        System.out.println(columnName);
//        return columnName;
    }

    @GetMapping("/list")
    public ResponseVo<List<Bv>> list() {
        List<Bv> list = bvService.findList();
        return ResponseVo.success(list);
    }

    @GetMapping("/car/search")
    public ResponseVo<Er> carSearch(@RequestParam("word") String word) {
        Er search = erService.search(word);
        return ResponseVo.success(search);

    }

    @PostMapping("/upload")
    public ResponseVo<String> upload(@RequestParam("file") MultipartFile uploadFile, HttpServletRequest request) {
        String dir = "C://videos";
        try {
            String filename = uploadFile.getOriginalFilename();
            File fileServer = new File(dir, filename);
            System.out.println("file文件真实路径:" + fileServer.getAbsolutePath());
            uploadFile.transferTo(fileServer);
            String filePath = request.getScheme() + "://" +
                    request.getServerName() + ":"
                    + request.getServerPort()
                    + "/images/" + filename;
            return ResponseVo.success(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseVo.failed("上传失败");
    }

    @PostMapping("/info")
    public ResponseVo<String> info(@RequestBody Bv bv) {
        bvService.save(bv);
        return ResponseVo.success("sucess");
    }

    @GetMapping("/getVideoList")
    public ResponseVo<List<Bv>> getVideoList(@RequestParam("id") String id) {
        List<Bv> bvs = bvService.list(new LambdaQueryWrapper<Bv>().eq(Bv::getUpId, id));
        return ResponseVo.success(bvs);

    }

    @PostMapping("/register")
    public ResponseVo<String> register(@RequestBody User user) {
        return userService.register(user);

    }

    @PostMapping("/login")
    public ResponseVo<User> login(@RequestBody User user) {
        return userService.login(user);
    }

    @GetMapping("/getComment")
    public void getComment(@RequestParam("id") Integer id) {
        commentService.getComment(id);
    }

    @GetMapping("/test")
    public List<Load> test() {
        List<Load> list = loadService.list();
        return list;
    }

    @PostMapping("/road/add")
    public void addInfo(@RequestBody Load load) {
        loadService.save(load);
    }

    @DeleteMapping("/del")
    public void del(@RequestParam("id") String id) {
        loadService.removeById(id);
    }
    @GetMapping("/road/list")
    public List<Load> listLoad() {
        List<Load> list = loadService.list();
        return list;
    }
    @GetMapping("/people/list")
    public List<People> listPeople() {
        List<People> list = peopleService.list();
        return list;
    }
    @PostMapping("/people/add")
    public void addPeople(@RequestBody People people) {
        peopleService.save(people);
    }
    @GetMapping("/mapInfo")
    public String mapInfo(@RequestParam("location") String location) {
        RestTemplate res = new RestTemplate();
        String data = res.getForObject("https://api.map.baidu.com/place/v2/search?query=" + location + "&region=" + location + "&output=json&ak=0arVjuyMDf6MeChVtnibYGcp8XiS8IIa", String.class);
        System.out.println(data);
        return data;

    }

    @GetMapping("/car/list")
    public List<Er> car() {
        List<Er> list = erService.list();
        return list;
    }
    @PostMapping("/car/edit")
    public String editCar(@RequestBody Er car) {
        System.out.println(car);
        erService.updateById(car);
        return "ok";

    }
    @PostMapping("/car/add")
    public String addCar(@RequestBody Er car) {
        System.out.println(car);
        erService.save(car);
        return "ok";

    }
    @GetMapping("/video/list")
    public List<Video> video() {
return videoService.list();
    }




}
