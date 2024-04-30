package ashokit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenAIConfig {
	@Value("$(openai.api.keys)")
	String openaiApikey;
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate template = new RestTemplate();
		template.getInterceptors().add(request, body,exccution)->{
			
		};
		return null;
		
	}
}
