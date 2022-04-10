package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    int deleteUser(String s);

    int updateUser();

    User getUserById();

    List<User> getUserList();

    User getUserByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginByMap(Map<String,Object> map);

    int insertUser2(User user);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);

    User getUserById2(@Param("id") Integer id);

    List<User> getUserList2(@Param("id") Integer id);

    int getCount();

    Map<String, Object> getUserToMap(@Param("id") int id);

    List<User> getUserByLike(@Param("username") String username);

    int batchDelete(@Param("ids") String ids);

    //动态设置表名
    List<User> getUserByTableName(@Param("tableName") String tableName);

    void insertUser3(User user);

    List<Emp> getAllEmp();

    List<Emp> getAllEmp2();

    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);












}
