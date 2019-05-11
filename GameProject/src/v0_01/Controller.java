package v0_01;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller {
	
	class NewGameButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub	
		}	
	}
	
	class LoadGameButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub	
		}
	}
	class SaveGameButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
		}
	}
	
	class QuitGameButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			Platform.exit();
		}
	}
	class CloseButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub	
		}
	}
	
}
