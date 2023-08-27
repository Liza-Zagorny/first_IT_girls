package domain.company.app._main;

import domain.company.app.entity.Goat;
import domain.company.app.entity.Horse;
import domain.company.app.entity.Rabbit;
import domain.company.app.entity.Zookeeper;

public class _Main {
    public static void main(String[] args) {
        Zookeeper ivan = new Zookeeper();
        Goat goat1 = new Goat();
        Horse horse1 = new Horse();
        Rabbit rabbit1 = new Rabbit();

        goat1.setName("козочка");
        goat1.setWeightKg(19.5D);
        horse1.setName("лошадка");
        horse1.setWeightKg(854.6D);
        rabbit1.setName("зайчишка");
        rabbit1.setWeightKg(1.57D);

        ivan.makeSound(goat1);
        ivan.makeSound(horse1);
        ivan.makeSound(rabbit1);

        ivan.takeWalk(goat1);
        ivan.takeWalk(horse1);
        ivan.takeWalk(rabbit1);

    }
}