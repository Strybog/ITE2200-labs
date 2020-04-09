/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ite.blog.repository;

import ite.blog.model.database.dao.PostDAO;
import ite.blog.model.database.dto.PostDTO;
import java.util.List;
import java.util.Optional;
import org.sql2o.Sql2o;

/**
 *
 * @author amritaramnauth
 */
public class PostRepository {

    private final Sql2o db;
    private final PostDAO postDAO;

    public PostRepository(Sql2o db) {
        this.db = db;
        this.postDAO = new PostDAO(db);
    }

    public PostDTO createPost(PostDTO newPost) {
        return postDAO.create(newPost);
    }

    public List<PostDTO> listPosts() {
        return postDAO.findAll();
    }

    public PostDTO getPost(int id) {
        return postDAO.findOne(id);
    }
    
    public boolean deletePost(PostDTO oldPost) {
        return postDAO.delete(oldPost.getId());
    }
    
    public PostDTO updatePost(PostDTO updatedPost) {
        return postDAO.update(updatedPost);
    }

}
