import java.util.*;
class Dane implements Cloneable 
{
    private int d;
    public Dane(int i)
    {
        d=i;
    }
    public void set(int is)
    {
        d=is;
    }
    public boolean equals(Object anObject)
    {
        if(this== anObject) return true;
        if (anObject instanceof Dane)
        {
            Dane anotherDane=(Dane) anObject;
            if(anotherDane.d==d) return true; 
        }
        return false;

    }
    public int hashCode()
    {
        return (int) d;
    }
    public Dane clone() 
    {    
        return new Dane(d);  
    
    }
    public int wynik(int s) throws ZaMaloDanychException,UjemnyParametrException
    {
        if(s<0)
        {
            throw new UjemnyParametrException();
        }
        if(s<10)
        {
            throw new ZaMaloDanychException();

        }
        return s;
    }
    public int innyWynik(int x) throws ZaMaloDanychException,UjemnyParametrException,Exception
    {
        if(x<0)
        {
            Exception e= new UjemnyParametrException("n= "+x);
            
            throw e;
        }
        if(x<10)
        {
            Exception e= new UjemnyParametrException("n= "+x);
            
            throw e;

        }
        return d;
    }


}
class ZaMaloDanychException extends Exception{
    String err="";
    public ZaMaloDanychException()
    {

    }
    public ZaMaloDanychException(String s1)
    {
        err=s1;

    }

   
 
}
class UjemnyParametrException extends RuntimeException{
    String err="";
    public UjemnyParametrException()
    {

    }
    public UjemnyParametrException(String s1)
    {
        err=s1;

    }

}
