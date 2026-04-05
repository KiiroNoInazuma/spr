package ru.app.work;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.app.work.service.PersonService;

@ComponentScan(basePackages = "ru.app.work")
@Configuration
public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Main.class);
        PersonService service = context.getBean(PersonService.class);
        var person = service.getByName("Ivan");
        System.out.printf("name: %s age %s", person.name(), person.age());
    }
}
