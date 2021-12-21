package com.mycompany.bot;

import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.http.api.ApiException;
import com.symphony.bdk.http.api.HttpClient;
import com.symphony.bdk.http.api.util.TypeReference;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MySecondExtension {

  private BdkConfig config;
  private AuthSession authSession;
  private HttpClient client;

  public MySecondExtension(BdkConfig bdkConfig, AuthSession session, HttpClient.Builder clientBuilder) {
    this.config = bdkConfig;
    this.authSession = session;
    this.client = clientBuilder.basePath("https://www.google.com/").build();
  }

  void test() {
    log.info("Config: {}", config);
    log.info("Session token: {}", authSession.getSessionToken());
    try {
      final String result = client.path("").get(new TypeReference<String>() {
      });
      log.info(result);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
