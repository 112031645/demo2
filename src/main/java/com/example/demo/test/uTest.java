package com.example.demo.test;

import com.alibaba.fastjson.JSON;
import com.example.demo.config.uCon;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class uTest {

    @Test

    public void test() {
        uCon ucon = uCon.builder().id(1).acc("魏文聪").pass("123")
                .phone("18672859554").build();
        log.info("转化为json格式");
        System.out.println(JSON.toJSONString(ucon));
    }
}
