package geekbrain.com;

import java.util.Scanner;

public class Person {
//    1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//    2. Конструктор класса должен заполнять эти поля при создании объекта.

    public String name;
    public String profession;
    public String email;
    public String telephone;
    public int zp;
    public int age;


//    public Person(String name, String profession, String email, String telephone, int zp, int age);
    //для каждой ячейки массива задаем объект 2. Конструктор класса должен заполнять эти поля при создании объекта;

    public Person(String name, String profession, String email, String telephone, int zp, int age) {

        this.name = name;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.zp= zp;
        this.age = age;


    }

}
