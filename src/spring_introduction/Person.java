package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.surName}")
    private String surName;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
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
//
//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: SET pet");
        this.pet = pet;
    }

    public String getSurName() {
        System.out.println("Class Person: GET surName");
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person: SET surName");

        this.surName = surName;
    }

    public int getAge() {
        System.out.println("Class Person: GET age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: SET age");

        this.age = age;
    }
}
