//package com.bootimooc.bootimooc.controller;
//
//import com.bootimooc.bootimooc.entity.Four;
//import com.bootimooc.bootimooc.service.FourService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class FourController {
//
//    @Autowired
//    private FourService fourService;
//
//    @CrossOrigin(origins = "*")
//    @RequestMapping("/selectAllFour")
//    @ResponseBody
//    public List<Four> selectAllFour(Integer did, Integer clid, Integer lid){
//        return fourService.selectAllFour(did, clid, lid);
//    }
//}
