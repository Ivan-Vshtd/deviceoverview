package device.overview.deviceoverview.config;

import device.overview.deviceoverview.generated.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class Config {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("device.overview.deviceoverview.generated");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller, ConfigurationProperties configurationProperties){
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        webServiceTemplate.setDefaultUri(configurationProperties.getDevicesControlApiUrl());
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        return webServiceTemplate;
    }

    @Bean
    public ObjectFactory objectFactory(){
        return new ObjectFactory();
    }

}
