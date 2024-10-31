

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WohnungJUnit
{
    @Test
    public void SemiTestZuviel()
    {
        Wohnung wien;
        wien=new Wohnung ("wien",true,false,200000);
        assertEquals(wien.getAnzZimmer(),4);
    }
    
    @Test
    public void SemiTestOk()
    {
        Wohnung wien;
        wien = new Wohnung ("wien", true,false,200000,4);
    }

}
