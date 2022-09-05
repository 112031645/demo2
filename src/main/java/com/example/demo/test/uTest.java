package com.example.demo.test;

import com.alibaba.fastjson.JSON;
import com.example.demo.config.uCon;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class uTest {

    @Test

    public void test() {
        uCon ucon = uCon.builder().id(1).acc("魏文聪").pass("123")
                .phone("18672859554").build();
        log.info("转化为json格式");
        System.out.println(JSON.toJSONString(ucon));
    }
    @Test
    public void test2() {
        List<uCon> students = Arrays.asList(
                new uCon(1,"小明", "168", "男"),
                new uCon(2,"大明", "182", "男"),
                new uCon(3,"小白", "174", "男"),
                new uCon(4,"小黑", "186", "男"),
                new uCon(5,"小红", "156", "女"),
                new uCon(6,"小黄", "158", "女"),
                new uCon(7,"小青", "165", "女"),
                new uCon(8,"小紫", "172", "女"));

        students.stream().limit(2)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
