package AbstractFactory;


import org.junit.Test;
import AbstractFactory.GardenCreator.IranianGardenBuilder;
import AbstractFactory.GardenCreator.JapaneseGardenBuilder;
import AbstractFactory.Plants.Flower.IranFlower;
import AbstractFactory.Plants.Flower.JapaneseFlower;
import AbstractFactory.Plants.Tree.IranTree;
import AbstractFactory.Plants.Tree.JapaneseTree;
import static org.junit.Assert.*;


public class GardenCreatorTests {
    @Test
    public void iranianGardenBuilderCreatesIranianFlower() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        IranFlower iranFlower = (IranFlower) iranianGardenBuilder.createFlower();
        String gotMessage = iranFlower.getMessage();
        String expectedMessage = "Iranian flower created";
        assertEquals(gotMessage, expectedMessage);
    }

    @Test
    public void iranianGardenBuilderDoesNotCreateJapaneseFlower() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        assertThrows(ClassCastException.class, () -> {
            JapaneseFlower japaneseFlower = (JapaneseFlower) iranianGardenBuilder.createFlower();
        });
    }

    @Test
    public void japaneseGardenBuilderCreatesJapaneseFlower() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        JapaneseFlower japaneseFlower = (JapaneseFlower) japaneseGardenBuilder.createFlower();
        String gotMessage = japaneseFlower.getMessage();
        String expectedMessage = "Japanese flower created";
        assertEquals(gotMessage, expectedMessage);
    }

    @Test
    public void japaneseGardenBuilderDoesNotCreateIranianFlower() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        assertThrows(ClassCastException.class, () -> {
            IranFlower iranFlower = (IranFlower) japaneseGardenBuilder.createFlower();
        });
    }

    @Test
    public void iranianGardenBuilderCreatesIranianTree() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        IranTree iranTree = (IranTree) iranianGardenBuilder.createTree();
        String gotMessage = iranTree.getMessage();
        String expectedMessage = "Iranian tree created";
        assertEquals(gotMessage, expectedMessage);
    }

    @Test
    public void iranianGardenBuilderDoesNotCreateJapaneseTree() {
        IranianGardenBuilder iranianGardenBuilder = new IranianGardenBuilder();
        assertThrows(ClassCastException.class, () -> {
            JapaneseTree japaneseTree = (JapaneseTree) iranianGardenBuilder.createTree();
        });
    }

    @Test
    public void japaneseGardenBuilderCreatesJapaneseTree() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        JapaneseTree japaneseTree = (JapaneseTree) japaneseGardenBuilder.createTree();
        String gotMessage = japaneseTree.getMessage();
        String expectedMessage = "Japanese tree created";
        assertEquals(gotMessage, expectedMessage);
    }

    @Test
    public void japaneseGardenBuilderDoesNotCreateIranianTree() {
        JapaneseGardenBuilder japaneseGardenBuilder = new JapaneseGardenBuilder();
        assertThrows(ClassCastException.class, () -> {
            IranTree iranTree = (IranTree) japaneseGardenBuilder.createFlower();
        });
    }
}
