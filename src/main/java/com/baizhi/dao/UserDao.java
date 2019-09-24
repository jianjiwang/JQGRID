package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //插入
    public void save(User user);

    //修改
    public void update(User user);

    //通过ID删除
    public void delete(String id);

    public Integer totalcounts();

    public List<User> selectAll(@Param("page") Integer page, @Param("rows") Integer rows);
}
