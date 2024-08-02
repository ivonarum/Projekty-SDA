
# Python Conditional Statements # Python operuje nie na klamrach a na tabulatorach-wcieciach
score = 85 # deklaracja i inicjalizacja zmiennej, podano wartość 85

if score > 90: #warunek do wykonania ponizszego kodu, wciecia są krytyczne
    print("Grade A") #blok kodu do wykonania jesli warunek if jest true, wyswietla na konsoli "Grade A"
elif score > 75: # jesli if jest false to sprawdz ten warunek i jesli true to wykonaj ponizszy kod
    print("Grade B") # wyswietla na konsoli "Grade B"
else: # wykonaj ponizszy kod jesli inne warunki są false
    print("Grade C or below") # wyswietla na konsoli "Grade C or below"

# dodatek
"""
komentarz wielonijkowy
komntarz
"""

lang = "java"
match lang:
    case "javascript":
        print("you can become a web developer.")

wiek = 65
if wiek >= 65:
  print("Możesz przejsc na emeryture")
else:
  print("Nie możesz przejsc na emer")

  