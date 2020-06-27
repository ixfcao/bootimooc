package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Estimate;
import com.bootimooc.bootimooc.entity.EstimateExample;
import com.bootimooc.bootimooc.mapper.EstimateMapper;
import com.bootimooc.bootimooc.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstimateServiceImpl implements EstimateService {

    @Autowired
    private EstimateMapper estimateMapper;



    @Override
    public List<Estimate> selectEstimateByCourseName(String courseName) {

        EstimateExample estimateExample = new EstimateExample();
        estimateExample.createCriteria().andCoursenameEqualTo(courseName);

        return estimateMapper.selectByExample(estimateExample);
    }
}
