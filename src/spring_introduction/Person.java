package spring_introduction;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

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
}
