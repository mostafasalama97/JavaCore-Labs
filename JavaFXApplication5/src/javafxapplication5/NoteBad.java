package javafxapplication5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
        BorderPane pane = new BorderPane(); 
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
//===============================================================================
        fopen.setOnAction((ActionEvent event) -> {
            System.out.println("Open menu item clicked");
        });
        //=========================================================================
         fopen.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory(new File(System.getProperty("user.home"))); // Set initial directory to user's home directory
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt")); // Add a filter for text files

            File selectedFile = fileChooser.showOpenDialog(primaryStage);
                try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                    // Read the contents of the file into a string
                    StringBuilder stringBuilder = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        stringBuilder.append(line);
                        stringBuilder.append(System.lineSeparator());
                    }
                    String fileContents = stringBuilder.toString();

                    // Display the contents of the file in a text area
                    TextArea textArea2 = new TextArea();
                    textArea.setText(fileContents);
                    pane.setCenter(textArea);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        });
        
//===============================================================================
            
            fsave.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory(new File(System.getProperty("user.home"))); // Set initial directory to user's home directory
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt")); // Add a filter for text files
            File selectedFile = fileChooser.showSaveDialog(primaryStage);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                    // Get the text from the text area
                    TextArea textArea1 = new TextArea();
                    String text = textArea.getText();

                    // Write the text to the file
                    writer.write(text);
                    writer.flush();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
        });
        //=======================================================================
        fexit.setOnAction((ActionEvent event) -> {
            System.exit(0);
            primaryStage.close();
        });
        eundo.setOnAction((ActionEvent event) -> {
            System.out.println("Undo menu item clicked");
            textArea.undo();
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
            textArea.paste();
        });
        eselect.setOnAction((ActionEvent event) -> {
            System.out.println("Select All menu item clicked");
            textArea.selectAll();
        });

        edelete.setOnAction((ActionEvent event) -> {
            System.out.println("Delete menu item clicked");
            textArea.deletePreviousChar();
        });
//==============================================================================
        Habout.setOnAction((ActionEvent event) -> {
            System.out.println("About Maker menu item clicked");
            
        });
        Alert a = new Alert(AlertType.NONE);
 
        // action event
        EventHandler<ActionEvent> event = new
                         EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // set alert type
                a.setAlertType(AlertType.INFORMATION);
                a.setContentText("Mostafa_Salama-IOT_Track");
                // show the dialog
                a.show();
            }
        };
        
         Habout.setOnAction(event);
         
         //=================================================================
//        BorderPane pane = new BorderPane();
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
