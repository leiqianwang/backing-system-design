package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {
        System.out.println("Welcome to the Tech Elevator Bookstore");

        ShoppingCart cart = new ShoppingCart();
        // Create a book object using the default constructor. Then set the book's properties
        // Create two more book object and set their properties using a constructor
        // Bookstore.java (lines 31-32)
        Book twoCities = new Book();
        twoCities.setTitle("A Tale of Two Cities");
        twoCities.setAuthor("Charles Dickens");
        twoCities.setPrice(14.99);

        Book threeMusketeers = new Book();
        threeMusketeers.setTitle("The Three Musketeers");
        threeMusketeers.setAuthor("Alexandre Dumas");
        threeMusketeers.setPrice(12.99);

        Book childhoodEnd = new Book();
        childhoodEnd.setTitle("Childhood's End");
        childhoodEnd.setAuthor("Arthur C. Clarke");
        childhoodEnd.setPrice(15.99);

        // Add all three books to the shopping cart and print a receipt

        cart.add(twoCities);
        cart.add(threeMusketeers);
        cart.add(childhoodEnd);



        // Add some new movies and purchase them
        Movie airplane = new Movie("Airplane!", "PG", 88, 9.99);
        Movie theGodfather = new Movie("The Godfather", "R", 175, 14.99);
        // Shirley, you can't be serious!
        cart.add(airplane);
        cart.add(theGodfather);

        // Add some new coffee orders and purchase them
        Coffee myCoffee = new Coffee("Extra-large", "Dark Roast", new String[]{"Sugar", "Cream"}, 3.50);
        Coffee friendCoffee = new Coffee("Medium", "Colombian", new String[]{"Sugar", "Soy milk"}, 2.75);
        cart.add(myCoffee);
        cart.add(friendCoffee);


        System.out.println(cart.receipt());
    }
}
