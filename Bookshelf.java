/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 12
 *
 */

public class Bookshelf
{
    public static void main(String[] args)
    {
        Book bookOne = new Book("Essential Calculus: Early Transcendentals",
                "Stewart",
                "Brooks Cole",
                2009);


        System.out.println(bookOne);

        System.out.println("Title: " + bookOne.getTitle());

        bookOne.setAuthor("Stewart");

        System.out.println("New Author: " + bookOne.getAuthor());

        System.out.println();
        System.out.println();

        Book bookTwo = new Book("Java Software Solutions",
                "Lewis and Loftus",
                "Addison-Wesley",
                1963);


        System.out.println(bookTwo);

        System.out.println("Publisher: " + bookTwo.getPublisher());

        bookTwo.setCopyrightDate(2012);

        System.out.println("New Copyright Date: " + bookTwo.getCopyrightDate());
    }
}
