package com.anganshiksha.service;

import com.anganshiksha.model.NutritionTip;
import com.anganshiksha.repository.NutritionTipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionTipService {
    private final NutritionTipRepository nutritionTipRepository;

    public NutritionTipService(NutritionTipRepository nutritionTipRepository) {
        this.nutritionTipRepository = nutritionTipRepository;
    }

    public List<NutritionTip> getLatestTips(int count) {
        return nutritionTipRepository.findLatestTips(count);
    }
}