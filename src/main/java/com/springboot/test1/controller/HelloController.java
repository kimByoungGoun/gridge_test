package com.springboot.test1.controller;

import com.springboot.test1.data.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class HelloController {

    //http://localhost:8080/api/v1/get=api/hello/{variable/?a=a&b=b
    @ApiOperation(value = "GET 예제", notes = "@Request Get")
    @GetMapping(value = "/hello/{variable}")
    public String hello(
            @PathVariable("variable") String var,
            @ApiParam(value = "param", required = true) @RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return "Hello " + var + "\n" + sb.toString();
    }
    //http://localhost:8080/api/v1/get=api/request3?name=value1&email=value2&organization=value3
    @GetMapping(value="/hello1")
    public String getReqeuestParam3(MemberDto memberDto){
        return memberDto.toString();
    }
}
