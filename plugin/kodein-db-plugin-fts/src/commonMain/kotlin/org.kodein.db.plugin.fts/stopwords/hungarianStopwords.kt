package org.kodein.db.plugin.fts.stopwords

@OptIn(ExperimentalStdlibApi::class)
internal val hungarianStopwords by lazy { buildSet {
    addAll(arrayOf("a", "abba", "abban", "abból", "addig", "ahhoz", "ahogy", "ahol", "aki", "akik"))
    addAll(arrayOf("akkor", "akár", "alapján", "alatt", "alatta", "alattad", "alattam", "alattatok", "alattuk", "alattunk"))
    addAll(arrayOf("alá", "alád", "alájuk", "alám", "alánk", "alátok", "alól", "alóla", "alólad", "alólam"))
    addAll(arrayOf("alólatok", "alóluk", "alólunk", "amely", "amelybol", "amelyek", "amelyekben", "amelyeket", "amelyet", "amelyik"))
    addAll(arrayOf("amelynek", "ami", "amikor", "amit", "amolyan", "amott", "amíg", "annak", "annál", "arra"))
    addAll(arrayOf("arról", "attól", "az", "aznap", "azok", "azokat", "azokba", "azokban", "azokból", "azokhoz"))
    addAll(arrayOf("azokig", "azokkal", "azokká", "azoknak", "azoknál", "azokon", "azokra", "azokról", "azoktól", "azokért"))
    addAll(arrayOf("azon", "azonban", "azonnal", "azt", "aztán", "azután", "azzal", "azzá", "azért", "bal"))
    addAll(arrayOf("balra", "ban", "be", "belé", "beléd", "beléjük", "belém", "belénk", "belétek", "belül"))
    addAll(arrayOf("belőle", "belőled", "belőlem", "belőletek", "belőlük", "belőlünk", "ben", "benne", "benned", "bennem"))
    addAll(arrayOf("bennetek", "bennük", "bennünk", "bár", "bárcsak", "bármilyen", "búcsú", "cikk", "cikkek", "cikkeket"))
    addAll(arrayOf("csak", "csakhogy", "csupán", "de", "dehogy", "e", "ebbe", "ebben", "ebből", "eddig"))
    addAll(arrayOf("egy", "egyebek", "egyebet", "egyedül", "egyelőre", "egyes", "egyet", "egyetlen", "egyik", "egymás"))
    addAll(arrayOf("egyre", "egyszerre", "egyéb", "együtt", "egész", "egészen", "ehhez", "ekkor", "el", "eleinte"))
    addAll(arrayOf("ellen", "ellenes", "elleni", "ellenére", "elmondta", "elsõ", "első", "elsők", "elsősorban", "elsőt"))
    addAll(arrayOf("elé", "eléd", "elég", "eléjük", "elém", "elénk", "elétek", "elõ", "elõször", "elõtt"))
    addAll(arrayOf("elő", "előbb", "elől", "előle", "előled", "előlem", "előletek", "előlük", "előlünk", "először"))
    addAll(arrayOf("előtt", "előtte", "előtted", "előttem", "előttetek", "előttük", "előttünk", "előző", "emilyen", "engem"))
    addAll(arrayOf("ennek", "ennyi", "ennél", "enyém", "erre", "erről", "esetben", "ettől", "ez", "ezek"))
    addAll(arrayOf("ezekbe", "ezekben", "ezekből", "ezeken", "ezeket", "ezekhez", "ezekig", "ezekkel", "ezekké", "ezeknek"))
    addAll(arrayOf("ezeknél", "ezekre", "ezekről", "ezektől", "ezekért", "ezen", "ezentúl", "ezer", "ezret", "ezt"))
    addAll(arrayOf("ezután", "ezzel", "ezzé", "ezért", "fel", "fele", "felek", "felet", "felett", "felé"))
    addAll(arrayOf("fent", "fenti", "fél", "fölé", "gyakran", "ha", "halló", "hamar", "hanem", "harmadik"))
    addAll(arrayOf("harmadikat", "harminc", "hat", "hatodik", "hatodikat", "hatot", "hatvan", "helyett", "hetedik", "hetediket"))
    addAll(arrayOf("hetet", "hetven", "hirtelen", "hiszen", "hiába", "hogy", "hogyan", "hol", "holnap", "holnapot"))
    addAll(arrayOf("honnan", "hova", "hozzá", "hozzád", "hozzájuk", "hozzám", "hozzánk", "hozzátok", "hurrá", "huszadik"))
    addAll(arrayOf("hány", "hányszor", "hármat", "három", "hát", "hátha", "hátulsó", "hét", "húsz", "ide"))
    addAll(arrayOf("ide-оda", "idén", "igazán", "igen", "ill", "ill.", "illetve", "ilyen", "ilyenkor", "immár"))
    addAll(arrayOf("inkább", "is", "ismét", "ison", "itt", "jelenleg", "jobban", "jobbra", "jó", "jól"))
    addAll(arrayOf("jólesik", "jóval", "jövőre", "kell", "kellene", "kellett", "kelljen", "keressünk", "keresztül", "ketten"))
    addAll(arrayOf("kettő", "kettőt", "kevés", "ki", "kiben", "kiből", "kicsit", "kicsoda", "kihez", "kik"))
    addAll(arrayOf("kikbe", "kikben", "kikből", "kiken", "kiket", "kikhez", "kikkel", "kikké", "kiknek", "kiknél"))
    addAll(arrayOf("kikre", "kikről", "kiktől", "kikért", "kilenc", "kilencedik", "kilencediket", "kilencet", "kilencven", "kin"))
    addAll(arrayOf("kinek", "kinél", "kire", "kiről", "kit", "kitől", "kivel", "kivé", "kié", "kiért"))
    addAll(arrayOf("korábban", "képest", "kérem", "kérlek", "kész", "késő", "később", "későn", "két", "kétszer"))
    addAll(arrayOf("kívül", "körül", "köszönhetően", "köszönöm", "közben", "közel", "közepesen", "közepén", "közé", "között"))
    addAll(arrayOf("közül", "külön", "különben", "különböző", "különbözőbb", "különbözőek", "lassan", "le", "legalább", "legyen"))
    addAll(arrayOf("lehet", "lehetetlen", "lehetett", "lehetőleg", "lehetőség", "lenne", "lenni", "lennék", "lennének", "lesz"))
    addAll(arrayOf("leszek", "lesznek", "leszünk", "lett", "lettek", "lettem", "lettünk", "lévő", "ma", "maga"))
    addAll(arrayOf("magad", "magam", "magatokat", "magukat", "magunkat", "magát", "mai", "majd", "majdnem", "manapság"))
    addAll(arrayOf("meg", "megcsinál", "megcsinálnak", "megint", "megvan", "mellett", "mellette", "melletted", "mellettem", "mellettetek"))
    addAll(arrayOf("mellettük", "mellettünk", "mellé", "melléd", "melléjük", "mellém", "mellénk", "mellétek", "mellől", "mellőle"))
    addAll(arrayOf("mellőled", "mellőlem", "mellőletek", "mellőlük", "mellőlünk", "mely", "melyek", "melyik", "mennyi", "mert"))
    addAll(arrayOf("mi", "miatt", "miatta", "miattad", "miattam", "miattatok", "miattuk", "miattunk", "mibe", "miben"))
    addAll(arrayOf("miből", "mihez", "mik", "mikbe", "mikben", "mikből", "miken", "miket", "mikhez", "mikkel"))
    addAll(arrayOf("mikké", "miknek", "miknél", "mikor", "mikre", "mikről", "miktől", "mikért", "milyen", "min"))
    addAll(arrayOf("mind", "mindegyik", "mindegyiket", "minden", "mindenesetre", "mindenki", "mindent", "mindenütt", "mindig", "mindketten"))
    addAll(arrayOf("minek", "minket", "mint", "mintha", "minél", "mire", "miről", "mit", "mitől", "mivel"))
    addAll(arrayOf("mivé", "miért", "mondta", "most", "mostanáig", "már", "más", "másik", "másikat", "másnap"))
    addAll(arrayOf("második", "másodszor", "mások", "másokat", "mást", "még", "mégis", "míg", "mögé", "mögéd"))
    addAll(arrayOf("mögéjük", "mögém", "mögénk", "mögétek", "mögött", "mögötte", "mögötted", "mögöttem", "mögöttetek", "mögöttük"))
    addAll(arrayOf("mögöttünk", "mögül", "mögüle", "mögüled", "mögülem", "mögületek", "mögülük", "mögülünk", "múltkor", "múlva"))
    addAll(arrayOf("na", "nagy", "nagyobb", "nagyon", "naponta", "napot", "ne", "negyedik", "negyediket", "negyven"))
    addAll(arrayOf("neked", "nekem", "neki", "nekik", "nektek", "nekünk", "nem", "nemcsak", "nemrég", "nincs"))
    addAll(arrayOf("nyolc", "nyolcadik", "nyolcadikat", "nyolcat", "nyolcvan", "nála", "nálad", "nálam", "nálatok", "náluk"))
    addAll(arrayOf("nálunk", "négy", "négyet", "néha", "néhány", "nélkül", "o", "oda", "ok", "olyan"))
    addAll(arrayOf("onnan", "ott", "pedig", "persze", "pár", "például", "rajta", "rajtad", "rajtam", "rajtatok"))
    addAll(arrayOf("rajtuk", "rajtunk", "rendben", "rosszul", "rá", "rád", "rájuk", "rám", "ránk", "rátok"))
    addAll(arrayOf("régen", "régóta", "részére", "róla", "rólad", "rólam", "rólatok", "róluk", "rólunk", "rögtön"))
    addAll(arrayOf("s", "saját", "se", "sem", "semmi", "semmilyen", "semmiség", "senki", "soha", "sok"))
    addAll(arrayOf("sokan", "sokat", "sokkal", "sokszor", "sokáig", "során", "stb.", "szemben", "szerbusz", "szerint"))
    addAll(arrayOf("szerinte", "szerinted", "szerintem", "szerintetek", "szerintük", "szerintünk", "szervusz", "szinte", "számára", "száz"))
    addAll(arrayOf("századik", "százat", "szépen", "szét", "szíves", "szívesen", "szíveskedjék", "sőt", "talán", "tavaly"))
    addAll(arrayOf("te", "tegnap", "tegnapelőtt", "tehát", "tele", "teljes", "tessék", "ti", "tied", "titeket"))
    addAll(arrayOf("tizedik", "tizediket", "tizenegy", "tizenegyedik", "tizenhat", "tizenhárom", "tizenhét", "tizenkettedik", "tizenkettő", "tizenkilenc"))
    addAll(arrayOf("tizenkét", "tizennyolc", "tizennégy", "tizenöt", "tizet", "tovább", "további", "továbbá", "távol", "téged"))
    addAll(arrayOf("tényleg", "tíz", "több", "többi", "többször", "túl", "tőle", "tőled", "tőlem", "tőletek"))
    addAll(arrayOf("tőlük", "tőlünk", "ugyanakkor", "ugyanez", "ugyanis", "ugye", "urak", "uram", "urat", "utoljára"))
    addAll(arrayOf("utolsó", "után", "utána", "vagy", "vagyis", "vagyok", "vagytok", "vagyunk", "vajon", "valahol"))
    addAll(arrayOf("valaki", "valakit", "valamelyik", "valami", "valamint", "való", "van", "vannak", "vele", "veled"))
    addAll(arrayOf("velem", "veletek", "velük", "velünk", "vissza", "viszlát", "viszont", "viszontlátásra", "volna", "volnának"))
    addAll(arrayOf("volnék", "volt", "voltak", "voltam", "voltunk", "végre", "végén", "végül", "által", "általában"))
    addAll(arrayOf("ám", "át", "éljen", "én", "éppen", "érte", "érted", "értem", "értetek", "értük"))
    addAll(arrayOf("értünk", "és", "év", "évben", "éve", "évek", "éves", "évi", "évvel", "így"))
    addAll(arrayOf("óta", "õ", "õk", "õket", "ön", "önbe", "önben", "önből", "önhöz", "önnek"))
    addAll(arrayOf("önnel", "önnél", "önre", "önről", "önt", "öntől", "önért", "önök", "önökbe", "önökben"))
    addAll(arrayOf("önökből", "önöket", "önökhöz", "önökkel", "önöknek", "önöknél", "önökre", "önökről", "önöktől", "önökért"))
    addAll(arrayOf("önökön", "önön", "össze", "öt", "ötven", "ötödik", "ötödiket", "ötöt", "úgy", "úgyis"))
    addAll(arrayOf("úgynevezett", "új", "újabb", "újra", "úr", "ő", "ők", "őket", "őt"))
}}