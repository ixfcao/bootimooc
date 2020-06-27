package com.bootimooc.bootimooc.service;

import com.bootimooc.bootimooc.entity.Classify;

import java.util.List;

public interface ClassifyService {

    List<Classify> selectClassifyAllOrByDirectionid(String describee);
}
