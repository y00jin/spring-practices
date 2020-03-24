package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// ComponentScan 동일한 클래스를 기본적으로 스캐닝함, 컴포넌트 스캐닝을 가능하게 한다
// @Component로 애너테이트된 클래스를 찾아서 자동으로 빈으로 만든다

@Configuration
@ComponentScan(basePackages= {"com.douzone.container.soundsystem"})
public class CDPlayerConfig {
	
}
