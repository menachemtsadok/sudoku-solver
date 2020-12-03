package sudokusolver;

import javafx;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("grid.fxml"));

        primaryStage.setScene(new Scene(root, 1000, 1000));
        primaryStage.show();
    }

    public static void main(String[] args) {
        
        launch(args);
        SudokuSolver solver = new SudokuSolver(); 
    }
}