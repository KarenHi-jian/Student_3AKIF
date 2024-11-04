public class Wohnung
{
    private String ort;
    private String strasse;
    private boolean balkon;
    private boolean gefordert;
    private int preis;
    private int anzZimmer;
    
    public Wohnung ()
    {
        setOrt("Wien");
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort, String strasse, boolean balkon, boolean gefordert,int preis, int anzZimmer)
    {
        setOrt(ort);
        setStrasse(strasse);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(anzZimmer);
    }
    
    public Wohnung(String ort, String strasse, boolean balkon, boolean gefordert,int preis)
    {
        setOrt(ort);
        setStrasse(strasse);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort,String strasse, boolean balkon, boolean gefordert)
    {
        setOrt(ort);
        setStrasse(strasse);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort, String strasse, boolean balkon)
    {
        setOrt(ort);
        setStrasse(strasse);
        setBalkon(balkon);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
    }
    
    public Wohnung(String ort, String strasse)
    {
       setOrt(ort);
       setStrasse(strasse);
       setBalkon(true);
       setGefordert(false);
       setPreis(200000);
       setAnzZimmer(4);
    }
    
    public Wohnung(String Ort)
    {
       setOrt(ort);
       setStrasse("Spengergasse 10/5/3A");
       setBalkon(true);
       setGefordert(false);
       setPreis(200000);
       setAnzZimmer(4);
    }
    
    public void setOrt(String ort)
    {
        this.ort=ort;
    }
    
    public void setStrasse(String strasse)
    {
        this.strasse=strasse;
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
        this.anzZimmer=anzZimmer;
    }
    
    public String getOrt()
    {
       return ort; 
    }
    
    public String getStrasse()
    {
        return strasse;
    }
    
    public boolean getBalkon()
    {
        return balkon;
    }
    
    public boolean getGefordert()
    {
        return gefordert;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public int getAnzZimmer()
    {
        return anzZimmer;
    }
    
    public String getHausnummer()
    {
        String Hausnummer;
        int pos1;
        int pos2;
        pos1=strasse.indexOf(" ")+1;
        pos2=strasse.indexOf("/");
        {
           if (pos1 >0)
            {
            Hausnummer= strasse.substring(pos1);
            }
        }
        
        Hausnummer=strasse.substring(pos1,pos2);
        
        return Hausnummer;
    }
    
    
    public String getStock()
    {
        String stock;
        int pos1;
        int pos2;
        pos1=strasse.indexOf("/")+1;
        pos2=strasse.indexOf(("/"),pos1);
        stock=strasse.substring(pos1,pos2);
        
        return stock;
    }
}

    
    

    
