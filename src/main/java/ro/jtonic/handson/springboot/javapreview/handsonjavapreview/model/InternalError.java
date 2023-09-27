package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

public record InternalError(Long code) implements AppError {

    @Override
    public String message() {
        return code.toString();
    }
}
