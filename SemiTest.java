

public class SemiTest
{
   
    public void SemiTestZuviel()
    {
       Wohnung wien;
       wien = new Wohnung("wien",true,false,200000,9);
       System.out.println(wien.getAnzZimmer());
    }
    
    public void SemiTestOk()
    {
        Wohnung wien;
        wien = new Wohnung("wien",true,false,200000,4);
        System.out.println(wien.getAnzZimmer());
    }

}
