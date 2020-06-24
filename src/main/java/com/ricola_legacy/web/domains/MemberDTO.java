package com.ricola_legacy.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MemberDTO {
	private int memberNo;
	private String memeberId, password, memberName, email;
}
