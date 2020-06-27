package com.bootimooc.bootimooc.mapper;

import com.bootimooc.bootimooc.entity.Estimate;
import com.bootimooc.bootimooc.entity.EstimateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EstimateMapper {
    long countByExample(EstimateExample example);

    int deleteByExample(EstimateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Estimate record);

    int insertSelective(Estimate record);

    List<Estimate> selectByExample(EstimateExample example);

    Estimate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Estimate record, @Param("example") EstimateExample example);

    int updateByExample(@Param("record") Estimate record, @Param("example") EstimateExample example);

    int updateByPrimaryKeySelective(Estimate record);

    int updateByPrimaryKey(Estimate record);
}