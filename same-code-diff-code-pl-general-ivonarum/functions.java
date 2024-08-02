
// Java Functions
public class functions {
    // public: Jest to modyfikator dostępu, który oznacza, że metoda main jest dostępna publicznie, czyli może być wywoływana z dowolnego miejsca w programie.
    // slowo STATIC oznacza, ze metoda main jest metodą statyczną, pozwala na wywołanie metody bez tworzenia obiektu klasy
    // okreslenie typu zwracanego
    // typ void nie zwraca wartosci
    // main: Jest to nazwa metody. W języku Java, metoda o nazwie main jest punktem wejścia do programu. 
    // Jest to miejsce, od którego zaczyna się wykonywanie programu.
    public static void main(String[] args) {
        

        greet("World"); // Wywołuje metodę greet
        System.out.println(add(5, 3)); // Wywołuje metodę add i wyswietla wynik funkcji na konsolę
    }

    // public-  modyfikator dostępu
    // slowo STATIC pozwala na wywołanie metody bez tworzenia obiektu klasy
    // okreslenie typu zwracanego
    // typ void nie zwraca wartosci
    // nazwa metody i podanie jej parametrów w nawiasie
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    // public: Jest to modyfikator dostępu
    // slowo STATIC pozwala na wywołanie metody bez tworzenia obiektu klasy
    // okreslenie typu zwracanego
    // typ zwracany to INT. 
    // jesli typ zwracany w JAVA jest inny niz VOID to musimy uzyc slowa kluczowego RETURN
    // nazwa metody i podanie jej parametrów w nawiasie
    public static int add(int a, int b) {
        return a + b; // zwrocenie sumy a+b
    }
}
