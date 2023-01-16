//package com.omega.filmlib.configs;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//
//@EnableWebSecurity
//@RequiredArgsConstructor
//@Slf4j
//@Configuration
//public class SecurityConfig {
////    private final JwtRequestFilter filter;
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return webSecurity -> webSecurity.ignoring()
////                .requestMatchers("/api/v1/auth")
//                .requestMatchers("/h2-console");
//    }
//}

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.authorizeHttpRequests()
//                .requestMatchers("/products").hasAnyRole("admin", "manager")
//                .requestMatchers("/users").hasAnyRole("admin")
//                .requestMatchers("/users/edit").hasAnyRole("super_admin")
//                .requestMatchers("/auth_check").authenticated()
//                .anyRequest().permitAll()
//                .and()
//                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
//                .build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.builder()
//                .username("userAdmin")
//                .password("pass")
//                .authorities("admin")
//                .build();
//        UserDetails user2 = User.builder()
//                .username("userSuper")
//                .password("qwerty")
//                .authorities("super_admin")
//                .build();
//        UserDetails user3 = User.builder()
//                .username("userManager")
//                .password("root")
//                .authorities("manager")
//                .build();
//        return new InMemoryUserDetailsManager(user, user2, user3);
//    }
