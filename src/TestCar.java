import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCar {

    @Test
    public void carBeeps() {
        Car toyota = new Car();

        // assert statements
        assertEquals(toyota.boop(), "BP!");
    }

    @Test
    public void windowEqualsDown() {
        Car toyota = new Car();

        toyota.toggleWindow();

        assertEquals(toyota.getWindowStatus(), "down");
    }
    @Test
    public void carColorBlack() {
        Car toyota = new Car();

        assertEquals(toyota.getColor(), "black");
    }


}
