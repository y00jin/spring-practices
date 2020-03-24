package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {

	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	// 주입하기 1 : Bean 생성 메소드 직접 호출
//	@Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}
	
	// 주입하기 2 : 파라미터로 Bean 전달하기
//	@Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	// 주입하기 3 : 파라미터로 Bean 전달하기 : setter 주입
//	@Bean()
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
	
	// 주입하기 4 : 같은 타입이 생성된 경우
	@Bean(name="dvdPlayer04")
	public DVDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
}
