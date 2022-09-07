package com.sparta.cookbank.domain.donerecipe.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyRatioResponseDto {
    private DayRatioDto today;
    private DayRatioDto yesterday;
}
