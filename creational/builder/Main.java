package designpatterns.creational.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // string builder
        UserBuilder userBuilder = new UserWebBuilder();
        User user = userBuilder
        .withFirstName("John")
        .withLastName("D")
        .withAddress(new Address("Bucharest", "Romania", "Rajkot", "GJ", "45678"))
        .withBirthDay(LocalDate.now())
        .build();
        
        System.out.println(user);   

    }
}
