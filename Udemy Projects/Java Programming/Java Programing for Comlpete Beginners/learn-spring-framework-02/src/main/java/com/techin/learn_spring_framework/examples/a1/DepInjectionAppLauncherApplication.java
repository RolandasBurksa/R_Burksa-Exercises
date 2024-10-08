package com.techin.learn_spring_framework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// YourBusinessClass
//Dependency1
//Dependency2

@Component
class YourBusinessClass {

//    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor injected - YourBusinessClass ");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    Dependency1 dependency1;

    Dependency2 dependency2;

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter injection - setDependency1 ");
//        this.dependency1 = dependency1;
//    }

//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter injection - setDependency2 ");
//        this.dependency2 = dependency2;
//    }
//
//    @Override
//    public String toString() {
//        return "Using " + dependency1 + " and " + dependency2;
//    }
}
@Component
class Dependency1 {

}
@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionAppLauncherApplication {

    public static void main(String[] args) {

       try ( var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncherApplication.class)) {

           Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

           System.out.println(context.getBean(YourBusinessClass.class));

       }
    }
}
