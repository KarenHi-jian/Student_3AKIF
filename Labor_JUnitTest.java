import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Labor_JUnitTest
{
    @Test
   public void testZuHoch()
    {
        Labor c;
        c = new Labor("c",10,true,20);
        System.out.println(c.getStock());
        
    }
    
    @Test
    public void testOK()
    {
        Labor c;
        c = new Labor("c",5,true,20);
        System.out.println(c.getStock());
    }
}
