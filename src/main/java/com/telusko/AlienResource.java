package com.telusko;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	@RequestMapping("aliens")
	public List<Alien> getAliens(){
		List<Alien> aliens = new ArrayList<>();
		
		Alien a1 =  new Alien();
		a1.setId(101);
		a1.setName("naser");
		a1.setPoints(10);
		
		Alien a2 =  new Alien();
		a2.setId(102);
		a2.setName("bayat");
		a2.setPoints(20);
		
		aliens.add(a1);
		aliens.add(a2);
		
		return aliens;
	}
}
