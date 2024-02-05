package SundayAssignment16A;

import java.util.Scanner;


class TestBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Book name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter the price: ");
        int bookPrice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Author name: ");
        String authorName = sc.nextLine();

        Book book = new Book();
        book.setBookName(bookName);
        book.setBookPrice(bookPrice);
        book.setAuthorName(authorName);

        System.out.println("\nBook Details:");
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Book Price: " + book.getBookPrice());
        System.out.println("Author Name: " + book.getAuthorName());

        sc.close();
    }
}
