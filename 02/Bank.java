
public class Bank
{
    private Konto head;

    public Bank()
    {
        head=null;
    }

    public void utworzKonto(String s1)
    {
        Konto new_node=new Konto(s1,new Kwota(0,0));
        new_node.setNext(null);
        if(head==null)
        {
            head=new_node;

        }
        else
        {
            Konto last=head;
            while(last.getNext()!=null)
            {
                last=last.getNext();
            }
            last.setNext(new_node);
        }
    }

    public void wplataNaKonto(String s1, Kwota x1)
    {
        Konto last=head;
            while(last.getNext()!=null)
            {
                if(last.getID().equals(s1))
                {
                    Kwota wynik;
                    wynik=Kwota.dodaj(last.getStan(),x1);
                    last.setStan(wynik);
                    break;
                }
                else
                last=last.getNext();
            }

    }
    public void wyplataZKonta(String s1, Kwota x1)
    {
        Konto last=head;
            while(last.getNext()!=null)
            {
                if(last.getID().equals(s1))
                {
                    Kwota wynik;
                    wynik=Kwota.odejmij(last.getStan(),x1);
                    last.setStan(wynik);
                     break;
                }
                else
                last=last.getNext();
            }

    }

    public Kwota stanKonta(String s1)
    {
        Konto last=head;
        Kwota wynik;

        while(last.getNext()!=null)
            {
                if(last.getID().equals(s1))
                {
                    break;
                    
                    
                }
                else
                last=last.getNext();
            }
        return last.getStan();    

    }


    public String toString()
    {
        String wynik;
        Konto last=head;
        wynik=head.toString();
            while(last.getNext()!=null)
            {
                last=last.getNext();
                wynik+=last.toString();
            }
        return wynik;    

    }


}