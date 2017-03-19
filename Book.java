/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 12
 *
 */

public class Book
{
    private String title;
    private String author;
    private String publisher;
    private int CopyrightDate;

    public Book(String title, String author, String publisher, int CopyrightDate)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.CopyrightDate = CopyrightDate;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public int getCopyrightDate()
    {
        return CopyrightDate;
    }

    public void setCopyrightDate(int CopyrightDate)
    {
        this.CopyrightDate = CopyrightDate;
    }

    public String toString()
    {
        String description = "";
        description += "Title: \t" + title + "\n";
        description += "Author: \t" + author + "\n";
        description += "Publisher: \t" + publisher + "\n";
        description += "Copyright Date: \t" + CopyrightDate + "\n";
        return description;
    }
}
