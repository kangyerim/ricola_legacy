package com.ricola_legacy.web.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ricola_legacy.web.domains.MemberDTO;

@Component
public interface MemberService {
	public void signIn (MemberDTO member);
	
	public void remove (MemberDTO member);
	
	public void modify (MemberDTO member);
	
	public List<MemberDTO> listAll();
	
	public MemberDTO listOne(String memberId);
	
	public MemberDTO logIn (MemberDTO member);
}
