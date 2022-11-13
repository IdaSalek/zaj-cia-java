import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Uczen> lista_uczniow= new ArrayList<>();
        lista_uczniow.add(new Uczen());
        lista_uczniow.add(new Uczen());
        lista_uczniow.get(0).jakieImie();
        lista_uczniow.get(1).jakieImie();

        Uczen[] lista_uczniów = new Uczen[0];
        for(Uczen uczen : lista_uczniów){
            uczen.jakieImie();
            
        }
        



    }
}
