package ch.bbz.zins;

import ch.bbz.zins.aufgaben.FunktionaleZinsen;
import ch.bbz.zins.aufgaben.ImperativeZinsen;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ImperativeZinsen imperativeZinsen = new ImperativeZinsen();
        imperativeZinsen.averageYear();
        imperativeZinsen.averageMonth();
        imperativeZinsen.updatedValue();

        FunktionaleZinsen funktionaleZinsen = new FunktionaleZinsen();
        funktionaleZinsen.averageYear();
        funktionaleZinsen.averageMonth();
        funktionaleZinsen.updatedValue();
    }
}

