package pl.jpia.credit;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    @Test
    public void allowAssignLimit() {
        //Arange /Given
        CreditCard card = new CreditCard();
        //Act /When
        card.assignLimit(2000);
        //Asser /Then
        Assert.assertTrue(card.getBalance() == 2000);
    }
}