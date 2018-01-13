package com.wt.manager.controller;

import com.wt.manager.common.pojo.EUDataGridResult;
import com.wt.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
/**
 * @author weilg
 * @date 2018/1/13  23:33
 * @todo 商品相关操作
 **/
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     *
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/list")
    public EUDataGridResult itemList(Integer page , Integer rows){
        EUDataGridResult euDataGridResult = itemService.pageList(page,rows);
        return euDataGridResult;
    }

}
