
package com.learning.hibernate.driver;

import com.learning.hibernate.model.Author;
import com.learning.hibernate.model.Book;
import com.learning.hibernate.config.HibernateUtil;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDriver
{
    public static void main (String[] args)
    {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sess = sf.openSession();
    Transaction tx = sess.beginTransaction();
    
    Book book1 = new Book(1, "Spring", "Introduction to Spring", 1234, "SP1234",250);
    Book book2 = new Book(2, "Hibernate", "Introduction to Hibernate", 5678, "HIB5678",500);
    Book book3 = new Book(3, "JSF", "Introduction to JSF", 8765, "JSF8765",125);
    Book book4 = new Book(4, "DSA", "Introduction to DSA", 4321, "DSA4321",750);
    
    Set<Book> books = new HashSet<>();
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    
    Author author = new Author(101, "Ram Narayan", books);
    sess.save(author);
    
    tx.commit();
    sess.close();
    }
}
