
package nsis.app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import nsis.metier.Maillon;
import nsis.metier.Pile;
import nsis.metier.exception.PileVideException;

public class PileJavaFXApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
    //Créer un template de pile 
    Pile<String,Maillon<String>> pile = new Pile<String,Maillon<String>>();
    
    //Création d'un champ de texte
    TextField tf = new TextField ();
    //création d'un label
     Label lbl = new Label();

     //Création du boutton empiler 
    Button btnEmpiler = new Button();
    //Création du boutton dépiler
    Button btnDepiler = new Button();
   
    //Donner un titre à la fenêtre
    primaryStage.setTitle("Hello la Pile sous JavaFX");

    //Placer le champ de texte dans la fenêtre
    tf.setLayoutX(70);
    tf.setLayoutY(10);
  //Placer les bouttons dans la fenêtre
    btnEmpiler.setLayoutX(70);
    btnEmpiler.setLayoutY(50);
    //Nommer le boutton
    btnEmpiler.setText("Empiler");
    
   //Configurer les actions du boutton empiler
    btnEmpiler.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
       
        pile.empiler(tf.getText());
        tf.setText("");
        
      }
    });
    
  //placer le label
    lbl.setLayoutX(70);
    lbl.setLayoutY(150);
    
   //placer le boutton dépiler
    btnDepiler.setLayoutX(70);
    btnDepiler.setLayoutY(100);
    
  //Nommer le boutton
    btnDepiler.setText("Dépiler");
    
  //Configurer les actions du boutton dépiler
    btnDepiler.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        try {
   lbl.setText(pile.depiler());
  } catch (PileVideException e) { //Gestion de l'erreur lors de la dépilation d'un pile vide
     final Stage dialog = new Stage();
              dialog.initModality(Modality.APPLICATION_MODAL);
              dialog.initOwner(primaryStage);
              VBox dialogVbox = new VBox(20);
               dialogVbox.getChildren().add(new Text("Plus rien dans la pile"));
              Scene dialogScene = new Scene(dialogVbox, 300, 200, Color.DARKOLIVEGREEN);
              dialog.setScene(dialogScene);
              dialog.show();
  }
      }
    });

    //créer un groupe
    Group root = new Group();

    //connecter les éléments au groupe 
    root.getChildren().add(btnEmpiler);
    root.getChildren().add(btnDepiler);
    root.getChildren().add(lbl);
    root.getChildren().add(tf);
      
    //Création de la scène
    primaryStage.setScene(new Scene(root, 300, 250));
    //Afficher la fenêtre
    primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    //Point d'entré du programme
    public static void main(String[] args) {
        launch(args);
    }
    
}