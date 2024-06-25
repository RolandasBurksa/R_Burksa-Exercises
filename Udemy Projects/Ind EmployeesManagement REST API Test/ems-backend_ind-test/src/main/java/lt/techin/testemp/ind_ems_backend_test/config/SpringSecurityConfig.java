package lt.techin.testemp.ind_ems_backend_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests((authorize) -> {
                    authorize.requestMatchers(HttpMethod.POST, "/api/**").hasRole("ADMIN");
                    authorize.requestMatchers(HttpMethod.PUT, "/api/**").hasRole("ADMIN");
                    authorize.requestMatchers(HttpMethod.DELETE, "/api/**").hasRole("ADMIN");
                    authorize.requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("ADMIN", "USER");
//                    authorize.requestMatchers(HttpMethod.GET, "/api/**").permitAll();
//                    authorize.requestMatchers("/h2-console/**").permitAll();
                    authorize.anyRequest().authenticated();
                }).httpBasic(Customizer.withDefaults())
                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin)); // Allow frames from same origin (needed for H2 console)
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails vartotojas = User.builder()
                .username("vartotojas")
                .password(passwordEncoder().encode( "vartotojas"))
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password(passwordEncoder().encode( "admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(vartotojas, admin);
    }
}
