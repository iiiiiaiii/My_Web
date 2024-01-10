package MyIntro.MyIntroduce.map.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@Setter
public class MemberRepository {
    private String name="장영규(Jang Yougn Kyu)";
    private int age=29;
    private String birth="1996 02 17";
    private String university="Gachon Univercity";
    private String major="행정학과";
    private String minerMajor="컴퓨터 공학";
}
