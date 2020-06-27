package com.bootimooc.bootimooc.service;


import com.bootimooc.bootimooc.entity.Estimate;

import java.util.List;

public interface EstimateService {
    List<Estimate> selectEstimateByCourseName(String courseName);
}
