
# Python Functions
# zaczynamy od slowa KLUCZOWEGO 'def', potem nazwa METODY, w nawiasie podany jest PARAMETR
# jest to funkcja parametrowa
def greet(name):
    # WYSWIETLENIE SLOWA hELLO
    # nastepnie przez + poza "" mozemy łączyć zmienne/parametry ze sztywno wpisanym tekstem
    print("Hello, " + name + "!") 

greet("World") # Invokes the greet function > wywolanie metody funkcji greed, okreslenie parametru

# funkcja dwuparametrowa, parametr a i parametr b
def add(a, b):
    # slowo kluczowe RETURN okresla co ma zwracać funkcja
    return a + b
# przez to, ze metoda jest w PRINT to wynik jej dzialania zostanie wyswietlony na konsolę
# metoda ADD z dwoma parametrami została wywołana w PRINT
print(add(5, 3)) # Invokes the add function > wywoluje funkcję add dla danej wartości parametrów a i b; i od razu wyświetla jej wynik na konsolę
