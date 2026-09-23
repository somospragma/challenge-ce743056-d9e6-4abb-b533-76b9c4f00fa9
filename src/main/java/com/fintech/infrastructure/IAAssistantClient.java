package com.fintech.infrastructure;

import com.fintech.domain.Integration;
import org.springframework.stereotype.Component;

@Component
public class IAAssistantClient {
  public Integration integrate(String toolName) {
    // Simulate integration process
    return new Integration(toolName, LocalDate.now(), "Integrated");
  }
}