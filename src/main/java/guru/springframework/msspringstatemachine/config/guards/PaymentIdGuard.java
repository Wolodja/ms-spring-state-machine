package guru.springframework.msspringstatemachine.config.guards;

import guru.springframework.msspringstatemachine.domain.PaymentEvent;
import guru.springframework.msspringstatemachine.domain.PaymentState;
import guru.springframework.msspringstatemachine.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {

    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> context) {
        return context.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}