package com.wt.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weilg
 * @date 2018/1/13  20:17
 * @todo 页面跳转
 **/
@Controller
public class ViewsController {

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        if(StringUtils.isEmpty(page))
            page = "index";
        System.out.println(page);
        return page;
    }

}
