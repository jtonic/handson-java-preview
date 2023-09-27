package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.controller;

import io.vavr.control.Either;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.AppError;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.ValidationError;

import java.util.function.Function;

@RestController
@RequestMapping("greeting")
public class GreetingController {

    @GetMapping
    public String greeting(@RequestParam("name") String name) {
        Either<AppError, String> result;
        if (name.isBlank()) {
            result = Either.left(new ValidationError("name is null or blank."));
        } else
            result = Either.right(name);

        return result.fold(
                    (err) -> {
                        throw new RuntimeException(err.message());
                    },
                    Function.identity()
            );
    }
}
