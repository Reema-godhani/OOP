class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks;

    Library(int books) {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks = availableBooks - count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining Books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }

    public static void main(String[] args) {
        Library l = new Library(3);

        try {
            l.issueBook(2);
            l.issueBook(2);
        }

        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

/*output 
Book issued successfully
Remaining Books: 1
Exception: Requested books not available */
