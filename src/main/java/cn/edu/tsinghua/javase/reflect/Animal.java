package cn.edu.tsinghua.javase.reflect;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:41 27 Oct 2017
 */
public class Animal extends Object {
    public int age; // public field
    private double weight;

    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours) {
        return hours;
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    private void killHuman() { // private method
        System.out.println("killed a poor guy...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
