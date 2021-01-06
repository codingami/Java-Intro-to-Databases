package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {

    AddressBook addressBook;

    @Before
    public void init() throws DataBaseConnectionException {
        Person person = new Person("Jack", "Cat", 10, "jackcat@gmail.com");
        Person person1 = new Person("Adam", "Dog", 11, "adamdog@gmail.com");
        Person person2 = new Person("Peter", "Bird", 12, "peterbird@gmail.com");

        DataBase dataBase = new DataBase();

        AddressBook addressBook = new AddressBook(dataBase);
        addressBook.addPerson(person);
        addressBook.addPerson(person1);
        addressBook.addPerson(person2);

    }

    @Test
    public void getOwner() {
        //Given
        Person person = new Person("Jack", "Cat", 10, "jackcat@gmail.com");

        //When
        String expected = "Jack";
        String actual = addressBook.getOwner().getFirstName();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setOwner() {
        //Given
        Person person = new Person("Jack", "Cat", 10, "jackcat@gmail.com");
        addressBook.setOwner(person);

        //WHen
        Person expected = person;
        Person actual = addressBook.getOwner();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPerson() {

    }

    @Test
    public void removePerson() {

    }

    @Test
    public void getPersonByEmail() {

    }

    @Test
    public void getAllPeople() {

    }

    @Test
    public void saveAll() {

    }
}
