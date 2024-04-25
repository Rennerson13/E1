package forms.com.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CasaController {
    private ObservableList<String> casasCadastradas = FXCollections.observableArrayList();

    @FXML
    private TextField tamanhoCasaField;
    @FXML
    private TextField corCasaField;
    @FXML
    private TextField materialField;

    @FXML
    private ListView<String> listViewCasa;

    @FXML
    void handleSendCasa(){
        String tamanho = tamanhoCasaField.getText();
        String cor = corCasaField.getText();
        String material = materialField.getText();

        casasCadastradas.add("Casinha = " + "tamanho: " + tamanho + ", Cor: " + cor + ", Material: " + material);

        listViewCasa.setItems(casasCadastradas);
        exibirDadosTenis(tamanho, cor, material);

        tamanhoCasaField.clear();
        corCasaField.clear();
        materialField.clear();
    }

    public void exibirDadosTenis(String tamanho, String cor, String tinta){
        Stage stage = new Stage();
        stage.setTitle("Sucesso!");

        Label label = new Label("Casinha vendida: \n" + "tamanho: " + tamanho + ", Cor: " + cor + ", Material: " + tinta);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }
    
}

