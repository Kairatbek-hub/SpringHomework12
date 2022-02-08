package peaksoft;

public class Dog implements Animal {
    private String name;
    private String breed;
    private String colour;
    private int age;

    public Dog() {
    }

    public Dog(String name, String breed, String colour, int age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.age = age;
    }

    @Override
    public String animalPlus() {
        return " : likes " + toString();
    }
    @Override
    public String animalMinus() {
        return " : does not like " + toString();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
