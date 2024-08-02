
# Python Data Structures
# deklaruje nazwe listy - 'numbers'
# w nawiasach kwadratowych po przecinku wypisujemy elementy listy
numbers = [1, 2, 3, 4, 5] # LISTA

# SŁOWNIK tworzy strukture klucz-wartość
# gdy zapytamy o konkretny klucz w odpowiedzi zwraca jego wartość
person = { # klamra zawiera pary klucz-wartość
    # ustanowienie pary klucz-wartość; kolejne oddzielone sa przecinkiem
  "firstName": "John",
  "lastName": "Doe",
  "age": 30
} # Słownik w klamrze {}


print(person["firstName"]) #  wywołuje i wyswietla wartosc klucza firstName w słowniku

print(numbers) # wyświetla elementy z listy
print(numbers[0]) # w nawiasie okreslamy o jaki chodzi indeks, 1szym elementem (indeksem) tablicy jest zawsze '0'
print(numbers[1]) # wyswietlenie drugiego elementu (indeksu) tablicy

# przypisanie nowej wartosci (10) do 1szego elementu w tablicy, czyli indeksu 0
numbers[0] = 10
print(numbers[0])