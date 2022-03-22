package aug.boot.bootut.Service;

import aug.boot.bootut.Models.Cart;
import aug.boot.bootut.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartRepository cartRepository;

    @Override
    public void addCart(Cart cart) {
        cart.setId((long) getRandomNumber(1, 9999));
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> getAllCarts() {
        List<Cart> cartList = cartRepository.findAll();
        return cartList;
    }

    @Override
    public Cart getCartBySerial(Long cartSerial) {
        return cartRepository.getOne(cartSerial);
    }

    @Override
    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
