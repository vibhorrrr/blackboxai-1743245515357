package com.anganshiksha.repository;

import com.anganshiksha.model.NutritionTip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NutritionTipRepository extends JpaRepository<NutritionTip, Long> {
    @Query("SELECT n FROM NutritionTip n ORDER BY n.postedDate DESC LIMIT :count")
    List<NutritionTip> findLatestTips(int count);
}