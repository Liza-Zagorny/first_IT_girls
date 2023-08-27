package domain.company.app.entity;

public class Goat extends AbstractAnimal {
    @Override
    void voice() {
        System.out.println("Я козочка и я говорю мээ-мээ");
    }

    @Override
    void walk() {
        super.walk("козочка");
    }
}
