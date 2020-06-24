package com.ricola_legacy.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ricola_legacy.web.domains.MemberDTO;

@Repository
public interface MemberMapper {

	public void create(MemberDTO member);

	public void delete(MemberDTO member);

	public void update(MemberDTO member);

	public List<MemberDTO> listAll();

	public MemberDTO detail(String memberId);

	public MemberDTO login(MemberDTO member);

}
