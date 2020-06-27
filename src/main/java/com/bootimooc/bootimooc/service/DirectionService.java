package com.bootimooc.bootimooc.service;

import com.bootimooc.bootimooc.entity.Direction;

import java.util.List;

public interface DirectionService {

    /*查询所有direction   首页导航*/
    List<Direction> selectDirectionAll();
}
