package designpatterns.creational.builder;

import java.time.LocalDate;

public interface UserBuilder {
    UserBuilder withFirstName(String firstName);

    UserBuilder withLastName(String lastName);

    UserBuilder withAddress(Address address);

    UserBuilder withBirthDay(LocalDate date);

    User build();

    User getUser();

}
