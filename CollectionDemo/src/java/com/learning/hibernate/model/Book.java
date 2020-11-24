
package com.learning.hibernate.model;

public class Book
{
    private int BookID;
    private String Name;
    private String Title;
    private double Price;
    private String isbn;
    private int Pages;

    public Book() {}
    
    public Book(int BookID, String Name, String Title, double Price, String isbn, int Pages)
    {
        this.BookID = BookID;
        this.Name = Name;
        this.Title = Title;
        this.Price = Price;
        this.isbn = isbn;
        this.Pages = Pages;
    }

    public int getBookID()
    {
        return BookID;
    }
    public void setBookID(int BookID)
    {
        this.BookID = BookID;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getTitle()
    {
        return Title;
    }
    public void setTitle(String Title)
    {
        this.Title = Title;
    }

    public double getPrice()
    {
        return Price;
    }
    public void setPrice(double Price)
    {
        this.Price = Price;
    }

    public String getIsbn()
    {
        return isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    public int getPages()
    {
        return Pages;
    }
    public void setPages(int Pages)
    {
        this.Pages = Pages;
    }

    @Override
    public String toString()
    {
        return "Book{" + "BookID = " + BookID + ", Name = " + Name + ", Title = " + Title + ", Price = " + Price + ", isbn = " + isbn + ", Pages = " + Pages + '}';
    }
}
