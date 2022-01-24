package com.example.jsonpDemo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class DataBaseSrvController {

    @GetMapping("/hello")
    public String hello(){
        return "{'text': 'this is spring boot demo'}";
    }


    @RequestMapping(value = "authCode")
    @ResponseBody
    public String getMobileAuthCode(HttpServletRequest request, String callback)
            throws Exception {
        String result =  "{'ret':'true'}";
        //加上返回参数
        result=callback+"("+result+")";
        return result;
    }


}
