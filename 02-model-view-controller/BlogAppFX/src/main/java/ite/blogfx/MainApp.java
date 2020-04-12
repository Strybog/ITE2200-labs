package ite.blogfx;

import ite.blog.repository.PostRepository;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.sql2o.Sql2o;

public class MainApp extends Application {

    private static Scene scene;
    private final static Sql2o DB = new Sql2o("jdbc:postgresql://localhost:5432/blog", "postgres", "postgres");
    public static final PostRepository REPO = new PostRepository(DB);
    
    @Override
    public void start(Stage stage) throws IOException {

        scene = new Scene(loadFXML("Main"));

        stage.setTitle("Blog App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }


}
