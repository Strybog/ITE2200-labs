/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ite.blog.model.database.dao;

import ite.blog.model.database.dto.PostDTO;
import java.util.List;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

/**
 *
 * @author amritaramnauth
 */
public class PostDAO {

    private Sql2o db;

    public Sql2o getDb() {
        return db;
    }

    public void setDb(Sql2o db) {
        this.db = db;
    }

    public final static String CREATE_POST
            = "INSERT INTO post (title, description, author)"
            + " VALUES (:title, :description, :author)";
    public final static String GET_POST = "SELECT * FROM post WHERE id = :id";
    public final static String GET_POSTS = "SELECT * FROM post";
    public final static String UPDATE_POST = "UPDATE post SET title = :title, description = :description, author = :author WHERE id = :id";
    public final static String DELETE_POST = "DELETE FROM post WHERE id = :id";

    public PostDAO(Sql2o db) {
        this.db = db;
    }

    // create post
    public PostDTO create(PostDTO newPost) {
        try ( Connection con = db.open()) {
            Query query = con.createQuery(CREATE_POST, true);
            Query bindQuery = query.bind(newPost);
            Connection connection = bindQuery.executeUpdate();
            int id = (int) connection.getKey();
            PostDTO createdPost = findOne(id);
            return createdPost;
        }
    }

    // get post by id
    public PostDTO findOne(int id) {
        try ( Connection con = db.open()) {
            Query query = con.createQuery(GET_POST);
            Query parameterQuery = query.addParameter("id", id);
            PostDTO post = parameterQuery.executeAndFetchFirst(PostDTO.class);
            return post;
        }
    }
    
    // get list of posts
    public List<PostDTO> findAll() {
        try ( Connection con = db.open()) {
            Query query = con.createQuery(GET_POSTS);
            List<PostDTO> posts = query.executeAndFetch(PostDTO.class);
            return posts;
        }
    }
    
    // update post by id
    public PostDTO update(PostDTO updatePost) {
        try ( Connection con = db.open()) {
            Query query = con.createQuery(UPDATE_POST, true);
            Query bindQuery = query.bind(updatePost);
            Connection connection = bindQuery.executeUpdate();
            int id = (int) connection.getKey();
            PostDTO updatedPost = findOne(id);
            return updatedPost;
        }
    }

    // delete post by id
    public boolean delete(int id) {
        try ( Connection con = db.open()) {
            con.createQuery(DELETE_POST)
                    .addParameter("id", id)
                    .executeUpdate()
                    .getResult();
            return true;
        }
    }

}
