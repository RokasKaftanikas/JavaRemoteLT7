package DesignPatters.facade;

public interface PaymentService {
    void pay(Long productId, int amount);
}
