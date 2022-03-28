import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        wynik result = new wynik();
        wynik copy = new wynik();
        File f = new File("./todolists.obj");
        if (f.exists())
        {
            try {
                ObjectInputStream is = new ObjectInputStream(new FileInputStream("todolists.obj"));
                copy = (wynik) is.readObject();
                is.close();
                result = copy;

            } catch (Exception e) {
                e.printStackTrace();
            }
            boolean switcher = true;
            while (switcher) {
                System.out.println("Dostepne opcje:");
                System.out.println("a - utworzenie nowej listy");
                System.out.println("b - wybor jednej z istniejacych list ");
                System.out.println("c - wyjście z programu");
                String controler;
                DataWeb currentList=null;
                Scanner opcjaMenu = new Scanner(System.in);
                controler = opcjaMenu.nextLine();
                switch (controler) {
                    case "a" -> {
                        System.out.println("Podaj nazwe nowej listy");
                        String n;
                        Scanner nazwaNowejListy = new Scanner(System.in);
                        n = nazwaNowejListy.nextLine();
                        DataWeb lista = new DataWeb(n);
                        result.dodajListe(lista);
                    }
                    case "b" -> {

                        if(result.getL()!=null)
                        {
                            System.out.println("Wybierz liste");
                            System.out.println(result);
                            Scanner nazwaListyWpisana = new Scanner(System.in);
                            String n = nazwaListyWpisana.nextLine();
                            if (result.containsDescription(n))
                            {
                                currentList= result.containsDescriptionandReturnsList(n);

                            }
                            else
                            {
                                System.out.println("Zla nazwa");
                                continue;
                            }
                        }
                        System.out.println(currentList);
                        System.out.println("Dostepne opcje:");
                        System.out.println("i - dodanie zadania");
                        System.out.println("ii - usunięcie zadania ");
                        System.out.println("iii - powrót do głównego menu.");
                        String controler2;
                        Scanner opcjaPodmenu = new Scanner(System.in);
                        controler2 = opcjaPodmenu.nextLine();
                        switch (controler2) {
                            case "i":
                                System.out.println("Wpisz opis zadania");
                                Scanner opisZadania = new Scanner(System.in);
                                String description = opisZadania.nextLine();
                                while(true)
                                {
                                    System.out.println("Wpisz 1-10 priorytet");
                                    Scanner priorytet = new Scanner(System.in);
                                    int priority = priorytet.nextInt();
                                    if(1<=priority&&priority<=10)
                                    {
                                        Data Zadanie=new Data(priority,description);
                                        assert currentList != null;
                                        currentList.dodajZadanie(Zadanie);
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("Priorytet musi miec wartosc od 1 do 10");
                                    }
                                }
                                System.out.println("Lista po dodaniu");
                                System.out.println(currentList);
                                break;
                            case "ii":
                                boolean taskDeleteOK=false;
                                while(!taskDeleteOK)
                                {
                                    System.out.println("Ktore zadanie chcesz usunac");
                                    Scanner taskToDelete = new Scanner(System.in);
                                    int indexOfTaskToDelete = taskToDelete.nextInt();
                                    if(indexOfTaskToDelete>0)
                                    {
                                        taskDeleteOK=currentList.usunZadanie(indexOfTaskToDelete);
                                    }

                                    assert currentList != null;

                                }
                                System.out.println("Lista po usunieciu");
                                System.out.println(currentList);
                                break;
                            case "iii":
                                break;
                            default:
                                System.out.println("Wybierz poprawna opcje");
                                break;

                        }
                    }
                    case "c" -> {
                        try {
                            ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("todolists.obj.bak"));
                            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("todolists.obj"));
                            os.writeObject(result);
                            os1.writeObject(copy);
                            os1.close();
                            os.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        switcher = false;
                    }
                    default -> System.out.println("Wybierz poprawna opcje");
                }
            }


        }

    }
}

class Data implements Serializable
{
    private final int priorytet;
    private final String opisZadania;
    public Data(int x,String y)
    {
        priorytet=x;
        opisZadania =y;
    }
    public int getPriorytet()
    {
        return priorytet;

    }
    public String getOpisZadania()
    {
        return opisZadania;
    }

    @Override
    public String toString() {
        return
                "priorytet=" + getPriorytet() +
                ", opis zadania='" + getOpisZadania();
    }
}
class DataWeb implements Serializable
{
    ArrayList<Data> l;
    String nazwa;
    public DataWeb(String name)
    {
        l = new ArrayList<>();
        nazwa=name;
    }
    public void dodajZadanie(Data t)
    {
        l.add(t);
    }
    public boolean usunZadanie(int ktore)//true jesli sie udalo lub blad
    {

        try
        {
            if(0<ktore&&ktore<=l.size())
            {
                l.remove(ktore-1);
                return true;

            }
            else
            {
                System.out.println("Bład nie ma takiego zadania ");
                return true;
            }

        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Bład nie ma takiego zadania ");
            return true;
        }


    }
    public String toString(){
        l.sort(new myCmp());
        return "Nazwa listy: "+nazwa+l;
    }

    public String getNazwa() {
        return nazwa;
    }
}

class wynik implements Serializable
{


    ArrayList<DataWeb> l;
    public wynik()
    {
        l = new ArrayList<>();

    }
    public void dodajListe(DataWeb t)
    {
        l.add(t);
    }

    public String toString(){
        l.sort(new myCmp2());
        return l.toString();
    }

    public boolean containsDescription(String n)
    {
        for (DataWeb i : l)
        {
            if ((i.getNazwa()).equals(n))
                return true;

        }
        return false;

    }

    public DataWeb containsDescriptionandReturnsList(String n)
    {
        DataWeb newData=null;
        for (DataWeb i : l)
        {
            if((i.getNazwa()).equals(n))
            {
                newData = i;
                break;
            }

        }
        return newData;
    }

    public ArrayList<DataWeb> getL() {
        return l;
    }



}
class myCmp implements Comparator<Data>
{
    public int compare(Data a,Data b)
    {
        return Integer.compare(a.getPriorytet(), b.getPriorytet());
    }
}
class myCmp2 implements Comparator<DataWeb>
{
    public int compare(DataWeb a,DataWeb b)
    {
        return a.getNazwa().compareTo(b.getNazwa());
    }
}



