package guru.springframework.msspringstatemachine.repository;

import guru.springframework.msspringstatemachine.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
