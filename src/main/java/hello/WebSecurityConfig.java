package hello;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.SecurityFilterChain;



@Configuration

@EnableWebMvcSecurity

public class WebSecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http

                    .authorizeRequests(requests -> requests

                                .requestMatchers("/", "/home").permitAll()

                                .anyRequest().authenticated());

        http

                    .formLogin(login -> login

                                .loginPage("/login")

                                .permitAll())

                    .logout(logout -> logout

                                .permitAll());
        return http.build();

    }



    @Configuration

    protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {

        @Override

        public void init(AuthenticationManagerBuilder auth) throws Exception {

            auth

                    .inMemoryAuthentication()

                    .withUser("user").password("password").roles("USER");

        }

    }

}