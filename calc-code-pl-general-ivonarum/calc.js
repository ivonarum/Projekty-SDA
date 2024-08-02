
// JavaScript Simple Calculator
console.log("JavaScript Calculator"); 
// aby zdefiniować funkcję używamy słowa kluczowego 'function' (w PY 'def')
// parametry w nawiasie po nazwie funkcji (tak samo jak w PY)
// słowo kluczowe RETURN aby utworzyć ciało funkcji
// ciało funkcji jest w klamrze (w PY tylko wcięcie)
function addJs(a, b) { return a + b; } // funkcja dwuparametrowa-dodawanie znakiem '+'
function subtractJs(a, b) { return a - b; } // funkcja odejmowania utworzona za pomocą znaku '-'
function multiplyJs(a, b) { return a * b; } // funkcja mnożenia utworzona znakiem '*' 
function divideJs(a, b) { return a / b; } // funkcja dzielenia utworzona znakiem '/' 

// JAVA, JS, PY tak samo wywołuje się funkcje: nazwa funkcji i wartość parametrów w nawiasie
// console.log (w PY 'print') i w nawiasie kod wywołania funkcji od razu wyświetla jej wynik na konsoli 
console.log(addJs(10, 5)); // wyświetla wynik funkcji add (10+5)
console.log(subtractJs(10, 5)); // wyświetla wynik funkcji substract (10-5)
console.log(multiplyJs(10, 5)); // wyświetla wynik funkcji multiply (10*5)
console.log(divideJs(10, 5)); // wyświetla wynik funkcji divide (10/5)
