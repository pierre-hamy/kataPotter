package pierreHamy.formationOcto;

public class DiscountCalculator {
    private Basket basket;
    private int nb00percentsDiscount = 0;
    private int nb05percentsDiscount = 0;
    private int nb10percentsDiscount = 0;
    private int nb25percentsDiscount = 0;
    private int nb20percentsDiscount = 0;
    private Basket temporaryBasket;
    private final static Double UNITARY_BOOK_PRICE = new Double(8);


    public void setBasket(Basket basket) {
        this.basket = basket;
        this.temporaryBasket = basket;
    }

    public double getTotalPrice() {

        for (int discountType = 5; discountType >= 1; discountType--) {
            calculateNbDiscountPerCategoryOfSameBook(discountType);
        }

        return UNITARY_BOOK_PRICE * (nb25percentsDiscount * 5 * 0.75
                + nb20percentsDiscount * 4 * 0.8
                + nb10percentsDiscount * 3 * 0.9
                + nb05percentsDiscount * 2 * 0.95
                + nb00percentsDiscount);
    }

    public void calculateNbDiscountPerCategoryOfSameBook(int numberOfDifferentBookExpected) {
        while (this.temporaryBasket.hasNDifferentBooks(numberOfDifferentBookExpected)) {
            for (int book = 0; book < this.temporaryBasket.getBooksTab().length; book++) {
                int currentNumberOfBook = this.temporaryBasket.getNumberOfBook(book);
                if (currentNumberOfBook > 0) {
                    this.temporaryBasket.setNumberOfBook(book, currentNumberOfBook - 1);
                }
            }
            switch (numberOfDifferentBookExpected) {
                case 1:
                    this.nb00percentsDiscount++;
                    break;
                case 2:
                    this.nb05percentsDiscount++;
                    break;
                case 3:
                    this.nb10percentsDiscount++;
                    break;
                case 4:
                    this.nb20percentsDiscount++;
                    break;
                case 5:
                    this.nb25percentsDiscount++;
                    break;
            }
        }
    }

}
