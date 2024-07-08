package hw_8;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        Lecture30.finishWork(browser);
        Lecture30.finishWork(file);

        SessionCloser sessionCloser = entities -> {
            for (CanBeClosed entity : entities) {
                entity.close();
            }
        };

        List<CanBeClosed> entities = new ArrayList<>();
        entities.add(browser);
        entities.add(file);

        sessionCloser.closeSession(entities);

    }
}
