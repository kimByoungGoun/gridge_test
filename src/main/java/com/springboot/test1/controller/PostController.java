package com.springboot.test1.controller;

import com.springboot.test1.data.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping(value = "/{accountID}")
    public String getPostList(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PostMapping(value = "/{accountID}")
    public String postPost(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @GetMapping(value = "/{postID}")
    public String getPost(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PutMapping(value = "/{postID}")
    public String putPost(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PutMapping(value = "/{postID}/disable")
    public String deletePost(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PostMapping(value = "/like/{postID}/{accountID}")
    public String postPostLike(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PutMapping(value = "/unlike/{postID}/{accountID}")
    public String putPostLike(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

}
