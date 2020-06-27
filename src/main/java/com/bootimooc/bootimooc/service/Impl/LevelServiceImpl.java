package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Level;
import com.bootimooc.bootimooc.entity.LevelExample;
import com.bootimooc.bootimooc.mapper.LevelMapper;
import com.bootimooc.bootimooc.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {

    @Autowired
    private LevelMapper levelMapper;

    @Override
    public List<Level> selectAllLevel() {
        return levelMapper.selectByExample(new LevelExample());
    }
}
