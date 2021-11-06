package AbstractFactory.GardenCreator;

import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Flower.JapaneseFlower;
import AbstractFactory.Plants.Tree.JapaneseTree;
import AbstractFactory.Plants.Tree.Tree;

public class JapaneseGardenBuilder extends GardenBuilder {
    @Override
    public Flower createFlower() {
        return new JapaneseFlower();
    }

    @Override
    public Tree createTree() {
        return new JapaneseTree();
    }

}
