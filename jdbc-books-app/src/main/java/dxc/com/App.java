package dxc.com;
import java.util.*;

import java.util.List;

import dxc.com.dao.BookDao;
import dxc.com.model.Book;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Book af=new Book("animal farm","george well", "987-567-234975-3");
        Book dn=new Book("biology","runner d villay" , "223343-8754-156-8087");
        Book fh=new Book("farm house","carry minati","43635745-2464846-1");


        List<Book> books = List.of(af,dn,fh);
        BookDao bookDao = new BookDao();

        books.forEach(bk -> {
            try{
               int rows = bookDao.save(bk);
               System.out.println("Rows affected: "+rows);
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        });
    }
}
