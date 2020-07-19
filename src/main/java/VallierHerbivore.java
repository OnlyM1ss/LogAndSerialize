import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class VallierHerbivore extends Herbivore {
    /*
     * Жираф
     * Лемур
     * Утка(обязательно*)*/
    Logger logger = LogManager.getLogger();
    ArrayList<String> giraffeAll = new ArrayList<String>();
    ArrayList<String> lemurAll = new ArrayList<String>();
    ArrayList<String> duckAll = new ArrayList<String>();

    public void giraffe() throws EatException {
        if (!giraffeAll.isEmpty()) {
            System.out.println(move());
        } else {
            addAnimal();
        }
    }

    public void lemur() throws EatException {
        if (!lemurAll.isEmpty()) {
            System.out.println(move());
        } else {
            addAnimal();
        }


    }

    public void duck() throws EatException {
        if (!duckAll.isEmpty()) {
            System.out.println(move());
        } else {
            addAnimal();
        }

    }

    @Override
    protected void addAnimal() {
        String type = "";
        switch (HelpFunc.randomInt(1, 4)) {
            case (1):
                type = "Жираф " + HelpFunc.takeName();
                giraffeAll.add(type);
                logger.info(type + "Добавлено");
            case (2):
                type = "Лемур " + HelpFunc.takeName();
                lemurAll.add(type);
                logger.info(type + "Добавлено");

            case (3):
                type = "Утка " + HelpFunc.takeName() + " ";
                duckAll.add(type);
                System.out.println(type + " Добавлено!");
                logger.info(" Количество уток: " + duckAll.size() + " Количество Лемуров: " + lemurAll.size()
                        + " Количество  Жирафов:" + giraffeAll.size());
            case (4):
                logger.error("Вальер переполнен! :c");
        }
    }

    public void chouseHerbivore() throws EatException {
        switch (HelpFunc.randomInt(1, 3)) {
            case (1):
                giraffe();
            case (2):
                lemur();
            case (3):
                duck();
        }
    }
}
