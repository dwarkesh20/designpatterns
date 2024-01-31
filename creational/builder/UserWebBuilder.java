package designpatterns.creational.builder;

import java.time.LocalDate;

public class UserWebBuilder implements UserBuilder {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private Address address;

    public UserWebBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserWebBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserWebBuilder withBirthDay(LocalDate date) {
        this.birthDay = date;
        return this;
    }

    public UserWebBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public User build() {
        return new User(firstName, lastName, birthDay, address);
    }

    @Override
    public User getUser() {
        return new User(firstName, lastName, birthDay, address);
    }

}
