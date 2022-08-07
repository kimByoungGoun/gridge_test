package com.springboot.test1.controller;

import com.springboot.test1.data.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/chat")
public class ChatController {
    // http://localhost:8080/api/v1/put-api/member2
    @PostMapping(value = "/{accountID}/{targetaccountID}")
    public String postChat(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
    // http://localhost:8080/api/v1/put-api/member2
    @GetMapping(value = "/{accountID}/{targetaccountID}")
    public String getChat(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

}
