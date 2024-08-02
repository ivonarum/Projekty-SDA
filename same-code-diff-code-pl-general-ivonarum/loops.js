
// JavaScript Loops
// For loop
//  wpetli for jako 1 czlon tworzymy iterator dla petli
// jako 2 czlon - warunek logiczny pętli
// ostatni człon to zwiekszenie iteratora o 1 przez wpisanie i++
// i++ > inkrementacja
// i-- > dekrementacja
for (let i = 0; i < 5; i++) { // 'i++' to się równa i = i+1, a 'i--' to znaczy i = i-1
  console.log(i); // wyswietlanie wartosci zmiennej na konsolę
}

// While loop
// jest b podobna do pętli w pythonie
let j = 0; // utworzenie zmiennej
while (j < 5) { // utworzenie warunku
  console.log(j); // wyswietlanie wartosci zmiennej na konsolę
  j++; // powiekszenie zmiennej j o 1
}

// Do-while loop
let k = 0; // najpierw wartosc zmiennej a na koncu warunek, petla wykona sie przynajmniej raz
do { // slowo kluczowe (zarezerwowane dla danego jezyka) 'do' podkreślane innym kolorem
  console.log(k); // wyswietlanie wartosci zmiennej na konsolę
  k++; // inkrementacja
} while (k < 5); // sprawdzenie warunku na samym końcu
