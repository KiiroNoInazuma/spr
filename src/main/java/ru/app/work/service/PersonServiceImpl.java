package ru.app.work.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.app.work.dao.PersonDao;
import ru.app.work.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(@Qualifier("personDaoSimple") PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
