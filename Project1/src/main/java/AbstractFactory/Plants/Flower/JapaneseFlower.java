package AbstractFactory.Plants.Flower;

public class JapaneseFlower implements Flower{
    @Override
    public void create() {
        System.out.println("Japanese flower created");
    }
}
