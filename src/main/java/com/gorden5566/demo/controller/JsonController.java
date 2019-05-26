package com.gorden5566.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gorden5566
 * @date 2019-05-26
 */
@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/show")
    public JSONObject show(String msg) {
        JSONObject result = new JSONObject();
        result.put("code", 200);
        result.put("msg", msg);

        return result;
    }
}
