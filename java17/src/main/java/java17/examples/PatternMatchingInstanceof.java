package java17.examples;

public class PatternMatchingInstanceof {
    /*
        Java 16:
        Pattern Matching on instanceof allows us to cast our variable inline and use it inside the if-else block w/o explicitly casting it
     */
    public static void main(String[] args) {

    }

    /*
        Without pattern matching, after checking instanceof, we need to explicitly cast it to the correct type.
     */
    public static void checkInstanceOfOld(Animal a) {
        if (a instanceof Dog) {
            var dog = (Dog) a;
            dog.bark();
        } else if (a instanceof Cat) {
            var cat = (Cat) a;
            cat.meow();
        }
    }

    /*
        By using pattern matching on the instanceof, we can reduce the boilerplate code from the above.
        However, note that the scope of the casted variable is limited to within it's corresponding if-else block
     */
    public static void checkInstanceOfNew(Animal a) {
        if (a instanceof Dog dog) {
            dog.bark();
        } else if (a instanceof Cat cat) {
            cat.meow();
        }
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(this.getName() + " is barking");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(this.getName() + " is meowing");
    }
}