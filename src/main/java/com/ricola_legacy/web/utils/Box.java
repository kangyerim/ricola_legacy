package com.ricola_legacy.web.utils;


import java.util.HashMap;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Box<T> {
	
	private HashMap<String, T> box;
	
	public Box() { box = new HashMap<>();}
	
}
