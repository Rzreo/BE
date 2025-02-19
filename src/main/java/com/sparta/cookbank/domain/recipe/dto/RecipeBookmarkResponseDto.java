package com.sparta.cookbank.domain.recipe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class RecipeBookmarkResponseDto {
    private Long id;
    private String recipe_name;
    private List<String> ingredients;
    private String final_img;
    private String method;
    private String category;
    private Long calorie;
    private boolean liked;
}
