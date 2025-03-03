package com.example.loggerapplication;

import com.example.loggerapplication.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.loggerapplication.component.DemoBean;

@SpringBootApplication
public class LoggerApplication {
    public static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to Spring Boot");
        ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);
        logger.debug("Context: " + context.getBean(DemoBean.class));
        logger.debug("Application started successfully.");
        logger.debug("\n*** Example using @AutoWired annotation on property ***");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setEname("Spring Framework Guru");
        employeeBean.showEmployeeDetails();
    }
}
