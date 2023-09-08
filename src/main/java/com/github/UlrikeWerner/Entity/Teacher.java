package com.github.UlrikeWerner.Entity;

import lombok.Builder;
import lombok.With;

import java.util.List;

@Builder
public record Teacher(
        String teacherId,
        @With
        String firstName,
        @With
        String lastName,
        @With
        List<String> subjects
) {
}
