package AbstractFactory.GardenCreator;

import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Flower.IranFlower;
import AbstractFactory.Plants.Tree.IranTree;
import AbstractFactory.Plants.Tree.Tree;

public class IranianGardenBuilder extends GardenBuilder{
    @Override
   public Flower createFlower() {
        return new IranFlower();
    }

    @Override
    public Tree createTree() {
        return new IranTree();
    }
}
