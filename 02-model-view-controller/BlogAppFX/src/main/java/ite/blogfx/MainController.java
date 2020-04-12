package ite.blogfx;

import ite.blog.model.database.dto.PostDTO;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {

    @FXML
    private TableView<PostDTO> postTable;

    // <column type, table type>
    @FXML
    private TableColumn<Integer, PostDTO> postIdColumn;

    @FXML
    private TableColumn<String, PostDTO> postTitleColumn;

    @FXML
    private TableColumn<String, PostDTO> postDescriptionColumn;

    @FXML
    private TableColumn<String, PostDTO> postAuthorColumn;

    @FXML
    void showCreatePost(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CreatePost.fxml"));

        // change view by changing the root of your scene
        postTable.getScene().setRoot(loader.load());

        PostController controller = loader.<PostController>getController();
        controller.setPostAction(PostAction.CREATE_POST);

    }

    @FXML
    void deletePost(ActionEvent event) throws IOException {

        PostDTO postSelected = this.postTable.getSelectionModel().getSelectedItem();
        
        new Thread(() -> {
            // delete post in new thread
            MainApp.REPO.deletePost(postSelected);
            ObservableList<PostDTO> postTableData = this.postTable.getItems();
            
            // update UI view with removed post
            Platform.runLater(() -> postTableData.remove(postSelected));      
        }).start();
        
    }

    @FXML
    void showUpdatePost(ActionEvent event) throws IOException {

        PostDTO selectedPost = this.postTable.getSelectionModel().getSelectedItem();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CreatePost.fxml"));

        // change view by changing the root of your scene
        postTable.getScene().setRoot(loader.load());

        PostController controller = loader.<PostController>getController();
        controller.setPostLabelText("Update Post");
        controller.setPostText(selectedPost);
        controller.setPostAction(PostAction.UPDATE_POST);   
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // initialize table columns
        this.postIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.postTitleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        this.postDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        this.postAuthorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        loadPosts();
    }

    public void loadPosts() {
        new Thread(() -> {
            List<PostDTO> posts = MainApp.REPO.listPosts();
            ObservableList<PostDTO> postTableData = this.postTable.getItems();
            Platform.runLater(() -> postTableData.addAll(posts));
        }).start();

    }

}
