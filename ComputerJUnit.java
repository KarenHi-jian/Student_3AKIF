
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComputerJUnit
{
    @Test
    public void TestZuNiedrig()
    {
        Computer Lenovo;
        Lenovo = new Computer("Lenovo",true,899,100);
        assertEquals (Lenovo.getMhz(), 2000);
        
    }

    @Test
    public void TestZuHoch()
    { 
        
        Computer Lenovo;
        Lenovo = new Computer("Lenovo",true,899,5000);
        assertEquals (Lenovo.getMhz(), 2000);
    }

    @Test
    public void TestOk()
    {
        Computer Lenovo;
        Lenovo = new Computer("Lenovo",true,899,2000);
        assertEquals (Lenovo.getMhz(), 2000);
    }
}
