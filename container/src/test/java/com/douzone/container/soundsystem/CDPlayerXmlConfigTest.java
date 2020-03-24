package com.douzone.container.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.CDPlayerConfig;

// 컴포넌트 스캐닝 작업 테스트와 CompactDisc 빈의 생성 유무를 알기위해서 필요한 클래스
// 테스트 시작 시 자도으로 생성되는 스프링 애플리케이션 컨텍스트를 갖는 
// SpringJUnit4ClassRunner 이용
// ContextConfiguration은 CDPlayerConfig 클래스를 통해서 설정을 로드함
// CDPlayerConfig 클래스는 @ComponentScan을 가지므로 CompactDisc빈을
// 결과 애플리케이션 컨텍스트는 빈을 포함한다.

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/soundsystem/CDPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule= new SystemOutRule().enableLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}

	@Test
	public void testCDPlayerNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 지구멸망 by 양승호", systemOutRule.getLog().replace("\r\n", "").replace("\r\n", ""));
	}
	
}
