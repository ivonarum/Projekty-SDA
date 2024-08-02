
// Java Loops
public class loops {
    public static void main(String[] args) {
        // For loop
        //  wpetli for jako 1 czlon tworzymy iterator dla petli
        // jako 2 czlon - warunek logiczny pętli
        // ostatni człon to zwiekszenie iteratora o 1 przez wpisanie i++
        // i++ > inkrementacja
        // i-- > dekrementacja
        for (int i = 0; i < 5; i++) { // 'i++' to się równa i = i+1, a 'i--' to znaczy i = i-1
            System.out.println(i); // wyswietlanie wartosci zmiennej na konsolę
        }

        // While loop
        int j = 0; // utworzenie zmiennej
        while (j < 5) { // utworzenie warunku
            System.out.println(j); // wyswietlanie wartosci zmiennej j na konsolę
            j++; // powiekszenie zmiennej j o 1
        }
    }
}
