package com.huang.springcloudnacosprovider.controller;

import com.huang.springclouscommonapi.common.R;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HUANG
 * @date 2020/4/21 19:18
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping(value = "/p1/{id}")
    public R provider(@PathVariable("id") String id){
        return R.ok().put(id,"hello");
    }
}
