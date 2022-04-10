package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    //批量删除
    int deleteMoreByArray(@Param("eids") Integer[] eids);
    //批量添加
    int insertMoreByList(@Param("emps") List<Emp> emps);

}
