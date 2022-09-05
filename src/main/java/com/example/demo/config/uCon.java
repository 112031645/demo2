package com.example.demo.config;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;


@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class uCon {

    /*@JSONField(name = "ID")*/
    public int id;

    /*@JSONField(name = "Acc")*/
    public String acc;

    /*@JSONField(name = "Pass")*/
    public String pass;

   /* @JSONField(name = "Phone")*/
    public String phone;
}
