import javax.swing.text.html.Option;
import java.io.Console;
import java.util.ArrayList;

public class Start implements StartInterface{

    @Override
    public void start() {

        while (true){
            showMenu();


        }
    }


    private static final String WELCOME_MESSAGE = """
            **************************************************************************
            ************ Добро пожаловать на сайт отеля "Путешественник"! ************
            **************************************************************************
            """;
    private void showMenu() {
        System.out.println(WELCOME_MESSAGE);
        System.out.println("Выберете нужное Вам действие: ");
    }
}
