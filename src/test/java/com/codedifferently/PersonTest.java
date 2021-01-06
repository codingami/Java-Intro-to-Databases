package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person person;

    @Before
    public void init(){
         this.person = new Person("Jack", "Cat", 10, "jackcat@gmail.com");
    }


    @Test
    public void getFirstName() {
        //Given

        //When
        String expected = "Jack";
        String actual = person.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstName() {
        //Given
        person.setFirstName("Bob");

        //When
        String expected = "Bob";
        String actual = person.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void getAge() {

        //When
        Integer expected = 10;
        Integer actual = person.getAge();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge() {
        //Given
        person.setAge(15);

        //When
        Integer expected = 15;
        Integer actual = person.getAge();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmail() {
    }

    @Test
    public void setEmail() {
    }
}