package ru.app.work.dao;

import ru.app.work.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}
