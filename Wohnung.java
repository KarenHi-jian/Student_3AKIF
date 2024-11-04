
public class Wohnung
{
    private String ort;
    private boolean balkon;
    private boolean gefordert;
    private int preis;
    private int anzZimmer;
    
    public Wohnung ()
    {
        setOrt("Wien");
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort,boolean blakon, boolean gefordert,int preis, int anzZimmer)
    {
        setOrt(ort);
        setBalkon(true);
        setGefordert(false);
        setPreis(preis);
        setAnzZimmer(anzZimmer);
    }
    
    public Wohnung(String ort, boolean balkon, boolean gefordert, int preis)
    {
        setOrt(ort);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort,boolean balkon,boolean gefordert)
    {
        setOrt(ort);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort, boolean balkon)
    {
        setOrt(ort);
        setBalkon(balkon);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
        
    }
    
    public Wohnung(String ort)
    {
        setOrt(ort);
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public void setOrt (String ort)
    {
        this.ort=ort;
    }
    
    public void setBalkon(boolean balkon)
    {
        this.balkon=balkon;
    }
    
    public void setGefordert(boolean gefordert)
    {
        this.gefordert=gefordert;
    }
    
    public void setPreis(int preis)
    {
        this.preis=preis;
    }
    
    public void setAnzZimmer(int anzZimmer)
    {
        if ((anzZimmer >= 1) && (anzZimmer <= 7))
        {
            this.anzZimmer=anzZimmer;
        }
        else
        {
            System.out.println("Fehler : Üngultiges AnzZimmer. AnzZimmer between 1 und 7");
            this.anzZimmer=4;
        }
    }
    
    public String getOrt()
    {
        return ort;
    }
    
    public boolean getBalkon()
    {
        return balkon;
    }
    
    public boolean getGefordert ()
    {
        return gefordert;
    }
    
    public int getPreis ()
    {
        return preis;
    }
    
    public int getAnzZimmer()
    {
        return anzZimmer;
    }
    
    public void printWohnung()
    {
        if (balkon == true)
        {
        System.out.println(ort + " : "  + "Balkon" +" - " + gefordert + " - " + preis  + " Euro " + anzZimmer + " Zimmer");
        }
        else
        {
          System.out.println(ort + ":"  + "kein balkon" + "-" + gefordert + " - " + preis + " Euro " + anzZimmer + " Zimmer");
        }
        
        if (gefordert == true)
        {
          System.out.println(ort + ":"  + "Balkon" +"-" + "Gefordert "+" - " + preis  + " Euro " + anzZimmer + " Zimmer");
        }
        else
        {
            System.out.println(ort + ":"  + "Balkon" +"-" + "Nicht Gefordert" + " - " + preis + " Euro " + anzZimmer + " Zimmer");
        }
    }
}
