package com.springboot.myProject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource securityDataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(securityDataSource);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("ADMIN","USER")
                .antMatchers("/trains/list").hasAnyRole("ADMIN","USER")
                .antMatchers("/trains/trains/showFormForAdd").hasRole("ADMIN")
                .antMatchers("/trains/showFormForUpdate").hasRole("ADMIN")
                .antMatchers("/trains/delete").hasRole("ADMIN")
                .antMatchers("/passengers/list").hasAnyRole("USER","ADMIN")
                .antMatchers("/passengers/passengers/showFormForAdd").hasAnyRole("ADMIN","USER")
                .antMatchers("/passengers/showFormForUpdate").hasRole("ADMIN")
                .antMatchers("/passengers/delete").hasRole("ADMIN")
                .and()
                .formLogin()
                .loginPage("/showMyLoginPage")
                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");;
    }
}
