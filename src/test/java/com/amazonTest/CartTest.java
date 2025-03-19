package com.amazonTest;

import org.amazon.Cart;
import org.testng.annotations.Test;

public class CartTest extends Base{
    @Test
    public void checkoutTest(){
        Cart cart = new Cart(getDriver());
        cart.checkout();
        cart.checkoutAssert();
    }
}
