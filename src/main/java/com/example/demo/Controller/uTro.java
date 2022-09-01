package com.example.demo.Controller;

import com.example.demo.Service.uSer;
import com.example.demo.config.uCon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/head")
public class uTro {
    @Autowired
    uSer user;

    @RequestMapping("sel")
    public String selerall(Model model) {
        List<uCon> list = user.sel();
        model.addAttribute("list",list);
        return "demo";
    }

}
