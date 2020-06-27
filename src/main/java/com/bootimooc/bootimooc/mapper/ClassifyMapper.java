package com.bootimooc.bootimooc.mapper;


import com.bootimooc.bootimooc.entity.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ClassifyMapper {
    List<Classify> selectClassifyAllOrByDirectionid( String describee);
}