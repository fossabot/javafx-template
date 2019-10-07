package JAVA_PACKAGE_PLACEHOLDER;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main application entry point.
 * @author Steffen Schön
 */
public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    // TODO: startup application

    primaryStage.show();
    primaryStage.centerOnScreen();
  }
}
