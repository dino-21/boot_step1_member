package com.member.repository;

import com.member.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface MemberRepository extends JpaRepository<Member, Long>{


}
