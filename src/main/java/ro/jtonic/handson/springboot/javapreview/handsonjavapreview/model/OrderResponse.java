package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

public sealed interface OrderResponse
        permits Accepted, Reject {
    long orderId();

    static String info(OrderResponse orderResponse) {
        return switch (orderResponse) {
            case Accepted a -> a.code().toString();
            case Reject r -> r.reason();
//            case null -> throw new RuntimeException("Error!!!");
        };
    }
}
