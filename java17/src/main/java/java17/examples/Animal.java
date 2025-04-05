package java17.examples;

/*
    Java 17 - sealed classes that restrict who can extend them
    - allows extension of classes, but only for specified classes
    - subclasses extending this class must add final, sealed or non-sealed modifiers
 */
public sealed abstract class Animal permits Cat, Dog {
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