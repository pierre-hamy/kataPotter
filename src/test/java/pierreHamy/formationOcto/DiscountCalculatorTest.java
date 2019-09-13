package pierreHamy.formationOcto;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {
    @Test
    public void nb25percentsDiscountShouldBe_0_WhenBasketIsEmpty() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket emptyBasket = new Basket();
        discountCalculator.setBasket(emptyBasket);

        //When
        int nb25percentsDiscount = discountCalculator.getNb25percentsDiscount();

        //Then
        assertEquals(0,nb25percentsDiscount);
    }


    @Test
    public void nb25percentsDiscountShouldBe_1_WhenBasketHas5DifferentBooks() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket basket = new Basket(1,1,1,1,1);
        discountCalculator.setBasket(basket);

        //When
        int nb25percentsDiscount = discountCalculator.getNb25percentsDiscount();

        //Then
        assertEquals(1, nb25percentsDiscount);
    }
    @Test
    public void nb25percentsDiscountShouldBe_1_WhenBasketHas5DifferentBooks2Times() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket basket = new Basket(2,2,2,2,2);
        discountCalculator.setBasket(basket);

        //When
        int nb25percentsDiscount = discountCalculator.getNb25percentsDiscount();

        //Then
        assertEquals(2, nb25percentsDiscount);
    }
    @Test
    public void nb20percentsDiscountShouldBe_1_WhenBasketHas4DifferentBooks() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket basket = new Basket(1,1,0,1,1);
        discountCalculator.setBasket(basket);

        //When
        int nb20percentsDiscount = discountCalculator.getNb20percentsDiscount();

        //Then
        assertEquals(1, nb20percentsDiscount);
    }
    @Test
    public void nb20percentsDiscountShouldBe_3_WhenBasketHas4DifferentBooks1Times() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket basket = new Basket(3,5,1,3,0);
        discountCalculator.setBasket(basket);

        //When
        int nb20percentsDiscount = discountCalculator.getNb20percentsDiscount();

        //Then
        assertEquals(1, nb20percentsDiscount);
    }
    @Test
    public void nb20percentsDiscountShouldBe_3_WhenBasketHas4DifferentBooks2Times() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket basket = new Basket(3,5,2,3,0);
        discountCalculator.setBasket(basket);

        //When
        int nb20percentsDiscount = discountCalculator.getNb20percentsDiscount();

        //Then
        assertEquals(2, nb20percentsDiscount);
    }


    @Test
    public void PriceShouldBe0_WhenEmpty() {
        //Given
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Basket emptyBasket = new Basket();
        discountCalculator.setBasket(emptyBasket);
        //When
        double totalPrice = discountCalculator.getTotalPrice();


        //Then
        assertEquals(0,totalPrice);
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
        assertEquals(8, totalPrice);
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
        assertEquals(16, totalPrice);
    }
}