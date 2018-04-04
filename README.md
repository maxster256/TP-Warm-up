# TP-Warm-up
First list for the Programming Technologies (TP) course labs at WUST.

## 0 Java JDK
Zakładam, z ̇e masz pobrane Java Development Kit i pytania takie jak to sa ̨ juz ̇ za Toba ̨. 1 Zintegrowane s ́rodowisko programistyczne

Zadanie 1 — Pobierz aktualna ̨ wersje ̨ Eclipse IDE for Java Developers. Aby zapoznac ́ sie ̨ ze s ́ro- dowiskiem przejrzyj naste ̨puja ̨ce rozdział pomocy: Help > Help Contents:
> Workbench User Guide > Eclipse platform overview,
> Workbench User Guide > Getting Started > Basic tutorial,
> Java development user guide > Getting Started > Basic tutorial.
W ostatnim punkcie zwróc ́ szczególna ̨ uwage ̨ na sekcje: Debugging your programs oraz Writing and running JUnit tests. Odpowiedz na pytania prowadza ̨cego. (10 p.)

## 2 Testy jednostkowe
Testy jednostkowe testuja ̨ oprogramowanie na poziomie działania pojedynczych metod. Ich główna ̨zaleta ̨jest moz ̇liwos ́c ́ wykonywania na biez ̇a ̨co w pełni zautomatyzowanych testów. Dzie ̨ki temu, błe ̨dy w modyfikowanym kodzie wychwytywane sa ̨ od razu gdy sie ̨ pojawia ̨. Testy jednost- kowe najcze ̨s ́ciej sa ̨ pisane nie przez testerów, a przez samych programistów i w aktualnie obo- wia ̨zuja ̨cych metodykach tworzenia oprogramowania odgrywaja ̨bardzo istotna ̨role ̨. Moga ̨byc ́ tez ̇ forma ̨ specyfikacji wymagan ́ (sprawdz ́: test-driven development).
JUnit jest jednym z najpopularniejszych frameworków (szkieletów ułatwiaja ̨cych budowe ̨ apli- kacji) umoz ̇liwiaja ̨cym łatwe pisanie oraz wykonywanie testów jednostkowych dla oprogramowa- nia tworzonego w je ̨zyku Java (dla C# mamy np. NUnit). Testowanie w JUnit polega na spraw- dzaniu asercji, czyli na weryfikacji czy metody testowanej klasy zachowuja ̨ sie ̨ zgodnie z oczeki- waniami. W JUnit 3 testowanej klasie KlasaX odpowiada klasa KlasaXTest dziedzicza ̨ca po junit.framework.TestCase i zawieraja ̨ca testy dla metod klasy KlasaX. JUnit 4 wprowadza uspraw- nienia oparte głównie na mechanizmie adnotacji (ang. annotations). Wie ̨kszos ́c ́ nowoczesnych fra- meworków wykorzystuje adnotacje, dzie ̨ki nim rozwia ̨zania sa ̨ czytelniejsze. 10 wrzes ́nia 2017 ogłoszono wydanie JUnit 5: http://junit.org/junit5/.

Zadanie 2 — Pobierz kod z ́ródłowy JUnit 3.8. Zapoznaj sie ̨ z metodami klasy Assert z pakietu junit.framework oraz z przykładami testów zawartymi w pakiecie junit.samples. Moz ̇esz tez ̇ przej- rzec ́ krótkie szkolenie do JUnit (np. [1], [2]). Dla czytelnos ́ci kodu w praktyce bardzo waz ̇ne jest konsekwentne stosowanie standardowych konwencji nazewniczych, zobacz popularne konwencje. Wybierz jedna ̨ z konwencji i staraj sie ̨ jej przestrzegac ́.
     
Zadanie 3 — Zdefiniuj klase ̨ Deck przechowuja ̨ca ̨ tablice ̨ obiektów typu Card oraz zawieraja ̨ca ̨ metody do ich tasowania, sortowania, a takz ̇e metode ̨ zwracaja ̨ca ̨ karte ̨ z góry stosu. Konstruktor klasy powinien umoz ̇liwic ́ zdefiniowanie, czy talia ma 52 karty czy 32 karty (od siódemek) czy 24 karty (od dziewia ̨tek). Wykorzystuja ̨c JUnit 3 utwórz klase ̨ do testowania metod klasy Deck. Wykorzystaj co najmniej 5 róz ̇nych metod klasy Assert. (10 p.)
Zadanie 4 — Wykorzystuja ̨c JUnit 4 utwórz klase ̨ do testowania metod klasy Deck. Wykorzystaj adnotacje: @Test, @Test(expected = ...), @Test(timeout=...), @Before, @After, @Ignore. (5 p.)

## 3 System kontroli wersji
Pliki wchodza ̨ce w skład projektu sa ̨ modyfikowane przez wielu członków zespołu. System kontroli wersji to narze ̨dzie słuz ̇a ̨ce do s ́ledzenia zmian oraz pomocy w ła ̨czeniu zmian wprowa- dzonych przez róz ̇ne osoby. Systemy kontroli wersji ze wzgle ̨du na architekture ̨ moz ̇na podzielic ́ na scentralizowane, oparte na architekturze klient–serwer (np. CVS, SVN) oraz rozproszone, oparte na architekturze peer-to-peer (np. Git). Rozwia ̨zania scentralizowane wykorzystuja ̨ jedno główne repozytorium, z którym członkowie zespołu synchronizuja ̨ swoje zmiany. Rozwia ̨zania rozpro- szone umoz ̇liwiaja ̨ prowadzenie wielu równorze ̨dnych i niezalez ̇nych gałe ̨zi, które moga ̨ byc ́ ze soba ̨ dowolnie synchronizowane. Poniz ̇ej znajduje ̨ sie ̨ zadanie dotycza ̨ce SVN. O systemie Git be ̨dziemy mówic ́ wkrótce.

Zadanie 5 — Znajdz ́ w Internecie serwer umoz ̇liwiaja ̨cy nieodpłatne prowadzenie repozytorium SVN (np. www.riouxsvn.com). Zarejestruj sie ̨ i utwórz nowe repozytorium. Zainstaluj w Eclipse plug-in do obsługi repozytorium SVN (np. Help→Eclispe Marketplace→Find: Subclipse) i zapoznaj sie ̨ z jego instrukcja ̨ obsługi (np. tu). Poła ̨cz sie ̨ przez Eclipse ze swoim repozytorium i umies ́c ́ w nim klasy napisane w ramach Zadania 3 i 4. Nadaj koledze lub kolez ̇ance uprawnienia do wprowadzania zmian w repozytorium i popros ́ o pobranie plików, dopisanie w Eclipse testu dla klasy Deck i umieszczenie zmian w repozytorium. Wraz z partnerem spróbuj wywołac ́ konflikt a naste ̨pnie go rozwia ̨z ̇ (patrz: tu). Przedstaw historie ̨ zmian w repozytorium prowadza ̨cemu. (10 p.)
