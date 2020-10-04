package ehu.isad;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import com.google.gson.Gson;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class ComboBoxExperiments extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Txanponen ariketa");

        ComboBox comboBox = new ComboBox();

        comboBox.getItems().add("BTC");
        comboBox.getItems().add("ETH");
        comboBox.getItems().add("LTC");

        comboBox.setEditable(true);

        Label labela = new Label();
        Gson gson = new Gson();

        comboBox.setOnAction(e -> {
            System.out.println( comboBox.getValue());
            String emaitza = this.getString((String)comboBox.getValue());
            Txanpona txanpona = gson.fromJson(emaitza, Txanpona.class);
            labela.setText("1 "+(String)comboBox.getValue()+"= "+txanpona.price);
        });

        VBox vbox = new VBox(labela, comboBox);
        Scene scene = new Scene(vbox, 200, 120);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
        primaryStage.setScene(scene);
        primaryStage.show();



    public static void main(String[] args) {
        Application.launch(args);
    }
    public class Txanpona {
        float prezioa;
    }
}


