
  package com.example.demo;
  
  import org.springframework.context.annotation.Bean; 
  import
  org.springframework.context.annotation.Configuration; 
  import
  org.springframework.security.core.userdetails.User; 
  import
  org.springframework.security.core.userdetails.User.UserBuilder; 
  import
  org.springframework.security.core.userdetails.UserDetails; 
  import
  org.springframework.security.core.userdetails.UserDetailsService; 
  
  import  org.springframework.security.provisioning.InMemoryUserDetailsManager;
  
  
  
  
  @Configuration 
  public class AppSecurityConfig {
  
  @Bean 
  public UserDetailsService users() { 
	  // The builder will ensure the
  //passwords are encoded before saving in memory 
  UserBuilder users =   User.withDefaultPasswordEncoder();
  UserDetails user = users .username("user")
  .password("password") .roles("USER") .build(); 
  UserDetails admin = users.username("admin") .password("password") .roles("ADMIN") .build();
  
  return new InMemoryUserDetailsManager(user, admin); 
  }
  }
 