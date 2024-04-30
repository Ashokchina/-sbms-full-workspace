package ashokit.config;

import org.hibernate.boot.Metadata;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import ashokit.entity.Book;
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
@Override
public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
	HttpMethod[] unsupportedmethod={HttpMethod.PUT ,HttpMethod.DELETE};
	config.getExposureConfiguration()
	.forDomainType(Book.class)
	.withItemExposure((Metadata,http)-> http.disable(unsupportedmethod))
	.withCollectionExposure((Metadata, http)->http.disable(unsupportedmethod));
}
}
