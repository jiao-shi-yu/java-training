package day04;

public class UpcastingUseCaseDemo {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("张三", 25, "北京");
        persons[1] = new Student("李四", 21, "上海", "12345");
        persons[2] = new Teacher("王五", 30, "济南", 5000.00);

        for (Person person : persons) {
            person.sayHi();
        }
    }
}


class Person {
    String name;
    int age;
    String address;
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi() {
        System.out.printf("大家好，我叫%s，今年%d岁，家住%s。%n", name, age, address);
    }
}

class Student extends Person {
    String studentId;
    Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }
}

class Teacher extends Person {
    double salary;
    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary  = salary;
    }
}