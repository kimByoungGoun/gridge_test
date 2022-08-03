package com.springboot.test1.controller;

import com.springboot.test1.data.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
    // http://localhost:8080/api/v1/put-api/member1
    @PutMapping(value = "/member1")
    public String putMember(@RequestBody Map<String, Object> putData){
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map -> {
            sb.append((map.getKey() + " : " + map.getValue() + "\n"));
        });
        return sb.toString();
    }
    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
}
