package com.project.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.core.Person;
import com.project.service.PersonService;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setFirstName("Jon");
        person.setLastName("Smith");
        System.out.print(person);

        String json = personService.convert(person);
        System.out.print(json);

        Person fromJson = personService.parse(json);
        System.out.print(fromJson);
    }
}
