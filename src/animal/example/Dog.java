package animal.example;

import animal.Animal;

public class Dog extends Animal {

  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println(dog.name);
    System.out.println(dog.gender);
  }
}
