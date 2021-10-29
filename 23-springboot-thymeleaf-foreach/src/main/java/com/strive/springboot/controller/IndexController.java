package com.strive.springboot.controller;

import com.strive.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 小白
 * @create 2021/10/26
 */
@Controller
public class IndexController {

    @GetMapping("/list")
    public String list(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(1001,"张三",45));
        list.add(new User(1001,"张三",45));
        list.add(new User(1001,"张三",45));
        list.add(new User(1001,"张三",45));
        model.addAttribute("list",list);
        return "list";
    }
    @GetMapping("/map")
    public String map (Model model){
        Map<Integer,User> map = new HashMap<>();
        map.put(1001,new User(1002,"李四",23));
        map.put(1002,new User(1002,"李四",23));
        map.put(1003,new User(1002,"李四",23));
        map.put(1004,new User(1002,"李四",23));
        model.addAttribute("map",map);
        return "map";
    }
    @GetMapping("/array")
    public String array(Model model){
        String [] strs = {"李四","王五","赵六","拾七"};
        model.addAttribute("array",strs);
        return "array";
    }
}
