
// Java Conditional Statements
public class conditionals {
    public static void main(String[] args) {
        // deklaracja (int score) i inicjalizacja zmiennej liczbowej ( = 85) z przypisaniem wartości
        int score = 85;

        // deklaracja instrukcji if, potem w nawiasie podany warunek nr1
        if (score > 90) {
            // jesli powyzszy warunek spelniony - True- (uzyskuje logiczna prawde) wykona ten bloku kodu, ale nie wykona pozostalych
            System.out.println("Grade A"); // wyswietla na sztywno ustawiony tekst 'Grade A'
            // jesli warunek w if to False-nie jest spelniony, mozemy dodac kolejny warunek (nr2) poprzez 'else if'
        } else if (score > 75) {
            // jesli warunek nr2 - elseif - jest True to wykonam ten blok kodu
            System.out.println("Grade B"); // wyswietla na sztywno ustawiony tekst 'Grade B'
            // jesli zaden z warunkow nie jest spelniony-False- przechodzimy do "else"
        } else {
            // ten kod wykona jesli zaden inny blok nie zostanie wykonany
            System.out.println("Grade C or below"); // wyswietla na sztywno ustawiony tekst 'Grade C or below'
        }



        //operatory logiczne
        // > -wieksze
        // < - mniejsze
        // == logiczna rownosc
        // >= -wieksze rowne
        // <= -mniejsze rowne
        // != -sprzecznosc

        // inicjalizacja i deklaracja zmiennej
        int wiek = 18;

        if(wiek>=18){
            System.out.println("Możesz kupić alkohol");
        }else{
            System.out.println("Nie możesz kupić alkoholu");
        }
        

        String slowo = "nic";

        if(slowo.equals("nic")){
            System.out.println("jest ok");
        } else {
            System.out.println("nie jest ok");

        }


    }
}
