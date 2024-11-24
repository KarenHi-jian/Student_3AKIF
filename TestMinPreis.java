

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMinPreis
{
    @Test
    public void TestLeer()
    {
        Makler r;
        
        r = new Makler();
        assertEquals ( r.gunstigsterWohnung(),200000);
    }

    
}

