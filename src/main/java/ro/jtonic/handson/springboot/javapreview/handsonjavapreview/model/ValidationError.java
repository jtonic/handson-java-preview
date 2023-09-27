package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

public record ValidationError(String failedConstraint) implements AppError {

    @Override
    public String message() {
        return failedConstraint;
    }
}
