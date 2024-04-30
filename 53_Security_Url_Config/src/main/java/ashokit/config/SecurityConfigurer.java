package ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	
		@Bean
		public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
			http.authorizeHttpRequests((authorize) -> authorize
							.requestMatchers("/welcome", "/swagger-ui.html").permitAll()
							.anyRequest().authenticated()
				)
					.httpBasic(withDefaults())
					.formLogin(withDefaults());
			return http.build();
		}
	

    @Bean
    public InMemoryUserDetailsManager inMemoryUsers() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        UserDetails ashokUser = User.builder()
            .username("ashok")
            .password(passwordEncoder.encode("ashok123"))
            .authorities("ADMIN")
            .build();

        UserDetails jockUser = User.builder()
            .username("jock")
            .password(passwordEncoder.encode("jock123"))
            .authorities("USER")
            .build();

        return new InMemoryUserDetailsManager(ashokUser, jockUser);
    }
}
