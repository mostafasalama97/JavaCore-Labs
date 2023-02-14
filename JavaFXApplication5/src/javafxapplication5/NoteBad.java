package javafxapplication5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class NoteBad extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextArea textArea = new TextArea();

        MenuBar bar1 = new MenuBar();
        Menu File = new Menu("file");
        MenuItem fnew = new MenuItem("new");
        MenuItem fopen = new MenuItem("Open");
        MenuItem fsave = new MenuItem("Save");
        MenuItem fexit = new MenuItem("Exit");
        File.getItems().addAll(fnew, fsave, fopen, fexit);
        //=====================================================================
        Menu Edit = new Menu("edit");
        MenuItem eundo = new MenuItem("Undo");
        MenuItem ecut = new MenuItem("Cut");
        MenuItem ecopy = new MenuItem("Copy");
        MenuItem epaste = new MenuItem("Paste");
        MenuItem edelete = new MenuItem("Delete");
        MenuItem eselect = new MenuItem("Select All");
        Edit.getItems().addAll(eundo, ecut, ecopy, epaste, edelete, eselect);
        //===================================================================
        Menu Help = new Menu("Help");
        MenuItem Habout = new MenuItem("About Maker");
        Help.getItems().addAll(Habout);
        //======================================================================
        Menu clear = new Menu("Clear");
        MenuItem cclear = new MenuItem("Clear");
        clear.getItems().addAll(cclear);
        cclear.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
        cclear.setOnAction((ActionEvent t) -> {
            textArea.clear();
        });
        bar1.getMenus().addAll(File, Edit, Help, clear);

        //start text area
//        TextArea textArea = new TextArea();
//
//        VBox vbox = new VBox(textArea);
        fnew.setOnAction((ActionEvent event) -> {
            System.out.println("New menu item clicked");
            textArea.clear();
                
        });

        fopen.setOnAction((ActionEvent event) -> {
            System.out.println("Open menu item clicked");
        });
//===============================================================================
        fsave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    // Open the file dialog to get the file to save to
                    FileChooser fileChooser = new FileChooser();
                    File file = fileChooser.showSaveDialog(null);
                    try ( // Write the contents of the text area to the file
                            FileWriter writer = new FileWriter(file)) {
                        writer.write(textArea.getText());
                    }
                } catch (IOException ex) {
                }
            }
        });
        //=======================================================================
        fexit.setOnAction((ActionEvent event) -> {
            System.exit(0);
        });
        eundo.setOnAction((ActionEvent event) -> {
            System.out.println("Undo menu item clicked");
        });

        ecut.setOnAction((ActionEvent event) -> {
            System.out.println("Cut menu item clicked");
            textArea.cut();
        });

        ecopy.setOnAction((ActionEvent event) -> {
            System.out.println("Copy menu item clicked");
            textArea.copy();
        });

        epaste.setOnAction((ActionEvent event) -> {
            System.out.println("Paste menu item clicked");
        });
        eselect.setOnAction((ActionEvent event) -> {
            System.out.println("Select All menu item clicked");
        });

        edelete.setOnAction((ActionEvent event) -> {
            System.out.println("Delete menu item clicked");
        });

        Habout.setOnAction((ActionEvent event) -> {
            System.out.println("About Maker menu item clicked");
        });
        BorderPane pane = new BorderPane();
        pane.setTop(bar1);

        pane.setCenter(textArea);
        primaryStage.setScene(new Scene(pane, 400, 300));
//    Scene scene = new Scene(pane,300,400);
        primaryStage.setTitle("note bad");
//        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
