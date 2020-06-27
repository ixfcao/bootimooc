package com.bootimooc.bootimooc.mapper;

import com.bootimooc.bootimooc.entity.HomePage;
import com.bootimooc.bootimooc.entity.HomePageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface HomePageMapper {
    long countByExample(HomePageExample example);

    int deleteByExample(HomePageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HomePage record);

    int insertSelective(HomePage record);

    List<HomePage> selectAllHomePage();
//    List<HomePage> selectByExample(HomePageExample example);

    HomePage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HomePage record, @Param("example") HomePageExample example);

    int updateByExample(@Param("record") HomePage record, @Param("example") HomePageExample example);

    int updateByPrimaryKeySelective(HomePage record);

    int updateByPrimaryKey(HomePage record);
}