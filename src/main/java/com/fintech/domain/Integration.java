package com.fintech.domain;

import java.time.LocalDate;

public record Integration(String toolName, LocalDate integrationDate, String status) {}