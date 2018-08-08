package cn.edu.tsinghua.javase.thread;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:16 31 Oct 2017
 */
public class Synchronization {
    public static void main(String[] args) {
        Food water = new Food("water");

        Food fish = new Food("fish");
        Food bone = new Food("bone");

        Cat cat = new Cat("kitty", fish);
        Dog dog = new Dog("tiger", bone);

        cat.start();
        dog.start();
    }
}

class Food {
    private String name;

    Food(String name) {
        this.name = name;
    }

    synchronized void eat1() {
        System.out.println(Thread.currentThread().getName() + " is eating " + name);
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void eat2() {
        // ...
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is eating " + name);
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // ...
    }

    synchronized static void eat3() {
        System.out.println(Thread.currentThread().getName() + " is eating..."); // ?
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Cat extends Thread {
    private Food food;

    Cat(String name, Food food) {
        super(name);
        this.food = food;
    }

    @Override
    public void run() {
//        food.eat1();
//        food.eat2();
        Food.eat3();
    }
}

class Dog extends Thread {
    private Food food;

    Dog(String name, Food food) {
        super(name);
        this.food = food;
    }

    @Override
    public void run() {
//        food.eat1();
//        food.eat2();
        Food.eat3();
    }
}

