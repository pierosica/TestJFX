package org.ilpider.testjfx;

import java.util.List;

import org.ilpider.testjfx.model.Giocatore;
import org.ilpider.testjfx.model.Partita;
import org.ilpider.testjfx.view.GiocatoreController;
import org.ilpider.testjfx.view.TestJFXController;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

public class MainTestJFX extends Application {

	private Stage primaryStage; // la finestra dell'applicazione
	private BorderPane root; // il layout del TestJFX.fxml
	private GridPane layoutGiocatore; // il layout che contiene l'arrayGiocatore
	private Partita partita; // il modello della partita
//	private int numeroGiocatori;
	private TestJFXController controllerRoot; // il controller del root
												// (TestJFX.fxml)
	private GiocatoreController controllerGiocatore; // il controller del
														// layoutGiocatore(Giocatore.fxml)

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TestJFX");

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTestJFX.class
					.getResource("view/TestJFX.fxml"));
			root = loader.load();

			controllerRoot = loader.getController();
			controllerRoot.setMainTestJFX(this);
			int numeroGiocatori = controllerRoot.getNumeroGiocatori();
			nuovaPartita(numeroGiocatori);
			controllerRoot.setPartita(partita);

			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("view/application.css")
							.toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public Partita getPartita() {
		return partita;
	}

	public void nuovaPartita(int numeroGiocatori) {
		partita = new Partita(numeroGiocatori);
		controllerRoot.setPartita(partita);
		System.out.println(partita);

		try {
			List<Giocatore> listaGiocatori = partita.getListaGiocatori(numeroGiocatori);

			FXMLLoader loaderLayoutGiocatore = new FXMLLoader();
			loaderLayoutGiocatore.setLocation(MainTestJFX.class
					.getResource("view/LayoutGiocatori.fxml"));
			layoutGiocatore = (GridPane) loaderLayoutGiocatore.load();

			System.out.println();

			for (Giocatore g : listaGiocatori) {
				System.out.println(g.getNome());

				// Load Giocatore overview.
				FXMLLoader loaderGiocatore = new FXMLLoader();
				loaderGiocatore.setLocation(MainTestJFX.class
						.getResource("view/Giocatore.fxml"));
				BorderPane viewGiocatore = (BorderPane) loaderGiocatore.load();
				g.setViewGiocatore(viewGiocatore);
				controllerGiocatore = loaderGiocatore.getController();
				controllerGiocatore.setNomeGiocatore("Questo è il giocatore "
						+ g.getNome());

				layoutGiocatore.add(g.getViewGiocatore(), g.getID(), 0);

			}
			root.setCenter(layoutGiocatore);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
