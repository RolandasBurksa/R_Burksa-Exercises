package lt.techin.testemp.ind_ems_backend_test.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Employee and Department API")
                        .version("1.0.0")
                        .description("API documentation for the Employee API")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                        .contact(new Contact().name("Your Name").email("your-email@example.com")));
    }

//    @Bean
//    public GroupedOpenApi employeeApi() {
//        return GroupedOpenApi.builder()
//                .group("employee-api")
//                .pathsToMatch("/api/employees/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi departmentApi() {
//        return GroupedOpenApi.builder()
//                .group("department-api")
//                .pathsToMatch("/api/departments/**")
//                        .build();
//

    @Bean
    public GroupedOpenApi organizationApi() {
        return GroupedOpenApi.builder()
                .group("organization-api")
                .pathsToMatch("/api/employees/**", "/api/departments/**")
                .build();
    }

}
