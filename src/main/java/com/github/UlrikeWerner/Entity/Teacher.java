package com.github.UlrikeWerner.Entity;

import lombok.With;

import java.util.List;

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
