package day04;

public class UpcastingDowncastingDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eyes = "一双大眼睛";
        animal.see();

        /**
         * 父类不能访问子类特有的属性和方法
         */
//        String wingsOfAnimal = animal.wings;
//        animal.fly();  // create method ...

        Bird bird = new Bird();
        /**
         * 子类可以访问父类的属性、调用父类的方法
         */
        bird.eyes = "一对小眼睛"; // 子类可以访问父类的属性
        bird.see(); // 子类可以调用父类的方法
        /**
         * 还可以访问特有的属性，调用特有的方法
         */
        bird.wings = "一对小翅膀";
        bird.fly();

        /**
         * 子类对象直接赋值给父类引用，这就是向上造型。
         */
        Animal birdAnimal = bird;
        birdAnimal.see();

        /**
         * 把指向子类对象的父类引用 赋值给 子类引用，就是向下转型
         */
        Bird aBird = (Bird) birdAnimal;
        aBird.fly();


    }

}

class Animal {
    String eyes;
    void see() {
        System.out.printf("我用%s看着你%n", eyes);
    }
}

class Bird extends Animal {
    String wings;
    void fly() {
        System.out.printf("我用%s飞翔%n", wings);
    }
}