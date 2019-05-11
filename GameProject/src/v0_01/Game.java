package v0_01;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {
	static View view = new View();
	static Player player = new Player();
	static Model model = new Model();
	static ObservableMap<String, Item> items = FXCollections.observableHashMap();

	
	Controller controller = new Controller();
	
	
	static final int START_SCREEN_WIDTH = 400;
	static final int START_SCREEN_HEIGHT = 200;
	static final int GAME_SCREEN_WIDTH = 400;
	static final int GAME_SCREEN_HEIGHT = 400;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		items = model.setupItems();
		
		
		view.root.setCenter(view.setupStartScene());
		Background b = new Background(new BackgroundFill(Color.TEAL, 
				CornerRadii.EMPTY, Insets.EMPTY));
		view.root.setBackground(b);
		
		setupBindings();
		Scene startScene = new Scene (view.root, GAME_SCREEN_WIDTH, GAME_SCREEN_HEIGHT);
		stage.setTitle("Bit Maker");
		stage.setScene(startScene);
		stage.show();
		
		
	}
	void setupBindings() {
		view.newGameButton.setOnAction(controller.new NewGameButtonHandler());
		view.loadGameButton.setOnAction(controller.new LoadGameButtonHandler());
		view.quitGameButton.setOnAction(controller.new QuitGameButtonHandler());
	}
}
