package com.mycompany.bot;

import com.symphony.bdk.core.auth.AuthSession;
import com.symphony.bdk.core.config.model.BdkConfig;
import com.symphony.bdk.core.extension.ExtensionProvider;
import com.symphony.bdk.http.api.HttpClient;

public class MySecondExtensionProvider implements ExtensionProvider {
  @Override
  public Object newInstance(BdkConfig bdkConfig, AuthSession session, HttpClient.Builder clientBuilder) {
    return new MySecondExtension(bdkConfig, session, clientBuilder);
  }
}
