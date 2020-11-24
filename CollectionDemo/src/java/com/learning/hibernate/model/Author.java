
package com.learning.hibernate.model;

import java.util.Set;

public class Author
{
    private int AuthorID;
    private String AuthorName;
    private Set<Book> Books;

    public Author() {}
    
    public Author(int AuthorID, String AuthorName, Set<Book> Books)
    {
        this.AuthorID = AuthorID;
        this.AuthorName = AuthorName;
        this.Books = Books;
    }

    public int getAuthorID()
    {
        return AuthorID;
    }
    public void setAuthorID(int AuthorID)
    {
        this.AuthorID = AuthorID;
    }

    public String getAuthorName()
    {
        return AuthorName;
    }
    public void setAuthorName(String AuthorName)
    {
        this.AuthorName = AuthorName;
    }

    public Set<Book> getBooks()
    {
        return Books;
    }
    public void setBooks(Set<Book> Books)
    {
        this.Books = Books;
    }

    @Override
    public String toString()
    {
        return "Author{" + "AuthorID = " + AuthorID + ", AuthorName = " + AuthorName + ", Books = " + Books + '}';
    }
}
