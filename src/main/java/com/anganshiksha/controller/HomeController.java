package com.anganshiksha.controller;

import com.anganshiksha.model.NutritionTip;
import com.anganshiksha.service.NutritionTipService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final NutritionTipService nutritionTipService;

    public HomeController(NutritionTipService nutritionTipService) {
        this.nutritionTipService = nutritionTipService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<NutritionTip> nutritionTips = nutritionTipService.getLatestTips(3);
        model.addAttribute("nutritionTips", nutritionTips);
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}