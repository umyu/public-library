package qoo.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import qoo.infrastructers.AppTestConfig;
import qoo.infrastructures.repository.MemberRepository;

import java.util.Date;
import java.util.List;

import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppTestConfig.class})
@Transactional
public class MemberTest {

    @Autowired
    private MemberRepository memberRepository;

    @Before
    public void before() {
        Member member = new Member();
        member.setName("Anthony");
        member.setPassword("1111");
        member.setCreatedAt(new Date());
        member.setMemberLevel(MemberLevel.NORMAL);
        memberRepository.save(member);
    }


    @Test
    public void findAll() throws Exception {
        List<Member> memberList = memberRepository.findAll();
        Assert.assertThat(memberList.size(), is(1));
    }
}
