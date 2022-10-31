package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surName;
    private int age;

    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    public void callYourPet() {
        System.out.println("Hello, my lovely PET!!!");
        pet.say();
    }

    //pet -> setPet
    //Pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: SET pet");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person: SET surName");

        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: SET age");

        this.age = age;
    }
}
