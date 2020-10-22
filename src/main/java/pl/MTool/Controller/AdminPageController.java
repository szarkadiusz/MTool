package pl.MTool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminPageController {


    @GetMapping("/admin")
    public String getDashBoardPage(){
        return "admin_page";
    }
}
