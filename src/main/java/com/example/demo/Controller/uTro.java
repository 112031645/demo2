package com.example.demo.Controller;

import com.example.demo.Service.uSer;
import com.example.demo.config.uCon;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/head")
public class uTro {
    @Autowired
    uSer user;

    @RequestMapping("sel")
    public PageInfo<uCon> selerall(@RequestParam(required = true,defaultValue = "1",
            value ="pageNum" ) Integer pageNum, @RequestParam(required = false,
            defaultValue = "1",value = "pageSize") Integer pageSize) {
        if(pageNum == null) {
            pageNum = 1;
        }
        if(pageSize == null) {
            pageSize =2;
        }
        PageInfo<uCon> pageInfo = user.sel(pageNum,pageSize);
        return pageInfo;
    }

}
