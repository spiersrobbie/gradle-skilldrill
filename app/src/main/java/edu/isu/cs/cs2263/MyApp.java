package edu.isu.cs.cs2263;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import java.util.List;

public class MyApp extends Application{

    public void start(Stage stage) throws Exception {
        Label label = new Label("Students");

        ListView<Student> listView = new ListView<Student>();
        ListView<Course> listCourses = new ListView<Course>();

        VBox leftLayout = new VBox(10);
        leftLayout.getChildren().addAll(label, listView);
        VBox rightLayout = new VBox(10);
        Button buttonSet = new Button("Load Data");
        rightLayout.getChildren().addAll(new Label("Courses"), listCourses, buttonSet);
        HBox layout = new HBox(10);
        layout.getChildren().addAll(leftLayout, new Label("Is taking"), rightLayout);

        Scene scene = new Scene(layout, 595, 200);
        stage.setTitle("Course View");
        stage.setScene(scene);
        stage.show();

        buttonSet.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                List<Student> students = IOManager.readData("CourseRegistration");
                ObservableList<Student> obsStudents = FXCollections.observableArrayList(students);
                listView.setItems(obsStudents);
            }
        });

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            ObservableList<Course> obsCourses = FXCollections.observableArrayList(newValue.getCourses());
            listCourses.setItems(obsCourses);
        });
    }

    public static void main(String[] args){
        Application.launch(args);
    }

}
