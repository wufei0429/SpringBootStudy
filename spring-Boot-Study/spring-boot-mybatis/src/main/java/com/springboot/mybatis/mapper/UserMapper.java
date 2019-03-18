package com.springboot.mybatis.mapper;


import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    //自定义的多表关联查询
    @Results({@Result(column = "user_id", property = "userId"),
            @Result(column = "username", property = "userName"),
            @Result(column = "mobile", property = "mobile"),
            @Result(column = "password", property = "password"),
            @Result(column = "avatar", property = "avatar")
    })
    @Select("SELECT * FROM t_sys_user ")
    List<User> selectAll();


    //id查询

    @Results({@Result(column = "user_id", property = "userId"),
            @Result(column = "username", property = "userName"),
            @Result(column = "mobile", property = "mobile"),
            @Result(column = "password", property = "password"),
            @Result(column = "avatar", property = "avatar")
    })
    @Select("SELECT * FROM t_sys_user WHERE user_id =#{userId}")
    User getOne(long userId);

    //删除
    @Delete( "DELETE FROM  t_sys_user WHERE user_id =#{userId}" )
    void delete(long userId);

    @Insert("INSERT INTO t_sys_user(username,user_id,password,avatar,mobile)" +
            " VALUES(#{userName}, #{userId}, #{password},#{avatar},#{mobile}) ")
    void insert(User user);

    @Update("UPDATE t_sys_user SET avatar=#{avatar},username=#{userName},mobile=#{mobile}  WHERE user_id =#{userId}")
    void update(User user);
}

