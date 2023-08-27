package domain.company.app.entity;
public class Zookeeper {
    public void makeSound(AbstractAnimal animal) {
        System.out.println("Я смотритель за животными в зоопарке и сейчас я попрошу " + animal.name.substring(0, animal.name.length() - 1) + "y выполнить команду ГОЛОС:");
        animal.voice();
    }
    public void takeWalk(AbstractAnimal animal) {
        System.out.println("Я смотритель за животными в зоопарке и сейчас я поведу гулять " + animal.name.substring(0, animal.name.length() - 1) + "y:");
        animal.walk();
    }
}
