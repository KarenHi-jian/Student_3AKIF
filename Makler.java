public class Makler
{
    private Wohnung objekt0;
    private Wohnung objekt1;
    private Wohnung objekt2;
    
    public void Wohnung( Wohnung wer)
    {
        if (objekt0 == null)
        {
            objekt0 = wer;
        }
        else
        {
            if (objekt1 == null)
            {
                objekt1 = wer;
            }
            else
            {
                if (objekt2 == null)
                {
                    objekt2 = wer;
                }
                else
                {
                    System.out.println("Fehler: Kein Objekt Mehr möglisch");
                }
            }
        }
    }
    
    public void printWohnung()
    {
        if (objekt0 != null)
        {
            objekt0.printWohnung();
        }
        if (objekt1 != null)
        {
            objekt1.printWohnung();
        }
        if (objekt2 != null)
        {
            objekt2.printWohnung();
        }
    }
    
    public  int  gunstigstenWohnung()
    {
        int min;
        min = -1;
        
        if (objekt0 != null)
        {
            if (objekt0.getPreis()> min)
            {
                min = objekt0.getPreis();
            }
        }
        if (objekt1 != null)
        {
            if (objekt1.getPreis()> min)
            {
                min = objekt1.getPreis();
            }
        }
        if (objekt2 != null)
        {
            if (objekt2.getPreis()>min)
            {
                min = objekt2.getPreis();
            }
        }
        return min;
    }
    public int billigerWohnung()
    {
        return 0;
    }
}