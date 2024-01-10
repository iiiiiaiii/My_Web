package MyIntro.MyIntroduce.map;

import MyIntro.MyIntroduce.map.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepository();
    }
}
