package pierreHamy.formationOcto;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BasketTest {


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

}
