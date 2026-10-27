package com.example.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/person")
    public String getPerson() {
        Person person = new Person(1, "Ram", LocalDate.of(2000, 5, 15));
        return person.toString();
    }

    @GetMapping("/persons")
    public String getPersons() {
        List<Person> persons = List.of(
                new Person(1, "Sayesta", LocalDate.of(2003, 5, 10)),
                new Person(2, "Ram", LocalDate.of(2002, 1, 15))
        );
        return persons.stream()
                .map(Person::toString)
                .collect(Collectors.joining(" "));
    }

    @GetMapping("/address")
    public String getAddress() {
        Address address = new Address(1, "Home", "Bagmati", "Kathmandu", "Nepal");
        return address.toString();
    }

    @GetMapping("/addresses")
    public String getAddresses() {
        List<Address> addresses = List.of(
                new Address(1, "Home", "Bagmati", "Kathmandu", "Nepal"),
                new Address(2, "Office", "Gandaki", "Pokhara", "Nepal")
        );
        return addresses.stream()
                .map(Address::toString)
                .collect(Collectors.joining(" "));
    }
}