package org.choongang.member.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    private long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
} //데이터 조회 결과를 담을 수 있는 VO(Value Object) 클래스
