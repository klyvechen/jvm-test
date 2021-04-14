package rm.project;


import javax.lang.model.element.Element;

class Animal {
    public void eat() {
        System.out.println("動物吃東西");
    }
}

interface Huntable {
    void hunt();
}

class Cat extends Animal implements Huntable {

    public Cat() {
        super(); // 早期綁定
    }

    public Cat(String name) {
        this(); // 早期綁定
    }

    @Override
    public void eat() {
        System.out.println("貓吃魚");
    }

    @Override
    public void hunt() {
        System.out.println("貓抓耗子，天經地義");
    }
}

class Dog extends Animal implements Huntable {

    @Override
    public void eat() {
        System.out.println("狗吃骨頭");
    }

    @Override
    public void hunt() {
        System.out.println("狗補耗子，多管閒事");
    }
}

class Elephant extends Animal implements Huntable {

    @Override
    public void eat() {
        System.out.println("我只吃草");
    }

    @Override
    public void hunt() {
        System.out.println("討伐獅子");
    }

    final public void fly() {

    }
}

public class AnimalTest {

    public void showAnimal(Animal a) {
        a.eat();
    }

    public void showHunt(Huntable h) {
        h.hunt();
    }

    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.eat();
        e.hunt();
        e.fly();
    }
}
