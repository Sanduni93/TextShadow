
package javafx4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250,Color.BLUEVIOLET);
        
        Text text = new Text(250,50,"Hyy I am Sanduni");
        Font font = new Font("Arial black",20);
        text.setFont(font);
        text.setFill(Color.AZURE);
        root.getChildren().add(text);
        
        DropShadow shadow = new DropShadow();
        shadow.setOffsetX(10);
        shadow.setOffsetY(10);
        //shadow.setColor(Color.rgb(30, 30, 30,1));
        shadow.setColor(Color.BEIGE);
        text.setEffect(shadow);
      //  root.getChildren().add(shadow);
        
       primaryStage.setTitle("Learn text in javaFx!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
