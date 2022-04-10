package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import com.sun.javaws.security.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void testMybtis() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        //获取sqlSession，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //通过代理模式创建UserMapper接口的 代理 实现类对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句
//        int result = userMapper.insertUser();

//        int result =userMapper.deleteUser();

//        int result =userMapper.updateUser();
        //提交事务
//        sqlSession.commit();
//        System.out.println("result:" + result);

//         User user = userMapper.getUserById();
//         System.out.println(user);

//        List<User> list = userMapper.getUserList();
//        for (User user : list) {
//            System.out.println(user);
//        }

//        User user = userMapper.getUserByUsername("xiaoxi");
//        System.out.println(user);

//        User user = userMapper.checkLogin("张三","123");
//        System.out.println(user);

//        Map<String,Object> map = new HashMap<>();
//        map.put("username","xiaoxi");
//        map.put("password","666");
//        User user = userMapper.checkLoginByMap(map);
//        System.out.println(user);

//        User user = new User(null,"aaa","123456",12,"男","123@321.com");
//        int res = userMapper.insertUser2(user);
//        System.out.println(res);

//        userMapper.checkLoginByParam("xiaoxi","666");

//        User user = userMapper.getUserById2(4);
//        System.out.println(user);

//        int res = userMapper.getCount();
//        System.out.println(res);

//        System.out.println(userMapper.getUserToMap(3));

//        List<User> list = userMapper.getUserByLike("a");
//        System.out.println(list);

//        int result = userMapper.batchDelete("3,5");
//        System.out.println(result);
//
//        List<User> list = userMapper.getUserByTableName("t_user");
//        System.out.println(list);

//        User user = new User(null,"aaa","123",22,"男","164@qq.com");
//        userMapper.insertUser3(user);
//        System.out.println(user);

//        List<Emp> list = userMapper.getAllEmp2();
//        for (Emp emp : list) {
//            System.out.println(emp);
//        }









    }

}
