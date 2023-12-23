/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Chuimin
 */
public class Book {
    
    String title;
    String author;
    String ISBN;
    
    public Book(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

     public String getTitle(){
        return this.title;
    }   
     
     public String getAuthor(){
         return this.author;
     }
    
    public String getISBN(){
        return this.ISBN;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String toString(){
        return ("-Title: "+this.title+"\n Author: "+this.author+"\n ISBN: "+this.ISBN);
    }
    
}
