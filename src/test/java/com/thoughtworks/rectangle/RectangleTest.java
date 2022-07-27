import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.number.IsCloseTo.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(5.6,2.35);
        double result = rectangle.area();
        assertThat(result, is(closeTo(13.16,0.001)));
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven() {
        Rectangle rectangle = new Rectangle(5.6,2.3);
        double result = rectangle.perimeter();
        assertThat(result, is(closeTo(15.8,0.01)));
        
    }

}