package pierreHamy.formationOcto;

public class DiscountCalculator {
    private Basket basket;
    private int nb25percentsDiscount = 0;
    private int nb20percentsDiscount = 0;


    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public int getNb25percentsDiscount() {
        Basket temporaryBasket = basket;

        while (temporaryBasket.hasNDifferentBooks(5)) {
            for (int book = 0; book < temporaryBasket.getBooksTab().length; book++) {
                int newNumberOfBook = temporaryBasket.getNumberOfBook(book) - 1;
                temporaryBasket.setNumberOfBook(book, newNumberOfBook)  ;
            }
            this.nb25percentsDiscount ++;
        }
        return this.nb25percentsDiscount;
    }

    public int getNb20percentsDiscount() {
        Basket temporaryBasket = basket;

        while (temporaryBasket.hasNDifferentBooks(4)) {
            for (int book = 0; book < temporaryBasket.getBooksTab().length; book++) {
                int currentNumberOfBook = temporaryBasket.getNumberOfBook(book) ;
                if (currentNumberOfBook > 0) {
                    temporaryBasket.setNumberOfBook(book, currentNumberOfBook - 1)  ;
                }
            }
            this.nb20percentsDiscount ++;
        }
        return this.nb20percentsDiscount;
    }
}
