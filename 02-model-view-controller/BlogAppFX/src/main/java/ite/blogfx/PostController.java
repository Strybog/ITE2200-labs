package ite.blogfx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import ite.blog.model.database.dto.PostDTO;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class PostController implements Initializable {

    @FXML
    private JFXTextField titleField;

    @FXML
    private JFXTextField authorField;

    @FXML
    private JFXTextArea descriptionField;

    @FXML
    private JFXButton addPostBtn;

    @FXML
    private JFXButton cancelPostBtn;
    
    @FXML
    private Label postLabel;
    
    private PostAction postAction;
    
    private PostDTO postToUpdate;

    @FXML
    void cancelPost(ActionEvent event) throws IOException {
        MainApp.setRoot("Main");
    }

    @FXML
    void savePost(ActionEvent event) throws IOException {

        if (this.getPostAction() == PostAction.CREATE_POST) {
            createPost();
            
            MainApp.setRoot("Main");

        } else if (this.getPostAction() == PostAction.UPDATE_POST) {
            updatePost(this.postToUpdate);

            MainApp.setRoot("Main");
        }

    }

    public void createPost() throws IOException {

        PostDTO newPost = new PostDTO();
        newPost.setTitle(titleField.getText());
        newPost.setAuthor(authorField.getText());
        newPost.setDescription(descriptionField.getText());

        // create post
        MainApp.REPO.createPost(newPost);

    }

    public void updatePost(PostDTO postToUpdate) throws IOException {

        postToUpdate.setTitle(titleField.getText());
        postToUpdate.setAuthor(authorField.getText());
        postToUpdate.setDescription(descriptionField.getText());

        // update post
        MainApp.REPO.updatePost(postToUpdate);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

    public void setPostText(PostDTO post) {
        titleField.setText(post.getTitle());
        descriptionField.setText(post.getDescription());
        authorField.setText(post.getAuthor());
        this.postToUpdate = post;
    }
    
    public void setPostAction(PostAction action) {
        this.postAction = action;
    }
    
    public PostAction getPostAction() {
        return this.postAction;
    }

    public void setPostLabelText(String label) {
        this.postLabel.setText(label);
    }
    
}
