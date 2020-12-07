package pl.MTool.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.MTool.Controller.AdminController.ForecastData;
import pl.MTool.Controller.AdminController.TargetData;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminPageController {

    List<TargetData> targetsList = new ArrayList<>();
    List<ForecastData> forecastsList = new ArrayList<>();

    int yearlyForecast = 1000000;

    public List forecastListFulfill() {

        for (int i = 1; i < 53; i++) {
            forecastsList.add(new ForecastData(i,(yearlyForecast / 52)));
        }
        return forecastsList;
    }


    public List targetsListFullfill() {

        for (int i = 1; i < 53 * 2; i++) {
            targetsList.add(new TargetData(i,(yearlyForecast / 52 * 2 )));
        }
        return targetsList;
    }

    @GetMapping("/admin/targets")
    public String getAdminTargetsPage(Model model) {
        targetsListFullfill();
        model.addAttribute(targetsList);
        return "admin_targets";
    }

    @GetMapping("/admin/forecast")
    public String getAdminForecastPage(Model model) {
        forecastListFulfill();
        model.addAttribute( forecastsList);
        return "admin_forecast";
    }


}
