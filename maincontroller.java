import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableView<CurrencyData> currencyTableView;

    @FXML
    private TableColumn<CurrencyData, String> currencyColumn;

    @FXML
    private TableColumn<CurrencyData, Double> rateColumn;

    private final ApiController apiController = new ApiController();

    @FXML
    public void initialize() {
        currencyColumn.setCellValueFactory(new PropertyValueFactory<>("currency"));
        rateColumn.setCellValueFactory(new PropertyValueFactory<>("rate"));
    }

    @FXML
    public void handleFetchData() {
        currencyTableView.setItems(apiController.fetchCurrencyData());
    }
}
