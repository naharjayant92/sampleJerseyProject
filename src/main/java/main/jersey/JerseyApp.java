package main.jersey;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class JerseyApp extends ResourceConfig {
    public JerseyApp() {
        register(JerseyService.class);
        register(JacksonFeature.class);
    }
}
