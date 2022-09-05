package com.example.demo.mapper;

import com.example.demo.config.uCon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface uMap {
    List<uCon> sel();
}
