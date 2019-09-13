package pierreHamy.formationOcto;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    @Test
    public void PriceShouldBe0_WhenEmpty() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket emptyBasket = new Basket();
        discountCalculator.setBasket(emptyBasket);
        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(0,totalPrice,0);
    }

    @Test
    public void PriceShouldBe_8_When1BookA() {
        //Given
        Basket basket = new Basket(1, 0, 0, 0, 0);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.setBasket(basket);

        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(8, totalPrice,0);
    }

    @Test
    public void PriceShouldBe_16_When2BookA() {
        //Given
        Basket basket = new Basket(2, 0, 0, 0, 0);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.setBasket(basket);

        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(16, totalPrice,0);
    }

    @Test
    public void PriceShouldBe_15_2_When1BookAAnd1BookB() {
        //Given
        Basket basket = new Basket(1, 1, 0, 0, 0);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.setBasket(basket);

        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(15.2, totalPrice,0);
    }

    @Test
    public void PriceShouldBe_25_6_When4DifferentBooks() {
        //Given
        Basket basket = new Basket(1, 1, 0, 1, 1);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.setBasket(basket);

        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(25.6, totalPrice,0);
    }

    @Test
    public void PriceShouldBe_21_6_When3DifferentBooks() {
        //Given
        Basket basket = new Basket(1, 1, 0, 1, 0);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.setBasket(basket);

        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(21.6, totalPrice,0);
    }

    @Test
    public void PriceShouldBe_51_2_WhenComplexCase1() {
        //Given
        Basket basket = new Basket(2, 2, 2, 1, 1);
        DiscountCalculator discountCalculator = new DiscountCalculator();
        discountCalculator.setBasket(basket);

        //When
        double totalPrice = discountCalculator.getTotalPrice();

        //Then
        assertEquals(51.2, totalPrice,0);
    }
}