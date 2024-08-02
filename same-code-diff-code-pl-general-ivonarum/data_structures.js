
// JavaScript Data Structures
// jedynie wartosci w cudzyslowie
// w odroznieniu od PY klucze nie są zapisane jako String > nie są w ""
let numbers = [1, 2, 3, 4, 5]; // LISTA

// SŁOWNIK o nazwie 'person'- obiekt
let person = {
  firstName: "John", 
  lastName: "Doe",
  age: 30
}; 

// w JS aby wywolac konkretny klucz, najpierw piszemy nazwę slownika
// person > nazwa slownika
// potem po "." piszemy, o ktory klucz nam chodzi
// kluczem jest tutaj 'firstname
console.log(numbers); // wyświetla elementy z listy 'numbers'
console.log(person.firstName); // slownik, a po kropce klucz - wyswietla wartosc klucza na konsolę

// przekopiowane z PY i po kosmetycznych zmianach (komentarze oraz zamiast print to console.log):
console.log(numbers) // wyświetla elementy z listy
console.log(numbers[0]) // w nawiasie okreslamy o jaki chodzi indeks, 1szym elementem (indeksem) tablicy jest zawsze '0'
console.log(numbers[1]) // wyswietlenie drugiego elementu (indeksu) tablicy

// przypisanie nowej wartosci (10) do 1szego elementu w tablicy, czyli indeksu 0
numbers[0] = 10
console.log(numbers[0]) // teraz 1szy element z listy jaki wyświetla to '10'