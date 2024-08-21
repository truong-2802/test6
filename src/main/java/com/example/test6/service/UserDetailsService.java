//package com.example.test6.service;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//
//@Bean
//public org.springframework.security.core.userdetails.UserDetailsService userDetailsService() {
//    return username -> {
//        if ("admin".equals(username)) {
//            return User.withUsername("admin")
//                    .password(passwordEncoder().encode("password"))
//                    .roles("ADMIN")
//                    .build();
//        }
//        throw new UsernameNotFoundException("User not found");
//    };
//}

