package domain.company.app.entity;

public class Horse extends AbstractAnimal {

    @Override
    void voice() {
        System.out.println("Я лощадка и я говорю игого!");
    }

    @Override
    void walk() {
        super.walk("лошадка");
        System.out.println("Я умею не только ходить, но и бежать галопом!");

    }
}
