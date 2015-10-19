package com.thouhtworks.api;

import com.thoughtworks.api.ApiApplication;
import com.thoughtworks.api.ApiConfiguration;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @ClassRule
    public static final DropwizardAppRule<ApiConfiguration> RULE =
            new DropwizardAppRule<>(ApiApplication.class,"src/main/resources/config.yaml");

    @Test
    public void loginHandlerRedirectsAfterPost() {
        Client client = new JerseyClientBuilder().register(RULE.getEnvironment()).build();

        Response response = client.target(
                String.format("http://localhost:%d/greet", RULE.getLocalPort()))
                .request()
                .get();

        assertThat(response.getStatus()).isEqualTo(200);
    }

}
