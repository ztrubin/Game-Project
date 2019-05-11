package v0_01;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class View {
	BorderPane root = new BorderPane();

	//Start scene
	Label gameNameLabel = new Label("Bit Maker");
	Button newGameButton = new Button("New Game");
	Button loadGameButton = new Button("Load Game");
	Button quitGameButton = new Button("Quit Game");
	HBox mainMenuBox = new HBox(newGameButton, loadGameButton, quitGameButton);
	
	
	
	BorderPane setupStartScene() {
		BorderPane startPane = new BorderPane();
		gameNameLabel.setPrefSize(400, 100);
		gameNameLabel.setStyle("-fx-font: 28 arial;");
		gameNameLabel.setAlignment(Pos.CENTER);
		
		newGameButton.setPrefSize(120, 20);
		loadGameButton.setPrefSize(120, 20);
		quitGameButton.setPrefSize(120, 20);
		
		mainMenuBox.setSpacing(15);
		mainMenuBox.setPadding(new Insets(10, 10, 10, 10));
		
		startPane.setTop(gameNameLabel);
		startPane.setCenter(mainMenuBox);
		startPane.setMaxSize(Game.START_SCREEN_WIDTH, Game.START_SCREEN_HEIGHT);
		startPane.setPrefSize(Game.START_SCREEN_WIDTH, Game.START_SCREEN_HEIGHT);
		Background b = new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY));
		startPane.setBackground(b);	
		return startPane;
	}

	BorderPane setupMainScene() {
		BorderPane mainPane = new BorderPane();
		
		
		
		
		return mainPane;
	}
}
