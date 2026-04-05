package ru.app.work.dao;

import org.springframework.stereotype.Component;
import ru.app.work.domain.Person;

@Component
public class PersonDaoSimple implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
