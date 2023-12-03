package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Qualifier("dog")

    private Animal animal;
    private final Timer t = new Timer();

    public AnimalsCage(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(t.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return t;
    }
}

