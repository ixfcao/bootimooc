package com.bootimooc.bootimooc.controller;

import com.bootimooc.bootimooc.entity.Carousel;
import com.bootimooc.bootimooc.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @CrossOrigin("*")
    @RequestMapping("/selectAllCarousel")
    @ResponseBody
    public List<Carousel> selectAllCarousel(){
        return carouselService.selectAllCarousel();
    }
}
