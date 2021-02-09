package guru.springframework.msspringstatemachine.services;

import guru.springframework.msspringstatemachine.domain.Payment;
import guru.springframework.msspringstatemachine.repository.PaymentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PaymentServiceImplTest {

    @Autowired
    PaymentService paymentService;

    @Autowired
    PaymentRepository paymentRepository;

    Payment payment;

    @BeforeEach
    void setUp() {
        payment = Payment.builder().amount(new BigDecimal("12.99")).build();
    }

    @Transactional
    @Test
    void preAuthorize() {
        Payment savedPayment = paymentService.newPayment(payment);

        paymentService.preAuthorize(savedPayment.getId());

        Payment paymentRepositoryOne = paymentRepository.getOne(savedPayment.getId());

        System.out.println(paymentRepositoryOne);
    }
}