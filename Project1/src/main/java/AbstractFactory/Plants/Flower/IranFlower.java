package AbstractFactory.Plants.Flower;

public class IranFlower implements Flower{
    @Override
    public void create() {
        System.out.println("Iranian flower created");
    }
}
