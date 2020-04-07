/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ite.blog;

import ite.blog.model.database.dao.PostDAO;
import ite.blog.model.database.dto.PostDTO;
import java.time.LocalDate;
import org.sql2o.Sql2o;

/**
 *
 * @author amritaramnauth
 */
public class Blog {
    
    public Blog() {
    
    }
    
    public void run() {
        // set up sql connection to db
        Sql2o db = new Sql2o("jdbc:postgresql://localhost:5432/blog", "postgres", "postgres");
//        PostDAO dao = new PostDAO(db);
    
//        PostDTO newPost = new PostDTO();
//        newPost.setTitle("Covid-19 vs Semester");
//        newPost.setDescription("Corona takes the win, everyone surrendered and are having online classes.");
//        newPost.setAuthor("Scrimply Pibbles");
//        PostDTO createdPost = dao.create(newPost);

//          PostDTO createdPost = new PostDTO();
//          createdPost = dao.findOne(8);
//          
//          createdPost.setAuthor("Noob noob");
//          createdPost.setTitle("Something new about Covid-19");
//          
//          PostDTO updatedPost = dao.update(createdPost);
//        
        
//        System.out.println(dao.findOne(updatedPost.getId()));

//        dao.delete(9);
//        System.out.println(dao.findAll());
        
    }
}
