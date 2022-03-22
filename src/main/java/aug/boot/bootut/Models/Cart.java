package aug.boot.bootut.Models;

import javax.persistence.*;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "cartName")
    private String cartName;

    @Column(name = "cartSerial")
    private Long cartSerial;

    public Cart(String cartName) {
        this.cartName = cartName;
    }

    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public Long getCartSerial() {
        return cartSerial;
    }

    public void setCartSerial(Long cartSerial) {
        this.cartSerial = cartSerial;
    }
}
