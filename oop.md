# Ami minden feladatra vonatkozik
A feladatban megadott Objektum, Class és metódus elnevezésektől el lehet térni. Nem szignatúrákat adtunk meg, csak javaslatot az elnevezésre. A feladatokat objektum orientáltan kell megoldani. A lehető legkevesebb logikát írjátok a Main classba. A feladatok csak irányt mutatnak, gyakorlási javaslatok, de tovább is fejleszthetők a saját fantáziátoknak megfelelően. Akár plusz bónuszokat is beletehettek, vagy egyszerűsíthettek is rajtuk. A lényeg, hogy az OOP irányelveket gyakoroljátok.

**Sok sikert!**
## 1. Sugárzott növények
Egy bolygón különböző fajtájú növények élnek, minden növény tápanyagot használ. Ha egy növény tápanyaga elfogy (a mennyisége 0 lesz), a növény elpusztul. A bolygón három fajta sugárzást különböztetünk meg: alfa sugárzás, delta sugárzás, nincs sugárzás. A sugárzásra a különböző fajtájú elő növények eltérő módon reagálnak. A reakció tartalmazza a tápanyag változását, illetve a következő napi sugárzás befolyásolását. A másnapi sugárzás alakulása: ha az alfa sugárzásra beérkezett igények összege legalább hárommal meghaladja a delta sugárzás igényeinek összegét, akkor alfa sugárzás lesz; ha a delta sugárzásra igaz ugyanez, akkor delta sugárzás lesz; ha a két igény közti eltérés háromnál kisebb, akkor nincs sugárzás. Az első nap sugárzás nélküli. Minden növény jellemzői: az egyedi neve, a rendelkezésre álló tápanyag mennyisége, hogy él-e. A szimulációban részt vevő növények fajtái a következők: puffancs, deltafa, parabokor. A következőkben megadjuk, hogy az egyes fajták miként reagálnak a különböző sugárzásokra. Először a tápanyag változik, és ha a növény ezután él, akkor befolyásolhatja a sugárzást.
* **Puffancs:** Alfa sugárzás hatására a tápanyag mennyisége kettővel nő, sugárzás mentes napon a tápanyag eggyel csökken, delta sugárzás esetén a tápanyag kettővel csökken. Minden esetben úgy befolyásolja a másnapi sugárzást, hogy 10 - tápanyag értékben növeli az alfa sugárzás bekövetkezését. Ez a fajta akkor is elpusztul, ha a tápanyag mennyisége 10 fölé emelkedik.
* **Deltafa:** Alfa sugárzás hatására a tápanyag mennyisége hárommal csökken, sugárzás nélküli napon a tápanyag eggyel csökken, delta sugárzás hatására a tápanyag néggyel nő. Ha a tápanyag mennyisége 5-nél kisebb, akkor 4 értékben növeli a delta sugárzás bekövetkezését, ha 5 és 10 közé esik, akkor 1 értékben növeli a delta sugárzás bekövetkezését, ha 10-nél több, akkor nem befolyásolja a másnapi sugárzást.
* **Parabokor:** Akár alfa, akár delta sugárzás hatására a tápanyag mennyisége eggyel nő. Sugárzás nélküli napon a tápanyag eggyel csökken. A másnapi sugárzást nem befolyásolja.

Készítsünk programot a növények viselkedésének és a sugárzás szimulálására. Hozzunk létre egy olyan **bolygó objektumot**, ahol a szimuláció végbemegy. A bolygó objektum tartalmazza a rajta növő növények listáját. Legyen a bolygónak egy oneDayOnThePlanet() metódusa, mely egy nap eseményeit simulálja és a main-en belül hívjuk meg. Szintén szükség lesz egy plantsAlive() metódusra, mely kiprinteli a még életben lévő növényeket név szerint. Nézzük meg, mi történik 1 nap, 2 nap és 10 nap után a növényeinkkel, ha a kezdő tápanyag mennyiség mindegyiknél 5 egység.

## 2. Lények versenye
Egy többnapos versenyen lények vesznek részt. A versenyt az a lény nyeri, akiéletben marad, és a legnagyobb távolságot teszi meg. Kezdetben minden lényvalamennyi vízzel rendelkezik, és a megtett távolság 0. A verseny során háromfélenap lehetséges: napos, felhős és esős. Ezekre a különböző fajtájú lények eltérőmódon reagálnak vízfogyasztás és haladás szempontjából. Minden lény először arendelkezésére álló víz mennyiségét változtatja meg, ezután ha tud, mozog. Bármelylény elpusztul, ha a vize elfogy (0 lesz az érték), ezután értelemszerűen semmilyen tevékenységre sem képes.

Minden lény jellemzői: az egyedi neve, a rendelkezésre álló víz mennyisége, amaximálisan tárolható víz mennyisége, hogy él-e, illetve az eddig megtett távolság. A versenyen részt vevő lények fajtái a következők: homokjáró, szivacs, lépegető.

A következő táblázat tartalmazza az egyes fajták jellemzőit.
| Fajta     | Víz változás          | Távolság              | Max. víz |
| :-------: | :-------------------: | :-------------------: | :------: |
|           | napos / felhős / esős | napos / felhős / esős |          |
| homokjáró |   -1  /   0    /  3   |   3   /   1    /  0   |     8    |
|  szivacs  |   -4  /  -1    /  6   |   0   /   1    /  3   |    20    |
| lépegető  |   -2  /  -1    /  3   |   1   /   2    /  1   |    12    |

Az egyes lények a vízkészlet megváltoztatása során nem léphetik túl a fajtára jellemző maximális értéket, legfeljebb azt érhetik el. Valósítsuk meg a versenyt megnyerő lényt megadó programot. Az időjárás az alábbiak szerint alakuljon – ahol n = napos, f = felhős és e = esős: nffeeennf

A versenyzők a következők legyenek:
* **Vandor a homokjáró**, 4 egység kezdeti vízzel
* **Seta a lépegető**, 7 egység vizet vitt magával
* **Csuszo a szivacs**, 12 egység vitt magával
* **Siklo a szivacs**, 10 egyszég vizet vitt magával.

Bónusz feladat: Az időjárás változzon random módon napról napra, és minden lény a fajtájának megfelelő lehetőségeken belül random vízmennyiséget vigyen magával, de minimum 3 egységet.

## 3. Óvoda
Készítsünk programot, amellyel szimulálni tudjuk a következő feladatot. Egy óvodában óvónéninek kell gyerekekkel foglalkozni úgy, hogy probléma nélkül teljen az idő. Négyféle tevékenységre lehet az óvodásokat rávenni: ének, labdázás, rajz, tánc. Az egyes gyerekek eltérően reagálnak az egyes tevékenységekre, és ennek megfelelően változik az elégedettségük. Ha egy gyerek elégedettsége nullára csökken, akkor nyafogni kezd, és ha 3 vagy több gyerek nyafog egyszerre, akkor az óvónéni már nem tudja a rendet fenntartani. A gyerekeket három csoportra lehet osztani annak alapján, hogy miként reagálnak az egyes tevékenységekre:
* **Eleven:** Labdázás esetén az elégedettsége három lesz, tánc esetén nem változik, ének és rajz esetén eggyel csökken.
* **Zenekedvelő:** Ének esetén az elégedettsége négy lesz, tánc esetén nem változik, labdázás és rajz esetén eggyel csökken.
* **Kényelmes:** Rajz esetén az elégedettsége négy lesz, ének esetén nem változik, tánc esetén eggyel, labdázás esetén kettővel csökken.

Írjunk olyan programot, amely az óvoda egy napját szimulálja. A nap 6 órából áll, és fél óránként válthat tevékenységet az óvónéni. Minden tevékenységet mindenki csinál az adott fél órában. A gyerekek 2 elégedettségi ponttal érkeznek az óvodába. Írjuk ki a nap végén, hogy káoszba fulladt-e a nap, vagy sem. Ha legalább 3 gyerek elérte a nyafogó szintet, akkor hiába hozza vissza az ő elégedettségüket az óvónéni, nap végén ugyan úgy jeleznünk kell, hogy a káosz vette át az uralmat az oviban.


Bónusz 1: Legyenek a tevékenységek amiket az oviban űznek randomok.

Bónusz 2: A gyerekek random módon 3 csoportba kerüljenek, és minden csoport más más tevékenységet folytasson. A csoportok minden fél órában újra alakulnak.

Bónusz 3: Ha a káosz elszabadult a fenti okok miatt, akkor a nap ne folytatódjon, hanem lépjen ki a program és írja ki, hogy “A káosz elszabadult”.

## 4. Kertész
Készítsünk programot a következő kertészeti szimulációhoz. Egy kertben különböző növényeket tartanak, amelyeket gondozni kell. A kertész három fajta anyag közül naponta csak egyet adhat az összes növénynek. Az anyagok fajtái: víz, tápoldat, műtrágya. A növények az egyes anyagokra eltérően reagálnak: sorvadnak; tűrik, ekkor nem nőnek; szeretik, ekkor nőnek. Egy növény kipusztulhat, ha sorvadás során a mérete nullára csökken, illetve túlburjánzásban is kipusztulhat, ha túl naggyá válik. A túlburjánzás határa növényfajtánként eltérő. Előfordul, hogy a kertész nem ad nekik tápanyagot, ekkor garantáltan sorvadnak eggyel. A konkrét kertben három fajta növényt termesztenek: kaktuszt, virágot ésbokrot, ezek jellemzői a következők:
* **Kaktusz:** Víz esetén a mérete eggyel csökken, tápoldat esetén eggyel nő, műtrágya esetén eggyel nő. A túlburjánzás határa 4.
* **Virág:** Víz esetén a mérete hárommal nő, tápoldat és műtrágya esetén eggyel csökken. A túlburjánzás határa 6.
* **Bokor:** Víz és műtrágya esetén a mérete eggyel nő, tápoldat esetén eggyel csökken. A túlburjánzás határa 10.

Készítsünk egy oneDayInTheGarden() metódust, melyet a mainben tudunk meghívni. A szimulációban az alábbi növények vegyenek részt (fajta, azonosító, kezdő tápanyagszint):
* Virág V102 3
* Bokor B223 4
* Kaktusz K15 2
* Kaktusz K18 1

A szimuláció 5 napig tart, és az alábbi tápanyagokat kapják a növények egységesen: víz, tápoldat, semmi, víz, műtrágya
