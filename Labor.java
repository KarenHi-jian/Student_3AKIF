public class Labor
{
    private String gebaude;
    private String raum;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    public Labor()
    {
        setGebaude("C");
        setRaum("C.03.27A");
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude, String raum,int stock, boolean beamer, int anzPlatze)
    {
        setGebaude(gebaude);
        setRaum(raum);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(anzPlatze);
    }
    
    public Labor(String gebaude,String raum, int stock, boolean beamer)
    {
        setGebaude(gebaude);
        setRaum(raum);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude,String raum, int stock)
    {
        setGebaude(gebaude);
        setRaum(raum);
        setStock(stock);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude,String raum)
    {
        setGebaude(gebaude);
        setRaum(raum);
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor(String gebaude)
    {
        setGebaude(gebaude);
        setRaum("C.03.27A");
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public void setGebaude(String gebaude)
    {
        this.gebaude = gebaude;
    }
    
    public void setRaum(String raum)
    {
        this.raum=raum;
    }
    
    public void setStock(int stock)
    {
        if ((stock>=0)&&(stock<=20))
        {
            this.stock=stock;
        }
        else
        {
            System.out.println(" Fehler, Üngultige Stock.Stock muss zwieschen 0 und 7 ");
        }
    }
    
    public void setBeamer(boolean beamer)
    {
        this.beamer=beamer;
    }
    
    public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze=anzPlatze;
    }
    
    public String getGebaude()
    {
        return gebaude;
    }
    
    public String getRaum()
    {
        return raum;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getAnzPlatze()
    {
        return anzPlatze;
    }
    
    
    public String getZimmernummer()
    {
        String Zimmernummer;
        int pos1;
        int pos2;
        pos1=raum.indexOf(".")+1;
        pos2=raum.lastIndexOf(".");
        
        Zimmernummer=raum.substring(pos2+1);
        
        return Zimmernummer;
    }
    
    
    public String getLaborstock()
    {
        String Laborstock;
        int pos1;
        int pos2;
        pos1=raum.indexOf(".");
        pos2=raum.indexOf(("."),pos1+1);
        Laborstock=raum.substring(pos1+1,pos2);
        
        return Laborstock;
 
    }


}