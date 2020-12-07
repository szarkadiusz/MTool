package pl.MTool.Controller.DashboardData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.MTool.Repository.ObjectMongoReposiitory;

@Controller
public class DashboardController {

    @Autowired
    ObjectMongoReposiitory reposiitory;
    @GetMapping("/dashboard")
    public String getDashBoardPage(){
        System.out.println(reposiitory.findAll());
        return "dashboard";
    }
}