package ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model;

public class PatternMatch {
    static String execute2(Gender gender) {
        return switch (gender) {
            case MALE -> "male";
            case FEMALE -> "female";
//            case null -> throw new RuntimeException("Error!!!");
        };
    }
}

enum Gender {
    MALE,
    FEMALE;
}
