import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;

public class MainUI {

    private BorderPane mainPane;

    public MainUI() {
        mainPane = new BorderPane();

        // Example menu bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        mainPane.setTop(menuBar);

        // Example table view for displaying parts
        TableView<Part> partsTable = new TableView<>();
        partsTable.getColumns().addAll(
            createColumn("Part Name", "name", 200),
            createColumn("Category", "category", 150),
            createColumn("Price", "price", 100)
        );

        mainPane.setCenter(partsTable);
    }

    public BorderPane getMainPane() {
        return mainPane;
    }

    private TableColumn<Part, String> createColumn(String title, String property, int width) {
        TableColumn<Part, String> column = new TableColumn<>(title);
        column.setPrefWidth(width);
        column.setCellValueFactory(new PropertyValueFactory<>(property));
        return column;
    }
}
