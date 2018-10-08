package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane leftGridPane = new GridPane();
        leftGridPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        leftGridPane.setPadding(new Insets(5));
        leftGridPane.setVgap(0);
        leftGridPane.setHgap(5);

        Label labelR = new Label("Narzędzia");
        leftGridPane.add(labelR, 0, 0);

        GridPane rightGridPane = new GridPane();
        rightGridPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        rightGridPane.setPadding(new Insets(5));
        rightGridPane.setVgap(5);
        rightGridPane.setHgap(5);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setMaxWidth(300);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setMaxWidth(300);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setMaxWidth(300);
        rightGridPane.getColumnConstraints().addAll(column1, column2, column3);

        Label labelL = new Label("Pole tekstowe");
        rightGridPane.add(labelL, 0, 0);

        TextArea text = new TextArea("To jest tekst przykładowy...");
        rightGridPane.add(text, 0, 1);
        rightGridPane.setVgrow(text, Priority.ALWAYS);

        Button btn1 = new Button();
        btn1.setText("Wstaw plik");
        btn1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn1, Priority.ALWAYS);
        leftGridPane.add(btn1, 0, 1);

        Button btn2 = new Button();
        btn2.setText("Usuń tekst");
        btn2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn2, Priority.ALWAYS);
        leftGridPane.add(btn2, 0, 2);

        Button btn3 = new Button();
        btn3.setText("Uruchom");
        btn3.setDisable(true);
        btn3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn3, Priority.ALWAYS);
        leftGridPane.add(btn3, 0, 3);

        Button btn4 = new Button();
        btn4.setText("Zapisz plik");
        btn4.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn4, Priority.ALWAYS);
        leftGridPane.add(btn4, 0, 4);

        Button btn5 = new Button();
        btn5.setText("Pomoc");
        btn5.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn5, Priority.ALWAYS);
        leftGridPane.add(btn5, 0, 5);

        Button btn6 = new Button();
        btn6.setText("O programie");
        btn6.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn6, Priority.ALWAYS);
        leftGridPane.add(btn6, 0, 6);

        Button btn7 = new Button();
        btn7.setText("Koniec");
        btn7.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        leftGridPane.setHgrow(btn7, Priority.ALWAYS);
        leftGridPane.add(btn7, 0, 7);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(leftGridPane);
        borderPane.setRight(rightGridPane);
        borderPane.setPadding(new Insets(5));
        borderPane.setMaxHeight(Double.MAX_VALUE);

        Scene scene = new Scene(borderPane, 460, 225);

        primaryStage.setTitle("Przetwarzanie plików i tekstów");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
