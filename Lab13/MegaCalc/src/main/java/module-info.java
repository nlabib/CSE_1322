module com.example.megacalc {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.example.megacalc to javafx.fxml;
	exports com.example.megacalc;
}