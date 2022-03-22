package aug.boot.bootut.Service;

import aug.boot.bootut.Models.Cart;

import java.util.List;

public interface CartService {
    void addCart(Cart cart);
    List<Cart> getAllCarts();
    Cart getCartBySerial(Long cartSerial);
    void deleteCart(Long id);
}
