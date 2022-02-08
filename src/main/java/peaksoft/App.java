package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person1 = context.getBean("myPerson1",Person.class);
        System.out.println(person1.getName() + person1.getAnimal().animalPlus());

        Person person2 = context.getBean("myPerson2",Person.class);
        System.out.println(person2.getName() + person2.getAnimal().animalPlus());
    }
}
