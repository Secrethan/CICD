package CICDTEST.service;

import CICDTEST.CicdtestApplication;
import CICDTEST.domain.Member;
import CICDTEST.domain.MemberDTO;
import CICDTEST.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;



@SpringBootTest(classes = CicdtestApplication.class)
@Transactional
public class MemberServiceImplTest {
    @Autowired
    private MemberRepository memberRepository;

    public void jpaSave(){
        //given
        MemberDTO dto = new MemberDTO("kim");

        //when
        Member member = Member.toEntity(dto);
        Member SaverdMember = memberRepository.save(member);

        //then
        Member FindMember = memberRepository.findById(member.getMem_num()).get();
        Assertions.assertThat(FindMember).isEqualTo(SaverdMember);
    }

}