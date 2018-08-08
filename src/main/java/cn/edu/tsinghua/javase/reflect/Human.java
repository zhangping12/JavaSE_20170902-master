package cn.edu.tsinghua.javase.reflect;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 21:45 27 Oct 2017
 */

// class = field + method
public class Human extends Animal {
    public String name; // public filed
    private boolean married;

    Human() { // package-private constructor

    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is now eating " + food);
    }

    public void study(String course, int hours) {
        System.out.println(name + " is now studying " + course + ", for " + hours + "hours.");
    }

    private void killAnimal(String animal) { // private method
        System.out.println(name + " is now killing " + animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
