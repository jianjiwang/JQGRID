package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    //增删改
    @RequestMapping("/edit")
    @ResponseBody   //规定
    public void edit(User user, String oper) throws Exception {
        //添加操作
        //判断对应的增删改操作
        if ("add".equals(oper)) {
            userService.add(user);
        } else if ("edit".equals(oper)) {
            userService.update(user);
        } else if ("del".equals(oper)) {
            userService.delete(user.getId());
        }
    }

    @RequestMapping("/showAll")
    @ResponseBody              //当前页号    //每页显示的条数
    public Map<String, Object> showAll(Integer page, Integer rows) throws Exception {
        System.out.println("页数为"+page);
        System.out.println("每页显示的条数为"+rows);
        List<User> users = userService.showAll(page, rows);
        Map<String, Object> maps = new HashMap<String, Object>();
        //设置当前页号
        maps.put("page", page);
        //当前页展示的数据
        maps.put("rows", users);
        //准备总条数
        Integer totalcounts = userService.totalcounts();
        maps.put("records", totalcounts);
        //总页数
        Integer count;
        if (totalcounts % rows == 0) {
            count = totalcounts / rows;
        } else {
            count = totalcounts / rows + 1;
        }
        maps.put("total", count);
        return maps;
    }
}
