package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.Accepted;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.OrderResponse;

@RestController
@RequestMapping("greeting")
public class GreetingController {

    @GetMapping
    public String greeting() {
        OrderResponse orderResponse = new Accepted(100L);
        final String info = OrderResponse.info(orderResponse);
        System.out.println("info = " + info);
        return "Greeting";
    }
}
