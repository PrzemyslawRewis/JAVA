/**
* klasa reprezentujaca
 */
public class Konto{
    private String numerKonta;
    private Kwota stanKonta;
    private Konto nastepny;

    public Konto(String id,Kwota k1)
    {
        numerKonta=id;
        Kwota nowaKwota=new Kwota(0,0)
        stanKonta=k1;
        nastepny=null;
    }
    public Kwota getStan()
    {
        return this.stanKonta;

    }
    public void setStan( Kwota k1 )
    {
        this.stanKonta=k1;
    }
    
    public String getID()
    {
        return this.numerKonta;
    }
    public Konto getNext()
    {
        return this.nastepny;
    }
    public Konto setNext(Konto k1)
    {
        nastepny=k1;
        return nastepny;
    }
    public String toString()
    {
        return "["+this.numerKonta+"] "+this.stanKonta.toString();
    }


}