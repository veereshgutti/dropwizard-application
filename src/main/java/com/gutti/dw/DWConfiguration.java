package com.gutti.dw;

/**
 * Created by Veeresh Gutti on 28/12/15.
 */
import com.yammer.dropwizard.config.Configuration;

public class DWConfiguration extends Configuration {
    private String host;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "DWConfiguration{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}