package com.springboot.test1.config;

import lombok.Getter;

@Getter
public enum BaseResponseStatus {
    /**
     * 1000 : 요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),


    /**
     * 2000 : Request 오류
     */
    // Common
    REQUEST_ERROR(false, 2000, "입력값을 확인해주세요."),
    EMPTY_JWT(false, 2001, "JWT를 입력해주세요."),
    INVALID_JWT(false, 2002, "유효하지 않은 JWT입니다."),
    INVALID_USER_JWT(false,2003,"권한이 없는 유저의 접근입니다."),
    EMPTY_PATH_VARIABLE(false, 2004, "PathVariable를 입력해주세요."),
    INVALID_ADDRESS(false, 2005, "올바르지 않은 주소입니다."),

    // users
    USERS_EMPTY_USER_ID(false, 2010, "유저 아이디 값을 확인해주세요."),

    // [POST] /users
    POST_USERS_EMPTY_EMAIL(false, 2015, "이메일을 입력해주세요."),
    POST_USERS_INVALID_EMAIL(false, 2016, "이메일을 올바르게 입력해주세요."),
    POST_USERS_EXISTS_EMAIL(false,2017,"이미 가입된 이메일 주소입니다. 다른 이메일을 입력하여 주세요."),
    POST_USERS_EMPTY_PASSWORD(false, 2018, "비밀번호를 입력해주세요."),
    POST_USERS_PASSWORD_COMBINATION(false, 2019, "영문/숫자/특수문자 2가지 이상 조합(8~20자)"),
    POST_USERS_PASSWORD_CONTINUOUS_OR_SAME_WORD(false, 2020, "3개 이상 연속되거나 동일한 문자/숫자 제외"),
    POST_USERS_PASSWORD_CONTAIN_ID(false, 2021, "아이디(이메일 제외)"),
    POST_USERS_EMPTY_NAME(false, 2022, "이름을 입력해주세요."),
    POST_USERS_INVALID_NAME(false, 2023, "이름을 정확히 입력하세요."),
    POST_USERS_EMPTY_PHONE(false, 2024, "휴대폰 번호를 입력해주세요."),
    POST_USERS_INVALID_PHONE(false, 2025, "휴대폰 번호 형식을 확인해주세요."),
    POST_USERS_EXISTS_PHONE(false, 2026, "아이디(이메일)로 가입된 휴대폰 번호입니다."),

    // [POST] /addresses
    POST_USERS_EMPTY_ADDRESS(false, 2030, "주소를 입력하세요."),
    POST_USERS_EMPTY_DETAIL_ADDRESS(false, 2031, "상세 주소를 입력하세요."),
    POST_USERS_INVALID_TYPE(false, 2032, "주소 타입이 올바르지 않습니다. E : 기타, C : 회사, H : 집"),


    // [GET] /category
    INVAILD_HOUR_VALUE(false, 2040, "시간은 0보다 큰 값을 입력해야합니다."),


    /**
     * 3000 : Response 오류
     */
    // Common
    RESPONSE_ERROR(false, 3000, "값을 불러오는데 실패하였습니다."),

    // [POST] /users
    DUPLICATED_EMAIL(false, 3013, "중복된 이메일입니다."),
    FAILED_TO_LOGIN(false,3014,"없는 아이디거나 비밀번호가 틀렸습니다."),
    DELETED_USER(false, 3015, "탈퇴한 유저입니다."),

    // [PATCH] /addresses/:addressId
    PATCH_CART_INVALID_ADDRESS_ID(false, 3020, "올바르지 않은 addressId 입니다."),
    PATCH_CART_INVALID_ADDRESS_ID_FORMAT(false, 3021, "올바르지 않은 addressId 형식 입니다."),
    /**
     * 4000 : Database, Server 오류
     */
    DATABASE_ERROR(false, 4000, "데이터베이스 연결에 실패하였습니다."),
    SERVER_ERROR(false, 4001, "서버와의 연결에 실패하였습니다."),

    //[PATCH] /users/{userIdx}
    MODIFY_FAIL_USERNAME(false,4014,"유저네임 수정 실패"),

    PASSWORD_ENCRYPTION_ERROR(false, 4011, "비밀번호 암호화에 실패하였습니다."),
    PASSWORD_DECRYPTION_ERROR(false, 4012, "비밀번호 복호화에 실패하였습니다."),

    //ORDER
    ORDER_POST_ERROR(false, 4020, "주문 등록 실패"),
    ORDER_INDEX_ERROR(false, 4021, "index 반환 실패"),
    ORDER_MENU_ERROR(false, 4022, "메뉴 등록 실패"),

    //MAINPAGE
    MAINPAGE_GET_ADDRESS_ERROR(false, 4030, "주소 획득 실패"),
    MAINPAGE_GET_EVENT_ERROR(false, 4031, "이벤트 획득 실패"),
    MAINPAGE_GET_STORECATEGORY_ERROR(false, 4032, "카테고리 획득 실패"),
    MAINPAGE_GET_ADVERTISE_ERROR(false, 4033, "광고 획득 실패"),
    MAINPAGE_GET_STORE_ERROR(false, 4034, "가게 획득 실패"),
    MAINPAGE_GET_STOREIMAGE_ERROR(false, 4035, "가게 이미지 획득 실패"),
    MAINPAGE_GET_MAINPAGE_MERGE_ERROR(false, 4036, "메인페이지 정보 종합 실패"),


    //Review
    GET_REVIEW_REVIEWR_ERROR(false, 4040, "리뷰어 조회 실패"),
    GET_REVIEW_MENULIST_ERROR(false, 4041, "주문리스트 조회 실패"),
    GET_REVIEW_STORE_ERROR(false, 4042, "매장 리뷰 조회 실패")
    ;


    // 5000 : 필요시 만들어서 쓰세요
    // 6000 : 필요시 만들어서 쓰세요


    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
