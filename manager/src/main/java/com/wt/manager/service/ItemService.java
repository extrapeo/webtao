package com.wt.manager.service;

import com.wt.manager.common.pojo.EUDataGridResult;
import com.wt.manager.dao.pojo.TbItem;

import java.util.List;

public interface ItemService {

    EUDataGridResult pageList(Integer page , Integer rows);

}
