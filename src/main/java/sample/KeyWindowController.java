package sample;
import com.google.gson.Gson;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.*;
import java.net.URL;
import java.util.*;

public class KeyWindowController implements Initializable {

    String path = "/Users/buciladinara/Desktop/audit/SecurityPoliciesProject/src/sample/file.json";
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
    Gson gson = new Gson();
    HashMap<String, HashMap> json = gson.fromJson(bufferedReader, HashMap.class);
    Map<String, HashMap> map = json;
    Data data = new Data();

    @FXML
    private TableView<Data> table;

    @FXML
    private TableColumn<Data, String> reference;

    @FXML
    private TableColumn<Data, String> value_type;

    @FXML
    private TableColumn<Data, String> solution;

    @FXML
    private TableColumn<Data, String> reg_item;

    @FXML
    private TableColumn<Data, String> reg_option;

    @FXML
    private TableColumn<Data, String> description;

    @FXML
    private TableColumn<Data, String> value_data;

    @FXML
    private TableColumn<Data, String> reg_key;

    @FXML
    private TableColumn<Data, String> type;

    @FXML
    private TableColumn<Data, String> see_also;

    @FXML
    private TableColumn<Data, String> info;

    @FXML
    private TextField textField;

    public KeyWindowController() throws IOException {
    }
    @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<Data> list = FXCollections.observableArrayList(Data.getTheList(data,map));

            reference.setCellValueFactory(new PropertyValueFactory<>("reference"));
            value_type.setCellValueFactory(new PropertyValueFactory<>("value_type"));
            solution.setCellValueFactory(new PropertyValueFactory<>("solution"));
            reg_item.setCellValueFactory(new PropertyValueFactory<>("reg_item"));
            reg_option.setCellValueFactory(new PropertyValueFactory<>("reg_option"));
            description.setCellValueFactory(new PropertyValueFactory<>("description"));
            value_data.setCellValueFactory(new PropertyValueFactory<>("value_data"));
            reg_key.setCellValueFactory(new PropertyValueFactory<>("reg_key"));
            type.setCellValueFactory(new PropertyValueFactory<>("type"));
            see_also.setCellValueFactory(new PropertyValueFactory<>("see_also"));
            info.setCellValueFactory(new PropertyValueFactory<>("info"));
            table.setItems(list);


        FilteredList<Data> filteredData = new FilteredList<>(list,b->true);
        textField.textProperty().addListener((observable, oldValue, newValue) ->{
            filteredData.setPredicate(ob ->{
                if(newValue.isEmpty() || newValue.isBlank()){
                    return true;
                }
                String searchKeyWord = newValue.toLowerCase();

                if(ob.getDescription().toLowerCase().contains(searchKeyWord)){
                    return true;
                }else return false;
            });
        });

        SortedList<Data> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(table.comparatorProperty());
        table.setItems(sortedData);

       

    }
}

