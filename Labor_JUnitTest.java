

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Labor_JUnitTest
{
   public void testZuHoch()
    {
        Labor labor1;
        labor1= new Labor("c",10,true,20);
        assert equals(labor1.getStock());
    }
    
    public void testOK()
    {
        Labor labor2;
        labor2= new Labor("d",5,true,20);
        assert equals(labor2.getStock());
    }
}
