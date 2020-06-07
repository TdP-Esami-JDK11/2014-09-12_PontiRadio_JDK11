package it.polito.tdp.pontiradio;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.pontiradio.model.Model;
import javafx.fxml.FXML;

public class FXMLController {

	private Model model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
