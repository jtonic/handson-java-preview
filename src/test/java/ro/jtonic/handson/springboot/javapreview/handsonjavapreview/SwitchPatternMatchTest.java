package ro.jtonic.handson.springboot.javapreview.handsonjavapreview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.AppError;
import ro.jtonic.handson.springboot.javapreview.handsonjavapreview.model.InternalError;

public class SwitchPatternMatchTest {

    @Test
    void test() {
        AppError accepted = new InternalError(100L);
        final String details = AppError.details(accepted);
        Assertions.assertThat(details).isEqualTo("100");
    }
}
