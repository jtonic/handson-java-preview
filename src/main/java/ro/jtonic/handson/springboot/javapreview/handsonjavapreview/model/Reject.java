package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

public record Reject(String reason) implements OrderResponse {

    @Override
    public long orderId() {
        return 2;
    }
}
