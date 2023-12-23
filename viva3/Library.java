/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Chuimin
 */
import java.util.ArrayList;
import java.util.Collections;
public class Library {
    
    private ArrayList<Book>book;
    
    public Library(){
        this.book=new ArrayList<>();
    }
   
    public void addBook(Book book){
        this.book.add(book);
    }
    
    public void removeBook(String str){
        int i=0;
        for(Book a: book){
            if(a.getISBN().equals(str)){
                this.book.remove(i);
                break;
            }
            i++;
        }
    }
    
   
    public void findBooksByAuthor(String author){
        for(Book a:this.book){
            if(a.getAuthor().equalsIgnoreCase(author)){
                System.out.printf("Books by author '%s': \n",author);
                System.out.println(a.toString());
            }
        }
        
    }
    
    public void findBooksByTitle(String title){
        for(Book a:this.book){
            if(a.getTitle().equalsIgnoreCase(title)){
                System.out.printf("Books with title '%s':\n",title);
                System.out.println(a.toString());
            }
        }
        
    }
    
    public void removeISBN(String ISBN){
        int i=0;
         for(Book a:this.book){
            if(a.getISBN().equalsIgnoreCase(ISBN)){
                book.remove(i);
                break;
            }
            i++;
        }
    }
    
    public boolean borrowBook(String isbn){
        int code=Integer.parseInt(isbn);
        if(isPrimeDigit(code)){
            removeISBN(isbn);
            return true;
        }else{
            return false;
        }
            
    }
    
    public void sortBooks(){
        System.out.println("Books in the library, sorted by title: ");
        Collections.sort(book,(b1,b2)->b1.getTitle().compareToIgnoreCase(b2.getTitle()));
        for(Book a: this.book){
            System.out.println(a);
            System.out.println();
        }
    }
    
    
    public void displayLibrary(){
        System.out.println("Books in the library, sorted by title: ");
        for(Book a: book){
            System.out.println(a.toString());
            System.out.println();
        }
    }
    public static boolean isPrimeDigit(int isbn){
        int a= isbn%100;
        if(a<2){
            return false;
        }
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    
}




    
    
    
    
