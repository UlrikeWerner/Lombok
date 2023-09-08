package com.github.UlrikeWerner.Entity;

public record Teacher(
        String id,
        String firstName,
        String lastName,
        String[] subjects
) {
}
