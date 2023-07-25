package CICDTEST.service;


import CICDTEST.domain.MemberDTO;

public interface MemberService {
    //MyBatis 를 이용한 데이터 접근 방법
    MemberDTO save(MemberDTO member);
    //Jpa 를 이용한 데이터 접근 방법
    MemberDTO jpaSave(MemberDTO dto);
}
