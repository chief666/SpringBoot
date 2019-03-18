package com.springboot.mybatis.mapper;

import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Results({@Result(column = "user_id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "mobile",property = "mobile"),
            @Result(column = "password",property = "password"),
            @Result(column = "avatar",property = "avatar")
    })
    @Select("SELECT * FROM t_sys_user")
    List<User> selectAll();

    @Select("SELECT * FROM t_sys_user WHERE user_id = #{userId}")
    @Results({@Result(column = "user_id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "mobile",property = "mobile"),
            @Result(column = "password",property = "password"),
            @Result(column = "avatar",property = "avatar")
    })
    User getOne(Long userId);

    @Delete("DELETE FROM t_sys_user WHERE user_id = #{userId}")
    void delete(Long userId);

    @Insert("INSERT INTO t_sys_user(user_id,username,mobile,password,avatar) VALUES(#{userId},#{userName},#{mobile},#{password},#{avatar})")
    void insert(User user);

    @Update("UPDATE t_sys_user SET avatar=#{avatar} WHERE user_id=#{userId}")
    void update(User user);
}
