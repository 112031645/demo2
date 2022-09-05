package com.example.demo.Service.imp;

import com.example.demo.Service.uSer;
import com.example.demo.config.uCon;
import com.example.demo.mapper.uMap;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class uImp implements uSer {
    @Autowired
    uMap umap;

    @Override
    public PageInfo<uCon> sel(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<uCon> list = umap.sel();
        PageInfo<uCon> page = new PageInfo<>(list,1);
        return page;
    }
}
