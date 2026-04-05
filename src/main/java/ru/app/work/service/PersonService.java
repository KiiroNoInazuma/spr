package ru.app.work.service;

import ru.app.work.domain.Person;

public interface PersonService {

    Person getByName(String name);
}
