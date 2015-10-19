package com.thoughtworks.api;

import com.thoughtworks.api.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class ApiApplication extends Application<ApiConfiguration> {

    @Override
    public void run(ApiConfiguration configuration, Environment environment) throws Exception {

        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate()
        );
        environment.jersey().register(resource);
    }

    public static void main(String[] args) throws Exception {
        new ApiApplication().run(args);
    }

}
