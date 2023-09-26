package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.OrderResponse;

public record Accepted(Long code) implements OrderResponse {

    @Override
    public long orderId() {
        return 1;
    }
}
