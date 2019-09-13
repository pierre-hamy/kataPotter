package pierreHamy.formationOcto;

public class Basket {
    private Integer nbBookA = 0;
    private Integer nbBookB = 0;
    private Integer nbBookC = 0;
    private Integer nbBookD = 0;
    private Integer nbBookE = 0;

    private Double totalPrice = new Double(0);
    private final static Double UNITARY_BOOK_PRICE = new Double(8);

    public Basket() {
    }

    public Basket(Integer nbBookA, Integer nbBookB, Integer nbBookC, Integer nbBookD, Integer nbBookE) {
        this.nbBookA = nbBookA;
        this.nbBookB = nbBookB;
        this.nbBookC = nbBookC;
        this.nbBookD = nbBookD;
        this.nbBookE = nbBookE;

    }

    public Double getTotalPrice() {
        totalPrice = nbBookA * UNITARY_BOOK_PRICE
                + nbBookB * UNITARY_BOOK_PRICE
                + nbBookC * UNITARY_BOOK_PRICE
                + nbBookD * UNITARY_BOOK_PRICE
                + nbBookE * UNITARY_BOOK_PRICE;
        return totalPrice;

    }
}
