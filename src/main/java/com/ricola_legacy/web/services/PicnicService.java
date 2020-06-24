package com.ricola_legacy.web.services;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface PicnicService {
	public Map<?,?> findAll();
	
	public Map<?,?> findSome(String searchWord, String pageNum);
}
