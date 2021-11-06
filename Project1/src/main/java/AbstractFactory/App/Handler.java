package AbstractFactory.App;

import AbstractFactory.GardenCreator.GardenBuilder;
import AbstractFactory.Plants.Flower.Flower;
import AbstractFactory.Plants.Tree.Tree;

public class Handler {
    private Flower flower;
    private Tree tree;

    public Handler(GardenBuilder gardenBuilder){
        flower = gardenBuilder.createFlower();
        tree = gardenBuilder.createTree();
    }
    public void create(){
        flower.getMessage();
        tree.getMessage();

    }
}
