![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


## Zadanie 1 - rozwiązywane z wykładowcą

1. Utwórz akcję dostępną pod pod adresem `/random/{max}` gdzie `max` będzie górną granicą zbioru z którego zostanie wylosowana liczba.
2. Wylosuj wartość od 1 do `max`.
3. Wyświetl w przeglądarce dane w następujący sposób: **Użytkownik podał wartość `max`. Wylosowano liczbę: wylosowana liczba**.



## Zadanie 2 - rozwiązywane z wykładowcą

1. Zmodyfikuj poprzednią akcję tak, aby przyjmowała dodatkowo wartość minimalną `min`.
2. Wylosuj wartość od `min` do `max`.
3. Wyświetl w przeglądarce dane w następujący sposób: **Użytkownik podał wartości** `min` i `max`.
 **Wylosowano liczbę:** `wylosowana liczba`.


## Zadanie 3

1. Utwórz akcję dostępną pod adresem `/hello/{firstName}/{lastName}` gdzie `firstName` oraz `lastName` będą pobranymi parametrami.
3. Wyświetl w przeglądarce dane w następujący sposób: **Witaj** `firstName lastName`.



## Zadanie 4

Stwórz dwie akcje:
1. Pierwsza akcja ma być przypisana do adresu `/form` i metody `GET`.
2. Utwórz katalogu **webapp** plik `form.jsp` a w nim formularz z polami tekstowymi o nazwach:
 - `paramName` 
 - `paramDate`  
Pierwsza akcja ma wyświetlać ten formularz, w tym celu skorzystaj z poniższego kodu:

```java
@RequestMapping("/form")
public String hello() {
    return "index.jsp";
}
```

2. Druga akcja ma być przypisana do adresu `/form` i metody `POST`.
3. Określając adresy wykorzystaj adnotacje `@GetMapping` oraz `@PostMapping`.
4. W metodzie obsługiwanej metodą POST odbierz, a następnie wyświetl parametr `paramName`.
5. W metodzie obsługiwanej metodą POST odbierz, przekształć do typu **LocalDate**,
 a następnie wyświetl parametr `paramDate`.
6. Data ma być podawana i wyświetlana w formacie `yyyy-MM-dd` 


## Zadanie 5

1. Dodaj do całego kontrolera przedrostek `/first`. 
2. Sprawdź, jak zmieniły się adresy akcji z poprzedniego zadania.
