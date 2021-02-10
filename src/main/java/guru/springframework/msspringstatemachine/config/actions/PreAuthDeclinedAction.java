package guru.springframework.msspringstatemachine.config.actions;

import guru.springframework.msspringstatemachine.domain.PaymentEvent;
import guru.springframework.msspringstatemachine.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class PreAuthDeclinedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Sending Notification of PreAuth DECLINED");
    }
}
