package com.automation.practice;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
class Students{
    int age;
    String name;

    //overrided equals method --> here we compare fields of 2 objects
//    public boolean equals(Students obj) {
//        return (this.age == obj.age) && (this.name.equals(obj.name));
//    } --> commented because of Lombok --> @EqualsAndHashCode


//    commented because of Lombok --> @AllArgsConstructor
//    public Students(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
}

public class ComparingTwoObjects {
    public static void main(String[] args) {
        Students s1 =  new Students(21, "Ali");
        Students s2 =  new Students(21, "Ali");
        System.out.println(s1 == s2); // false --> memory address is different
        System.out.println(s1.equals(s2)); // false --> the hashcode is different
        System.out.println(s1.equals(s2)); // true after overriding the equals method above
    }
}
