package domain.company.app.entity;

public class Rabbit extends AbstractAnimal {
    @Override
    void voice() {
        System.out.println("Я зайчик и я молчу");
    }

    @Override
    void walk() {
        System.out.println("Я не хожу, а прыгаю: прыг-скок");
    }
}
