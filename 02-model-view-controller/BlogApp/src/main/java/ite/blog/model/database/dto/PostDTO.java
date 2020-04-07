/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ite.blog.model.database.dto;

/**
 *
 * @author amritaramnauth
 */
public class PostDTO {
    private int id;
    private String title;
    private String description;
    private String author;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "PostDTO{" + "id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + ", " + '}';
    }

   

}
