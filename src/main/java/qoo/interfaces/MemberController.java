package qoo.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @RequestMapping("/list")
    public String list(){
        return "member/list";
    }
}
