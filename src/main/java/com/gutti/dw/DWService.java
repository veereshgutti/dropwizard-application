package com.gutti.dw;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created by Veeresh Gutti on 28/12/15.
 */
public class DWService extends Service<DWConfiguration> {
    public static void main(String[] args) throws Exception {
        new DWService().run(args);
    }

    @Override
    public void initialize(Bootstrap<DWConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
    }

    @Override
    public void run(DWConfiguration configuration,
                    Environment environment) {
        environment.addResource(new RetailerResource());
        environment.addResource(new ResourceNotFoundExceptionHandler());
    }
}