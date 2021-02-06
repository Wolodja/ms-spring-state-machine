package guru.springframework.msspringstatemachine.services;

import guru.springframework.msspringstatemachine.domain.Payment;
import guru.springframework.msspringstatemachine.domain.PaymentEvent;
import guru.springframework.msspringstatemachine.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuthorize(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declinePayment(Long paymentId);

}
