package pierreHamy.formationOcto;

public class DiscountCalculator {
    private Basket basket;
    private int nb25percentsDiscount = 0;
    private int nb20percentsDiscount = 0;
    private Basket temporaryBasket;
    private Double totalPrice = new Double(0);
    private final static Double UNITARY_BOOK_PRICE = new Double(8);



    public void setBasket(Basket basket) {
        this.basket = basket;
        this.temporaryBasket = basket;
    }

    public double getTotalPrice() {
        calculateNb25percentsDiscount();
        calculateNb20percentsDiscount();
        //TODO Ajuster avec le relicat de livre
        return (nb25percentsDiscount*UNITARY_BOOK_PRICE*0.75
                        + nb20percentsDiscount*UNITARY_BOOK_PRICE*0.8);

    }

    public void calculateNb25percentsDiscount() {
        while (this.temporaryBasket.hasNDifferentBooks(5)) {
            for (int book = 0; book < this.temporaryBasket.getBooksTab().length; book++) {
                int newNumberOfBook = this.temporaryBasket.getNumberOfBook(book) - 1;
                this.temporaryBasket.setNumberOfBook(book, newNumberOfBook)  ;
            }
            this.nb25percentsDiscount ++;
        }
    }

    public void calculateNb20percentsDiscount() {
        while (this.temporaryBasket.hasNDifferentBooks(4)) {
            for (int book = 0; book < this.temporaryBasket.getBooksTab().length; book++) {
                int currentNumberOfBook = this.temporaryBasket.getNumberOfBook(book) ;
                if (currentNumberOfBook > 0) {
                    this.temporaryBasket.setNumberOfBook(book, currentNumberOfBook - 1)  ;
                }
            }
            this.nb20percentsDiscount ++;
        }
    }

    public int getNb20percentsDiscount() {
        return this.nb20percentsDiscount;
    }

    public int getNb25percentsDiscount() {
        return this.nb25percentsDiscount;
    }
}
