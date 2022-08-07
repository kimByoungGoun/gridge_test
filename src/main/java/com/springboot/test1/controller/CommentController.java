package com.springboot.test1.controller;

import com.springboot.test1.data.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@RequestMapping("/comment")
public class CommentController {
    // http://localhost:8080/api/v1/put-api/member2
    @PostMapping(value = "/{postID}/{accountID}")
    public String postComment(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @GetMapping(value = "/{postID}/{accountID}")
    public String getComment(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{commentID}")
    public String putComment(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
    // http://localhost:8080/api/v1/put-api/member2
    @PostMapping(value = "/{commentID}/{accountID}")
    public String postCommentLike(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{commentID}/{accountID}")
    public String putCommentLike(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
