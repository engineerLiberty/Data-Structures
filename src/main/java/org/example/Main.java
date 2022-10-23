package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Main.Gender.FEMALE;
import static org.example.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person>people = List.of(
           new Person("ESTHER", FEMALE),
           new Person("MATTHEW",Gender.MALE),
           new Person("CHASE",Gender.MALE),
           new Person("BLESSING", FEMALE),
           new Person("Liberty",Gender.MALE),
           new Person("SALEM", FEMALE)
        );
        //IMPERATIVE APPROACH
        List<Person> females = new ArrayList<>();

        for(Person person: people){
         if(person.gender.equals(FEMALE)){
             females.add(person);
         }
        }
        //System.out.println("// Imperative Approach");
        for (Person female: females){

           // System.out.println(female);
        }
//        List<Person>males = new ArrayList<>();
//        for (Person person: people){
//            if(person.gender.equals(MALE)){
//                males.add(person);
//
//            }
//        }
//        for (Person male: males){
//            System.out.println(male);
//        }
        //Declarative
        System.out.println(" //Declarative Approach");
        List<Person>females2 = people.stream()
                .filter(person -> person.gender.equals(FEMALE)).collect(Collectors.toList());
        females2.forEach(System.out::println);

       }
       static class Person{
        private final String name;
        private final Gender gender;

           Person(String name, Gender gender) {
               this.name = name;
               this.gender = gender;
           }

           @Override
           public String toString() {
               return "Person{" +
                       "name='" + name + '\'' +
                       ", gender='" + gender + '\'' +
                       '}';
           }
       }
       enum Gender {
        MALE, FEMALE
       }
}