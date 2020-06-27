package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Classify;
import com.bootimooc.bootimooc.mapper.ClassifyMapper;
import com.bootimooc.bootimooc.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;
    @Override
    public List<Classify> selectClassifyAllOrByDirectionid(String describee) {
        return classifyMapper.selectClassifyAllOrByDirectionid(describee);
    }
}
