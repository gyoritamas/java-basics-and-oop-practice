## 1. Sugárzott növények
Egy bolygón különböző fajtájú növények élnek, minden növény tápanyagot használ.
Ha egy növény tápanyaga elfogy (a mennyisége 0 lesz), a növény elpusztul. A bolygón
három fajta sugárzást különböztetünk meg: alfa sugárzás, delta sugárzás, nincs
sugárzás. A sugárzásra a különböző fajtájú elő növények eltérő módon reagálnak. A
reakció tartalmazza a tápanyag változását, illetve a következő napi sugárzás
befolyásolását. A másnapi sugárzás alakulása: ha az alfa sugárzásra beérkezett
igények összege legalább hárommal meghaladja a delta sugárzás igényeinek
összegét, akkor alfa sugárzás lesz; ha a delta sugárzásra igaz ugyanez, akkor delta
sugárzás lesz; ha a két igény közti eltérés háromnál kisebb, akkor nincs sugárzás. Az
első nap sugárzás nélküli.
Minden növény jellemzői: az egyedi neve, a rendelkezésre álló tápanyag mennyisége,
hogy él-e. A szimulációban részt vevő növények fajtái a következők: puffancs, deltafa,
parabokor. A következőkben megadjuk, hogy az egyes fajták miként reagálnak a
különböző sugárzásokra. Először a tápanyag változik, és ha a növény ezután él, akkor
befolyásolhatja a sugárzást.

* **Puffancs:** Alfa sugárzás hatására a tápanyag mennyisége kettővel nő,
sugárzás mentes napon a tápanyag eggyel csökken, delta sugárzás esetén
a tápanyag kettővel csökken. Minden esetben úgy befolyásolja a másnapi
sugárzást, hogy 10 - tápanyag értékben növeli az alfa sugárzás
bekövetkezését. Ez a fajta akkor is elpusztul, ha a tápanyag mennyisége 10
fölé emelkedik.
* **Deltafa:** Alfa sugárzás hatására a tápanyag mennyisége hárommal csökken,
sugárzás nélküli napon a tápanyag eggyel csökken, delta sugárzás hatására
a tápanyag néggyel nő. Ha a tápanyag mennyisége 5-nél kisebb, akkor 4
értékben növeli a delta sugárzás bekövetkezését, ha 5 és 10 közé esik,
akkor 1 értékben növeli a delta sugárzás bekövetkezését, ha 10-nél több,
akkor nem befolyásolja a másnapi sugárzást.
* **Parabokor:** Akár alfa, akár delta sugárzás hatására a tápanyag mennyisége
eggyel nő. Sugárzás nélküli napon a tápanyag eggyel csökken. A másnapi
sugárzást nem befolyásolja.

Készítsünk programot a növények viselkedésének és a sugárzás szimulálására.
A szimuláció adatait a main függvényen keresztül kapja a program. Az első sorban a
szimuláció napjainak száma található. A következő sorok tartalmazzák a növények
adatait szóközökkel elválasztva: a növény nevét, a fajtáját és a kezdetben
rendelkezésére álló tápanyag mennyiségét. A fajtát egy karakter azonosít: a –
puffancs, d – deltafa, p – parabokor.
A program kérje be a fájl nevét, majd jelenítse meg a túlélők nevét. Ehhez valósítsuk
meg a növényeket reprezentáló osztályokat, amelyek egy absztrakt lény osztály
leszármazottai. A lényekhez szükséges műveletek a különböző sugárzásoknak,
valamint 2 tulajdonság: él-e a lény, illetve a név lekérdezés.

