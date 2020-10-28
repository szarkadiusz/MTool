package pl.MTool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminPageController {


    @GetMapping("/admin/targets")
    public String getAdminTargetsPage(){
        return "admin_targets";
    }

    @GetMapping("/admin/forecast")
    public String getAdminForecastPage(){
        return "admin_forecast";
    }
}
