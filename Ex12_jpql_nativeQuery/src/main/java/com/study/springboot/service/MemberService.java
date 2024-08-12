package com.study.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;

	public List<Member> selectByNameLike1(String serach) {	
		return memberRepository.findByNameLike(serach);
	}

	public List<Member> selectMember2(String search, Sort sort) {
		return memberRepository.findMembers(search, sort);
	}

	public Page<Member> selectMember3(String search, Pageable pageable) {
		return memberRepository.findMembers(search, pageable);
	}

	public List<Member> selectMember4(String search) {
		return memberRepository.findMembersNative(search);
	}

	
}