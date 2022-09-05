package com.example.demo.Service;

import com.example.demo.config.uCon;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface uSer {
    PageInfo<uCon> sel(Integer pageNum,Integer pageSize);
}
