package pl.MTool.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.MTool.Controller.DashboardData.DashboardData;
import pl.MTool.Controller.DashboardData.DataRepository;

import javax.validation.Valid;

@Controller
public class LoginPageController implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/dashboard").setViewName("dashboard");
    }

    @GetMapping("/")
    public String showForm(LoginForm loginForm) {
        return "index";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid LoginForm loginForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "index";
        }

        return "redirect:dashboard";
    }




}

