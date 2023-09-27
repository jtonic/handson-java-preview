package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

import javax.annotation.Nonnull;

public sealed interface AppError
        permits InternalError, ValidationError {
    String message();

    static String details(@Nonnull AppError orderResponse) {
        return switch (orderResponse) {
            // exhausted
            case InternalError a -> a.code().toString();
            case ValidationError r -> r.failedConstraint();
        };
    }
}