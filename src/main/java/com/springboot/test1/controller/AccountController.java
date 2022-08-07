package com.springboot.test1.controller;

import com.springboot.test1.config.BaseResponse;
import com.springboot.test1.data.dto.Account.PostLoginReq;
import com.springboot.test1.data.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.springboot.test1.config.BaseResponseStatus.USERS_EMPTY_USER_ID;

@RestController
@RequestMapping("/account")
public class AccountController {
    // http://localhost:8080/api/v1/put-api/member1
    @PostMapping(value = "/logIn")
    public String serviceLogin(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map -> {
            sb.append((map.getKey() + " : " + map.getValue() + "\n"));
        });
        return sb.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PostMapping(value = "/logIn/social/")
    public String socialLogin(@RequestBody PostLoginReq memberDto) {
        /*
        try{
            // TODO: 로그인 값들에 대한 형식적인 validatin 처리해주셔야합니다!
            // TODO: 유저의 status ex) 비활성화된 유저, 탈퇴한 유저 등을 관리해주고 있다면 해당 부분에 대한 validation 처리도 해주셔야합니다.
            //계정입력없음
            if(postLoginReq.getAccountName() == null){
                return new BaseResponse<>(USERS_EMPTY_USER_ID);
            }
            //비밀번호입력없음
            if(postLoginReq.getPassword() == null){
                return new BaseResponse<>(USERS_EMPTY_USER_ID);
            }
            PostLoginRes postLoginRes = accountProvider.logIn(postLoginReq);
            return new BaseResponse<>(postLoginRes);
        } catch (BaseException exception){
            return new BaseResponse<>(exception.getStatus());
        }*/
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @GetMapping(value = "/{accountID}/profile")
    public String getProfile(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    //서비스 회원 가입
    // http://localhost:8080/api/v1/put-api/member2
    @PostMapping(value = "/")
    public String createAccount(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    //서비스 회원 탈퇴
    // http://localhost:8080/account/:accountID/disable
    @PutMapping(value = "/{accountID}/disable")
    public String deleteAccount(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/password")
    public String putPassword(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/website")
    public String putWebsite(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/introduce")
    public String putIntroduce(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/name")
    public String putName(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/username")
    public String putUsername(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/private")
    public String putPrivate(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/unprivate")
    public String putUnprivate(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PostMapping(value = "/{accountID}/follow/{targetID}")
    public String postFollow(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @DeleteMapping(value = "/{accountID}/ubfollow/{targetID}")
    public String deleteFollow(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/follow/{targetID}/accept")
    public String putFollowAccept(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/{accountID}/follow/{targetID}/deny")
    public String putFollowDeny(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
