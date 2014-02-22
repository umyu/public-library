package qoo.infrastructures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import qoo.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
