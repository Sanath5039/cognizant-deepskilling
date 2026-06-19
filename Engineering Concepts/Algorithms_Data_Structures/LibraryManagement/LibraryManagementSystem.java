public class LibraryManagementSystem {

    static class Book {
        int bookId;
        String title;
        String author;

        Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book ID: " + bookId +
                    ", Title: " + title +
                    ", Author: " + author;
        }
    }

    public static Book linearSearch(Book[] books, String title) {

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    public static Book binarySearch(Book[] books, String title) {

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int comparison =
                    books[mid].title.compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void displayBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Algorithms", "Thomas Cormen"),
                new Book(102, "Database Systems", "Elmasri"),
                new Book(103, "Java Programming", "Herbert Schildt"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Software Engineering", "Ian Sommerville")
        };

        System.out.println("Library Books:");
        displayBooks(books);

        System.out.println("\nLinear Search Result:");
        Book result1 = linearSearch(books, "Java Programming");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Book not found.");

        System.out.println("\nBinary Search Result:");
        Book result2 = binarySearch(books, "Java Programming");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Book not found.");
    }
}