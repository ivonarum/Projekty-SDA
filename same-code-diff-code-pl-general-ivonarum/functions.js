
// JavaScript Functions
// slowo kluczowe FUNCTION (W pythonie 'DEF') rozpoczyna tworzenie metody
function greet(name) { // na konsole wyswietl napis, ktorty uzywa parametru dostarczonego w metodzie
  // czyli hello plus parametr plus !
  console.log("Hello, " + name + "!"); // wyswietla na konsolę tekst hello plus parametr plus tekst !
}

greet("World"); // wywoluje fiukcję greet 
                // z parametrem określonym jako tekst 'world'

// funkcja dwuparametrowa, slowo kluczone CONST
// po strzałce => określone co ma zwrocic funkcja
const add = (a, b) => a + b;
console.log(add(5, 3)); // wywoluje funkcję add dla danej wartości parametrów a i b; 
                        // i od razu wyświetla jej wynik na konsolę
