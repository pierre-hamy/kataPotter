package pierreHamy.formationOcto;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BasketTest {
    @Test
    public void PriceShouldBe0_WhenEmpty() {
        //Given
        Basket emptyBasket = new Basket();

        //When
        Double totalPrice = emptyBasket.getTotalPrice();

        //Then
        assertEquals(emptyBasket.getTotalPrice(), new Double(0));
    }
    @Test
    public void PriceShouldBe_8_When1BookA() {
        //Given
        Basket basket = new Basket(1, 0, 0, 0, 0);

        //When
        Double totalPrice = basket.getTotalPrice();

        //Then
        assertEquals(basket.getTotalPrice(), new Double(8));
    }
    @Test
    public void PriceShouldBe_16_When2BookA() {
        //Given
        Basket basket = new Basket(2, 0, 0, 0, 0);

        //When
        Double totalPrice = basket.getTotalPrice();

        //Then
        assertEquals(basket.getTotalPrice(), new Double(16));
    }

    @Test
    public void Not5DifferentBooks_WhenBasketIsEmpty() {
        //Given
        Basket emptyBasket = new Basket();

        //When
        boolean has5DifferentBooks = emptyBasket.hasNDifferentBooks(5);

        //Then
        assertFalse(has5DifferentBooks);
    }

    @Test
    public void Not2DifferentBooks_WhenBasketIsEmpty() {
        //Given
        Basket emptyBasket = new Basket();

        //When
        boolean has2DifferentBooks = emptyBasket.hasNDifferentBooks(2);

        //Then
        assertFalse(has2DifferentBooks);
    }
    @Test
    public void TwoDifferentBooks_When2DifferentsBooksInTheBasket() {
        //Given
        Basket basket = new Basket(1,1,0,0,0);

        //When
        boolean has2DifferentBooks = basket.hasNDifferentBooks(2);

        //Then
        assertTrue(has2DifferentBooks);
    }
    @Test
    public void PriceShouldBe_15_2_When1BookAAnd1BookB() {
        //Given
        Basket basket = new Basket(1, 1, 0, 0, 0);

        //When
        Double totalPrice = basket.getTotalPrice();

        //Then
        assertEquals(basket.getTotalPrice(), new Double(15.2));
    }
}
