package ru.app.work.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.app.work.domain.Person;

@Component
@Primary
public class PersonDaoSmart implements PersonDao {

    @Override
    public Person findByName(String name) {
        return new Person(name, 21);
    }
}
