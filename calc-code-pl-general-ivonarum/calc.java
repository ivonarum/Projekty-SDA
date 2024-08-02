
// Java Simple Calculator
// Java jest językiem obiektowym, co oznacza, że większość kodu pisze się wewnątrz klas. 
// public class nazwaKlasy 
public class Calc {
    // używamy słowa kluczowego 'public static'. 
    // Następnie podajemy typ ('void' - nie zwraca wartości)
    public static void main(String[] args) {
        // JAVA, JS, PY tak samo wywołuje się funkcje: nazwa funkcji 
        // i wartość parametrów w nawiasie
        // system.out.println (w PY 'print', w JS 'console.log') i w nawiasie kod 
        // wywołania funkcji od razu wyświetla jej wynik na konsolę 
        System.out.println("Java Calculator"); // wyswietla tekst na konsolę
        System.out.println(addJava(10, 5)); // wyświetla wynik funkcji add (10+5)
        System.out.println(subtractJava(10, 5)); //wyświetla wynik funkcji substract (10-5)
        System.out.println(multiplyJava(10, 5)); // wyświetla wynik funkcji multiply (10*5)
        System.out.println(divideJava(10, 5)); // wyświetla wynik funkcji divide (10/5)
    }
    
    // Funkcje w Javie są często nazywane metodami, ponieważ są związane z obiektami.
    // używamy słowa kluczowego 'public static'. 
    // Następnie podajemy typ wyniku funkcji ('int' - zwraca wartość liczbową stałoprzecinkową)
    // parametry w nawiasie po nazwie funkcji
    // parametry mają określony typ np. 'int' (w przeciwienstwie do JS i PY)
    // słowo kluczowe RETURN aby utworzyć ciało funkcji (jak w JS i PY)
    // ciało funkcji jest w klamrze (tak jak w JS)
    public static int addJava(int a, int b) { return a + b; } // funkcja dwuparametrowa-dodawanie znakiem '+'
    public static int subtractJava(int a, int b) { return a - b; } // funkcja odejmowania utworzona za pomocą znaku '-'
    public static int multiplyJava(int a, int b) { return a * b; } // funkcja mnożenia utworzona znakiem '*' 
    public static int divideJava(int a, int b) { return a / b; } // funkcja dzielenia utworzona znakiem '/' 
}
