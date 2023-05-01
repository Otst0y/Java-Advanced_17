package app;

import domain.University;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.expression.ParseException;
import service.UniversityService;

@SpringBootApplication
@ComponentScan("service")
@EntityScan("domain")
@EnableJpaRepositories("dao")
public class Application {
    public static void main(String[] args) throws ParseException {
        ConfigurableApplicationContext cx =  SpringApplication.run(Application.class, args);

        UniversityService universityService = cx.getBean(UniversityService.class);

        University university_1 = new University();
        university_1.setName("CHI");
        university_1.setAddressUniversity("Chicago");
        university_1.setAmountStudents(20000);
        university_1.setLevelAccreditation(1);
        university_1.setNumberInstitutes(15);

        University university_2 = new University();
        university_2.setName("NY");
        university_2.setAddressUniversity("New York");
        university_2.setAmountStudents(25000);
        university_2.setLevelAccreditation(1);
        university_2.setNumberInstitutes(20);

        universityService.save(university_1);
        universityService.save(university_2);
        System.out.println(university_1);
        System.out.println(university_2);

        universityService.findAll().stream().forEach( System.out::println);

        university_2.setNumberInstitutes(17);
        university_2.setLevelAccreditation(5);
        universityService.update(university_2);
        universityService.findAll().stream().forEach( System.out::println);

        universityService.findByName("CHI").stream().forEach( System.out::println);
        universityService.findByAmountStudents(1500).stream().forEach( System.out::println);
        universityService.findByAddressUniversity("NY").stream().forEach( System.out::println);
        System.out.println(universityService.findById(52));

        universityService.deleteById(52);
        universityService.findAll().stream().forEach( System.out::println);
    }
}
