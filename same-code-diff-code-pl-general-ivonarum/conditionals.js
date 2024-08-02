
// JavaScript Conditional Statements
let score = 85; // deklaracja i inicjalizacja zmiennej

//tworzymy blok decyzyjny -instrukcja if
if (score > 90) { // jesli ten warunek True to wykonaj ten kod
  console.log("Grade A"); // wyswietlanie na konsoli tekstu 'Grade A'
} else if (score > 75) { // jesli warunek przy IF jest False to wykonaj ten kod
  console.log("Grade B"); // wyswietlanie na konsoli tekstu 'Grade B'
} else { // jesli powyzsze warunki False to wykonaj ten kod
  console.log("Grade C or below");  // wyswietlanie na konsoli tekstu 'Grade C or below'
}

// Switch statement (not directly comparable to if-else but included for completeness)
let grade = 'B'; // deklaracja oraz inicjalizacja zmiennej char > 1 znak
// utworzenie switch wraz z podaniem  parametru w nawiasie
switch (grade) {
  case 'A': //porownanie parametru z A czy jest to true i wtedy wykonuje kod, tutaj sprawdza czy B = A
    console.log("Excellent"); //wyswietlenie na konsole 'Excellent'
    break; // zakoncz wykonywanie kodu jesli powyzszy kod zostal wykonany-chcemy aby program opuscil 'klamrę' '{'
  case 'B': //porownanie parametru z B
    console.log("Good"); //wyswietlenie na konsole 'Good'
    break; // zakoncz wykonywanie kodu jesli powyzszy kod zostal wykonany
  case 'C':  //porownanie parametru z C
    console.log("Fair"); //wyswietlenie na konsole 'Fair'
    break; // zakoncz wykonywanie kodu jesli powyzszy kod zostal wykonany
  default: // jak 'else' dla 'if' czyli jesli zaden z case'ów nie bedzie True to wykonaj ten kod
    console.log("Poor"); // wyswietlanie na konsole 'poor'
    break; // zakoncz wykonywanie kodu jesli powyzszy kod zostal wykonany
}


let wiek=17; // deklaracja oraz inicjalizacja zmiennej int > liczba calkowita
if(wiek>=18){ // warunek pierwszy, jesli True, to wykonaj kod
  console.log("Możesz kupić alkohol");  //wyswietlenie na konsole Możesz kupić alkohol
}else{ // jesli powyzszy warunek False to wykonaj ten kod
  console.log("Nie możesz kupić alkoholu"); //wyswietlenie na konsole Nie możesz kupić alkoholu
}
