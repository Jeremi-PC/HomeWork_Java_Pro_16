package org.example.objectToJson.objJsonClasses;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
@Getter
@Setter
public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    Address[] address;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = new Address[]{address};
    }
    @Getter
    @Setter
    public static class Address {
        int zip;
        String street;
        int houseNumber;

        public Address() {
        }

        public Address(int zip, String street, int houseNumber) {
            this.zip = zip;
            this.street = street;
            this.houseNumber = houseNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "zip=" + zip +
                    ", street='" + street + '\'' +
                    ", houseNumber=" + houseNumber +
                    '}';
        }
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth, Address[] address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + Arrays.toString(address) +
                '}';
    }
}

