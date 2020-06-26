package com.ricola_legacy.web.mappers;

import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public interface PicnicMapper {

	public Map<?, ?> findAll();

	public Map<?, ?> findSome(String searchWord, String pageNum);

}
