package com.douzone.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	// Wiring01
	// @Autowired
	@Qualifier("HighSchoolRapper3Final")
	private CompactDisc cd;

	public CDPlayer() {
		
	}
	
	// Wiring02 : 생성자 주입
//	@Autowired
	public CDPlayer(@Qualifier("HighSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}

	// Wiring03 : setter 사용
//	@Autowired
	public void setCompactDisc(@Qualifier("HighSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// Wiring04 : 일반 메소드 사용
	@Autowired
	public void insertCompactDisc(@Qualifier("HighSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
	

}
