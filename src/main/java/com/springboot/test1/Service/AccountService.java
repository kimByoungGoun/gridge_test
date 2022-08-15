package com.springboot.test1.Service;

import com.springboot.test1.config.BaseException;
import com.springboot.test1.config.Secret.Secret;
import com.springboot.test1.data.dao.AccountDAO;
import com.springboot.test1.data.entity.Account;
import com.springboot.test1.utils.AES128;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.test1.utils.JwtService;

import static com.springboot.test1.config.BaseResponseStatus.*;

@Service
public class AccountService {

    private final AccountDAO accountDAO;
    private final JwtService jwtService;



    @Autowired
    public AccountService(AccountDAO accountDAO, JwtService jwtService) {
        this.accountDAO = accountDAO;
        this.jwtService = jwtService;

    }


    /*
    //서비스 로그인
    public PostLoginRes logIn(PostLoginReq postLoginReq) throws BaseException{
        Account account = accountDAO.selectAccount(postLoginReq);
        String password;
        try {
            password = new AES128(Secret.USER_INFO_PASSWORD_KEY).decrypt(account.getPassword());
        } catch (Exception ignored) {
            throw new BaseException(PASSWORD_DECRYPTION_ERROR);
        }

        if(postLoginReq.getPassword().equals(password)){
            int userIdx = accountDao.getPwd(postLoginReq).getAccountId();
            String jwt = jwtService.createJwt(userIdx);
            return new PostLoginRes(userIdx,jwt);
        }
        else{
            throw new BaseException(FAILED_TO_LOGIN);
        }

    }

    //POST
    //소셜 로그인
    public PostAccountRes socialLogin(PostAccountReq postAccountReq) throws BaseException {

    }

    //특정 계정 프로필 조회
    public GetAccountRes getProfile(int accountId) throws BaseException {

    }

    //서비스 회원 가입
    public PostAccountRes createAccount(PostAccountReq postAccountReq) throws BaseException {

    }


    //서비스 회원 탈퇴
    public PostLoginRes removeAccount(PostLoginReq postLoginReq) throws BaseException{

    }

    //비밀번호 수정
    public GetAccountRes putPassword(int accountId) throws BaseException {

    }
    //웹사이트 수정
    public PostAccountRes putWebsite(PostAccountReq postAccountReq) throws BaseException {

    }


    //소개 수정
    public PostLoginRes putIntroduce(PostLoginReq postLoginReq) throws BaseException{


    }

    //이름 수정
    public GetAccountRes putName(int accountId) throws BaseException {

    }
    //사용자 이름 수정
    public PostAccountRes putUserName(PostAccountReq postAccountReq) throws BaseException {

    }


    //비공개로 전환
    public PostLoginRes putPrivate(PostLoginReq postLoginReq) throws BaseException{

    }

    //비공개 취소
    public GetAccountRes putUnPrivate(int accountId) throws BaseException {

    }
    //팔로우 요청
    public PostAccountRes postFollow(PostAccountReq postAccountReq) throws BaseException {

    }


    //팔로우 요청 취소
    public PostLoginRes deleteFollow(PostLoginReq postLoginReq) throws BaseException{


    }

    //팔로우 요청 승인
    public GetAccountRes putFollowAccept(int accountId) throws BaseException {

    }

    //팔로우 요청 취소
    public GetAccountRes putFollowDeny(int accountId) throws BaseException {

    }

     */
}
