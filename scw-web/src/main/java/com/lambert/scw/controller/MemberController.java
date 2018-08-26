package com.lambert.scw.controller;

import com.lambert.scw.bean.TMember;
import com.lambert.scw.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @ResponseBody
    @RequestMapping("/member")
    public TMember hello(){
        System.out.println("hahah");
        TMember member = memberService.getMember(9);
        System.out.println(member);
        return member;
    }

}
