package com.wt.manager.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wt.manager.common.pojo.EUDataGridResult;
import com.wt.manager.dao.mapper.TbItemMapper;
import com.wt.manager.dao.pojo.TbItem;
import com.wt.manager.dao.pojo.TbItemExample;
import com.wt.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author weilg
 * @date 2018/1/13  23:38
 * @todo 商品相关服务
 **/
@Service
@Transactional
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public EUDataGridResult pageList(Integer page, Integer rows) {
        TbItemExample example = new TbItemExample();

        //设置分页
        PageHelper.startPage(page, rows);
        List<TbItem> list = itemMapper.selectByExample(example);
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
        long total = pageInfo.getTotal();
        EUDataGridResult easyUIResult = new EUDataGridResult(total, list);
        return easyUIResult;
    }
}
