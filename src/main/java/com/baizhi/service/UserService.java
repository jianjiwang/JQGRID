package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //插入
    public  void   add(User user);
    //修改
    public  void  update(User user);
    //删除
    public  void  delete(String  id);
    //展示所有                   //页号           //每页显示的条数
    public List<User> showAll(Integer page, Integer rows);
    //总条数
    public  Integer  totalcounts();
}
