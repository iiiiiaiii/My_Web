package MyIntro.MyIntroduce.map;
import MyIntro.MyIntroduce.map.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/base")
public class MainController {

    private final MemberRepository memberRepository;
    @Autowired
    public MainController(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }

    @GetMapping("information")
    public String baseInformation(Model model) {

        String name = memberRepository.getName();
        String birth = memberRepository.getBirth();
        int age = memberRepository.getAge();
        String university = memberRepository.getUniversity();
        String major = memberRepository.getMajor();
        String minerMajor = memberRepository.getMinerMajor();

        String imageName="picture.jpg";
        model.addAttribute("imageName",imageName);
        model.addAttribute("birth",birth);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("university", university);
        model.addAttribute("major", major);
        model.addAttribute("minor", minerMajor);
        return  "base/information";
    }
    @GetMapping("backjun")
    public String backjunImage(Model model){
        List<String> imageNames = Arrays.asList("1.png", "2.png");
        model.addAttribute("imageNames", imageNames);
        return "base/backjun";
    }

}
