package AbstractFactory.App;

import AbstractFactory.GardenCreator.GardenBuilder;
import AbstractFactory.GardenCreator.IranianGardenBuilder;
import AbstractFactory.GardenCreator.JapaneseGardenBuilder;

public class Client {
    public static void main(String[] args) {
        Handler handler;
        GardenBuilder gb;
        String country = "Japan";

        if(country.contains("Iran")){
            gb = new IranianGardenBuilder();
            handler = new Handler(gb);
        }else {
            gb = new JapaneseGardenBuilder();
            handler = new Handler(gb);
        }
        handler.create();
    }
}
