package ro.jtonic.handson.springboot.javapreview.handsonjavapreview;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.Accepted;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.OrderResponse;

public class SwitchPatternMatchTest {

    @Test
    void test() {
        OrderResponse accepted = new Accepted(100L);
        OrderResponse.info(accepted);
    }
}
