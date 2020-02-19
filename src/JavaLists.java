import java.util.ArrayList;
import java.util.List;

public class JavaLists {
    //1.Scrieti o metoda Java, care sa primeasca parametru
    // o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
    public static void getList(List<Integer> l){
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    //2.Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru sa fie o lista de numere, si celalalt un numar
    // (real sau intreg). Metoda sa adauge numarul primit ca si parametru
    // la final de lista.
    public static void insertInList(List<Integer>l,Integer nr){
        l.add(nr);
    }
    //3.Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile
    // din lista, fiecare pe rand nou, pornind de la numarul intreg
    // primit ca si parametru.
    public static void getListStartingIndex(List<Integer> l,int poz){
        for(int i=poz;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista,
    // dar invers(de la capat la inceput).
    public static void reverseElemList(List<Integer>l){
      for(int i=l.size()-1;i>=0;i--){
          System.out.println(l.get(i));
      }
    }
    //5. Scrieti o metoda Java, care sa primeasca trei parametrii:
    // unul de tip Lista de String-uri, unul de tip intreg, si
    // unul de tip String. Metoda sa adauge parametrul de tip
    // String in lista primita, iar parametrul de tip intreg
    // reprezinta pozitia la care sa fie pus acel String.
    public static void addElemOnPoz(List<String>l,int poz,String elem){
        l.add(poz,elem);
    }
    public static void getStringList(List<String> l){
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
    //6.Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al
    // doilea parametru si sa il adauge pe prima pozitie din lista
    public static void addElemPoz1(List<Integer> l,Integer elem){
        l.add(0,elem);
    }
    //7.Scrieti o metoda Java care sa primeasca parametru o
    // Lista, si sa afiseze ce valori are lista, si ce
    // pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public static void getPozAndElemList(List<Integer> l){
        for(int i=0;i<l.size();i++){
            System.out.println("Pe poz "+i+" valoarea "+l.get(i));
        }
    }
    //8.Scrieti o metoda Java care sa primeasca o Lista
    // si sa returneze cel mai mare numar din ea.
    public static Integer maxFromList(List<Integer> l){
        Integer max=l.get(0);
        for(int i=1;i<l.size();i++){
            if(l.get(i)>max){
                max=l.get(i);
            }

        }
        return max;
    }

    public static void main(String args[]){
        //1.
        List<Integer> l= new ArrayList<Integer>();
        l.add(3);
        l.add(99);
        l.add(68);
        getList(l);
        System.out.println();
        //2.
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(3);
        l1.add(99);
        l1.add(68);
        insertInList(l1,11);
        getList(l1);
        System.out.println();
        //3.
        List<Integer> l2= new ArrayList<Integer>();
        l2.add(5);
        l2.add(56);
        l2.add(45);
        l2.add(46);
        getListStartingIndex(l2,2);
        System.out.println();
        //4.
        List<Integer> l3= new ArrayList<Integer>();
        l3.add(5);
        l3.add(56);
        l3.add(45);
        l3.add(46);
        reverseElemList(l3);
        System.out.println();
        //5.
        List<String> l4=new ArrayList<String>();
        l4.add("Nu");
        l4.add("stiu");
        l4.add("ce messaj");
        l4.add("sa pun");
        addElemOnPoz(l4,4,"Nici eu");
        getStringList(l4);
        //6.
        List<Integer> l5= new ArrayList<Integer>();
        l5.add(5);
        l5.add(56);
        l5.add(45);
        l5.add(46);
        addElemPoz1(l5,60);
        getList(l5);
        //7.
        List<Integer> l6= new ArrayList<Integer>();
        l6.add(5);
        l6.add(56);
        l6.add(45);
        l6.add(46);
        getPozAndElemList(l6);
        //8.
        System.out.println(maxFromList(l6));

    }
}
