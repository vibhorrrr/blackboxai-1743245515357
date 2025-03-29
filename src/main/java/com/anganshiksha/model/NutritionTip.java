package com.anganshiksha.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "nutrition_tips")
public class NutritionTip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "posted_date", nullable = false)
    private LocalDateTime postedDate;

    @ManyToOne
    @JoinColumn(name = "posted_by", nullable = false)
    private User postedBy;
}