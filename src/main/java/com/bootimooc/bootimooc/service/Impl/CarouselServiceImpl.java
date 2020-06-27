package com.bootimooc.bootimooc.service.Impl;

import com.bootimooc.bootimooc.entity.Carousel;
import com.bootimooc.bootimooc.entity.CarouselExample;
import com.bootimooc.bootimooc.mapper.CarouselMapper;
import com.bootimooc.bootimooc.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarouselServiceImpl implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper ;

    @Override
    public List<Carousel> selectAllCarousel() {
        return carouselMapper.selectByExample(new CarouselExample());
    }
}
