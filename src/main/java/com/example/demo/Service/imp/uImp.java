package com.example.demo.Service.imp;

import com.example.demo.Service.uSer;
import com.example.demo.config.uCon;
import com.example.demo.mapper.uMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class uImp implements uSer {
    @Autowired
    uMap umap;


    @Override
    public List<uCon> sel() {
        return umap.sel();
    }
}
