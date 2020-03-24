package com.douzone.container.soundsystem;

import org.springframework.stereotype.Component;

// 빈에는 ID가 있는데 해당 클래스의 앞글자를 소문자로 만들어 자동으로 생성된다.
//@Component("highSchoolRapper3Final")
//@Named("highSchoolRapper3Final")
@Component
public class HighSchoolRapper3Final implements CompactDisc {

	private String title = "지구멸망";
	private String artist = "양승호";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
