public class Kwota
{
    private  int zlotowki;
    private  int grosze;
    public Kwota(int l1,int l2)
    {
        zlotowki=l1;
        grosze=l2;
    }
    public int ile()
    {
        return zlotowki*100+grosze;
    } 
    static public Kwota dodaj(Kwota k1,Kwota k2)
    {
        int wynik;
        wynik=k1.ile()+k2.ile();
        Kwota k3=new Kwota(wynik/100,wynik%100);
        return k3;
    }
    static public Kwota odejmij(Kwota k1,Kwota k2)
    {
        int wynik;
        wynik=k1.ile()-k2.ile();
        Kwota k3=new Kwota(wynik/100,wynik%100);
        return k3;
    }
    public void set(int l1,int l2)
    {
           zlotowki=l1;
           grosze=l2;
        
    }
    public String toString()
    {
        return zlotowki+"zl "+grosze+"gr";
    }

}

