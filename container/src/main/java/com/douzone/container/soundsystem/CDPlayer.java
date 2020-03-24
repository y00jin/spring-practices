package com.douzone.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

	// Wiring01
	@Autowired
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc cd;

	public CDPlayer() {
	}
	
// 생성자에 @AutoWired가 걸려있는데 이는 스핑링이 CDPlayer빈을 생성할 때 ,
// 생성자를 통해 인스턴스화하고 CompactDisc에 대입 가능한 빈을 전달해줌
//	@AutoWired
//	public CDPlayer(CompactDisc cd) {
//		this.cd = cd;
//	}
	
	// Wiring02 : 생성자 주입
	//	@Autowired
	public CDPlayer(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}

	// 프로퍼티 세터 메소드에도 AutoWired 사용 가능
	// Wiring03 : setter 사용
	//	@Autowired
	public void setCompactDisc(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	// 일반메소드에도 @AutoWired 사용 가능
	// Wiring04 : 일반 메소드 사용
	@Autowired
	public void insertCompactDisc(@Qualifier("highSchoolRapper3Final") CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
	

}
