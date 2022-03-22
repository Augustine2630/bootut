package aug.boot.bootut.Repository;

import aug.boot.bootut.Models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByName(String cartName);
}
