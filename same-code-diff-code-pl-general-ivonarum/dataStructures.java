
// Java Data Structures
// rozszerzyc funkcjonalnnosc JAVY przez import
import java.util.ArrayList;
import java.util.HashMap;

// UWAGA w JAVA mamy tablice i listy

public class dataStructures {
    public static void main(String[] args) {
        System.out.println("");

        // TABLICA - na sztywno określony rozmiar, np. tu pamięć zawsze na 5 indeksów
        // np. jesli {1,2,3,0,0} to i tak pamięć na 5 indeksów
        int tablica[] = {1,2,3,4,5};  // typ i nazwa metody, w klamrze elementy po przecinku
        System.out.println(tablica[0]); // wyświetla na konsolę 1szy indeks(element)


        // LISTA - może się rozszerzać lub zwężać, gdy pusty indeks-zwęża się
        // int -prosta liczba, Integer -obiekt
        // po slowie ARRAYLIST w takich nawiasach <> definiujemy typ listy
        // po = jest jej nazwa ze slowem new i powtórzony typ
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // dodawanie kolejnych elementów do listy
        numbers.add(1); 
        numbers.add(2); 
        // aby dodac kolejny element do listy nie potrz inf o ktory indeks nam chodzi
        // przez wywolanie add na liscie tworzony jest nowy indeks i zarazem wypelniony jest dana wartoscia
        numbers.add(3); 
        numbers.add(4); 
        numbers.add(5);
System.out.println(numbers); // wyswietla elementy listy


    // HASHMAPA - przechowuje pary klucz-wartość
        // najpierw slowo HASHMAP, potem w <> typy obiektów: 
        // klucze są typu String, a wartości są typu Object
        // po typach obiektow wpisujemy nazwe HashMap
        HashMap<String, Object> person = new HashMap<String, Object>();
        // na obiekcie mapy - person to obiekt mapy
        // uzycie metody to wywołanie metody na obiekcie przez napisanie ".coś" na obiekcie
        person.put("firstName", "John");
        // 
        person.put("lastName", "Doe");
        person.put("age", 30);

        System.out.println(numbers);  // wyswietla elementy listy
        System.out.println(person.get("firstName")); // wywołuje i wyswietla wartosc klucza firstName na obiekcie person w HashMapie 
}
