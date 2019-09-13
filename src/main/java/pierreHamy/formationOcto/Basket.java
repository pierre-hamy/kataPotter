package pierreHamy.formationOcto;

public class Basket {
    private int[] booksTab = new int[]{0,0,0,0,0,};


    public Basket() {
    }

    public Basket(int nbBookA, int nbBookB, int nbBookC, int nbBookD, int nbBookE) {
        this.booksTab[0] = nbBookA;
        this.booksTab[1] = nbBookB;
        this.booksTab[2] = nbBookC;
        this.booksTab[3] = nbBookD;
        this.booksTab[4] = nbBookE;

    }
    public int[] getBooksTab() {
        return this.booksTab;
    }
//    public Double getTotalPrice() {
//        totalPrice = booksTab[0] * UNITARY_BOOK_PRICE
//                + booksTab[1] * UNITARY_BOOK_PRICE
//                + booksTab[2] * UNITARY_BOOK_PRICE
//                + booksTab[3] * UNITARY_BOOK_PRICE
//                + booksTab[4] * UNITARY_BOOK_PRICE;
//
//        return this.totalPrice;
//
//    }

    public Boolean hasNDifferentBooks(int numberOfDifferentBookExpeted) {
        boolean hasNDifferentBooks = false;
        int nbDifferentBook = 0;
        for(int book = 0; book < booksTab.length; book++) {
            if (booksTab[book] > 0 ) {
                nbDifferentBook += 1;
            }
        }
        if (nbDifferentBook >= numberOfDifferentBookExpeted) {
            hasNDifferentBooks = true;
        }
        return hasNDifferentBooks;
    }

    public void setNumberOfBook(int book, int numberOfBook) {
        booksTab[book] = numberOfBook;
    }

    public int getNumberOfBook(int book) {
        return booksTab[book];
    }
}
