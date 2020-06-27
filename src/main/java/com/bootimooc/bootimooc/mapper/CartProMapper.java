package com.bootimooc.bootimooc.mapper;

import com.bootimooc.bootimooc.entity.CartPro;
import com.bootimooc.bootimooc.entity.CartProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartProMapper {
    long countByExample(CartProExample example);

    int deleteByExample(CartProExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CartPro record);

    int insertSelective(CartPro record);

    List<CartPro> selectByExample(CartProExample example);

    CartPro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CartPro record, @Param("example") CartProExample example);

    int updateByExample(@Param("record") CartPro record, @Param("example") CartProExample example);

    int updateByPrimaryKeySelective(CartPro record);

    int updateByPrimaryKey(CartPro record);
}