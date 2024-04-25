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

public class CaoController {
    private ObservableList<String> caoCadastrados = FXCollections.observableArrayList();
    
    @FXML
    private TextField racaField;
    @FXML
    private TextField corField;
    @FXML
    private TextField idadeField;

    @FXML
    private ListView<String> listViewCao;

    @FXML
    void handleSendCao(){
        String raca = racaField.getText();
        String cor = corField.getText();
        String idade = idadeField.getText();

        caoCadastrados.add("Cachorro - " + "Raça: " + raca + ", Idade: " + idade + ", Cor: " + cor);

        listViewCao.setItems(caoCadastrados);
        exibirDadosCarro(raca, idade, cor);

        racaField.clear();
        idadeField.clear();
        corField.clear();
    }

    public void exibirDadosCarro(String raca, String idade, String cor){
        Stage stage = new Stage();
        stage.setTitle("Parabéns");

        Label label = new Label("Adoção concluída: \n" + "Raça: " + raca + ", Idade: " + idade + ", Cor: " + cor);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }

    
}
