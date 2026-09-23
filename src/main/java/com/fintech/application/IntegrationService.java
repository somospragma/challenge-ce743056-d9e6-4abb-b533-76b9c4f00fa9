package com.fintech.application;

import com.fintech.domain.Integration;
import com.fintech.infrastructure.IAAssistantClient;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {
  private final IAAssistantClient iaAssistantClient;

  public IntegrationService(IAAssistantClient iaAssistantClient) {
    this.iaAssistantClient = iaAssistantClient;
  }

  public Integration integrateTool(String toolName) {
    return iaAssistantClient.integrate(toolName);
  }
}