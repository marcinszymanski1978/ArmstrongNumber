import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArmstrongNumber_test {

    @Test
    public void test125(){
        Assertions.assertTrue(ArmstrongNumber.checkArmstrongNumber("153"));
    }

    @Test

    public void test123(){
        Assertions.assertFalse(ArmstrongNumber.checkArmstrongNumber("123"));
    }
}
