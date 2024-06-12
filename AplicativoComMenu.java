import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AplicativoComMenu extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplicativo com Menu");

        // Cria os itens de menu
        MenuItem menuItem1 = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");

        // Cria os menus
        Menu menu1 = new Menu("Menu 1");
        Menu menu2 = new Menu("Menu 2");

        // Adiciona os itens aos menus
        menu1.getItems().add(menuItem1);
        menu2.getItems().add(menuItem2);

        // Cria a barra de menu e adiciona os menus
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);

        // Cria o layout e adiciona a barra de menu
        VBox vBox = new VBox(menuBar);

        // Cria a cena e adiciona o layout
        Scene scene = new Scene(vBox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}