
# Python Simple Calculator
print("Python Calculator") 
# aby zdefiniować funkcję używamy słowa kluczowego 'def' (w JS 'function')
def add_py(a, b): # parametry w nawiasie po nazwie funkcji (tak samo jak w JS)
    return a + b # słowo kluczowe RETURN aby utworzyć c.iało f.unkcji (w JS c.f. jest w klamrze)
def subtract_py(a, b): # funkcja substract dwuparametrowa (parametry po przecinku)
    return a - b # funkcja odejmowania utworzona za pomocą znaku '-'
def multiply_py(a, b): # funkcja multiply dwuparametrowa
    return a * b # funkcja mnożenia utworzona znakiem '*'
def divide_py(a, b): # funkcja divide dwuparametrowa
    return a / b # funkcja dzielenia utworzona znakiem '/'

# JAVA, JS, PY tak samo wywołuje się funkcje: nazwa funkcji i wartość parametrów w nawiasie
# print i w nawiasie kod wywołania funkcji od razu wyświetla jej wynik na konsoli 
print(add_py(10, 5)) # wyświetla wynik funkcji add (10+5)
print(subtract_py(10, 5)) # wyświetla wynik funkcji substract (10-5)
print(multiply_py(10, 5)) # wyświetla wynik funkcji multiply (10*5)
print(divide_py(10, 5)) # wyświetla wynik funkcji divide (10/5)
