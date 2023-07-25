package CICDTEST.service;

import CICDTEST.CicdtestApplication;
import CICDTEST.domain.Member;
import CICDTEST.domain.MemberDTO;
import CICDTEST.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;



@SpringBootTest(classes = CicdtestApplication.class)
@Transactional
@RunWith(SpringRunner.class)
public class MemberServiceImplTest {
    @Autowired
    private MemberRepository memberRepository;
    @Test
    public void jpaSave(){
        //given
        MemberDTO dto = new MemberDTO("kim",1,"USER_ROLE");


        //when
        Member member = Member.toEntity(dto);
        Member SaverdMember = memberRepository.save(member);

        //then
        Member FindMember = memberRepository.findById(member.getMem_num()).get();
        Assertions.assertThat(FindMember).isEqualTo(SaverdMember);
    }

}