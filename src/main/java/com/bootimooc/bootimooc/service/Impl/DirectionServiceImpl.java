package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Direction;
import com.bootimooc.bootimooc.entity.DirectionExample;
import com.bootimooc.bootimooc.mapper.DirectionMapper;
import com.bootimooc.bootimooc.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionServiceImpl implements DirectionService {

    @Autowired
    private DirectionMapper directionMapper ;

    @Override
    public List<Direction> selectDirectionAll() {
        DirectionExample directionExample = new DirectionExample();
        return directionMapper.selectByExample(directionExample);
    }
}
