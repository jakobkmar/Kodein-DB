package org.kodein.db.plugin.fts.stopwords

@OptIn(ExperimentalStdlibApi::class)
internal val finnishStopwords by lazy { buildSet {
    addAll(arrayOf("aiemmin", "aika", "aikaa", "aikaan", "aikaisemmin", "aikaisin", "aikajen", "aikana", "aikoina", "aikoo"))
    addAll(arrayOf("aikovat", "aina", "ainakaan", "ainakin", "ainoa", "ainoat", "aiomme", "aion", "aiotte", "aist"))
    addAll(arrayOf("aivan", "ajan", "alas", "alemmas", "alkuisin", "alkuun", "alla", "alle", "aloitamme", "aloitan"))
    addAll(arrayOf("aloitat", "aloitatte", "aloitattivat", "aloitettava", "aloitettevaksi", "aloitettu", "aloitimme", "aloitin", "aloitit", "aloititte"))
    addAll(arrayOf("aloittaa", "aloittamatta", "aloitti", "aloittivat", "alta", "aluksi", "alussa", "alusta", "annettavaksi", "annetteva"))
    addAll(arrayOf("annettu", "ansiosta", "antaa", "antamatta", "antoi", "aoua", "apu", "asia", "asiaa", "asian"))
    addAll(arrayOf("asiasta", "asiat", "asioiden", "asioihin", "asioita", "asti", "avuksi", "avulla", "avun", "avutta"))
    addAll(arrayOf("edelle", "edelleen", "edellä", "edeltä", "edemmäs", "edes", "edessä", "edestä", "ehkä", "ei"))
    addAll(arrayOf("eikä", "eilen", "eivät", "eli", "ellei", "elleivät", "ellemme", "ellen", "ellet", "ellette"))
    addAll(arrayOf("emme", "en", "enemmän", "eniten", "ennen", "ensi", "ensimmäinen", "ensimmäiseksi", "ensimmäisen", "ensimmäisenä"))
    addAll(arrayOf("ensimmäiset", "ensimmäisiksi", "ensimmäisinä", "ensimmäisiä", "ensimmäistä", "ensin", "entinen", "entisen", "entisiä", "entisten"))
    addAll(arrayOf("entistä", "enää", "eri", "erittäin", "erityisesti", "eräiden", "eräs", "eräät", "esi", "esiin"))
    addAll(arrayOf("esillä", "esimerkiksi", "et", "eteen", "etenkin", "etessa", "ette", "ettei", "että", "haikki"))
    addAll(arrayOf("halua", "haluaa", "haluamatta", "haluamme", "haluan", "haluat", "haluatte", "haluavat", "halunnut", "halusi"))
    addAll(arrayOf("halusimme", "halusin", "halusit", "halusitte", "halusivat", "halutessa", "haluton", "he", "hei", "heidän"))
    addAll(arrayOf("heidät", "heihin", "heille", "heillä", "heiltä", "heissä", "heistä", "heitä", "helposti", "heti"))
    addAll(arrayOf("hetkellä", "hieman", "hitaasti", "hoikein", "huolimatta", "huomenna", "hyvien", "hyviin", "hyviksi", "hyville"))
    addAll(arrayOf("hyviltä", "hyvin", "hyvinä", "hyvissä", "hyvistä", "hyviä", "hyvä", "hyvät", "hyvää", "hän"))
    addAll(arrayOf("häneen", "hänelle", "hänellä", "häneltä", "hänen", "hänessä", "hänestä", "hänet", "häntä", "ihan"))
    addAll(arrayOf("ilman", "ilmeisesti", "itse", "itsensä", "itseään", "ja", "jo", "johon", "joiden", "joihin"))
    addAll(arrayOf("joiksi", "joilla", "joille", "joilta", "joina", "joissa", "joista", "joita", "joka", "jokainen"))
    addAll(arrayOf("jokin", "joko", "joksi", "joku", "jolla", "jolle", "jolloin", "jolta", "jompikumpi", "jona"))
    addAll(arrayOf("jonka", "jonkin", "jonne", "joo", "jopa", "jos", "joskus", "jossa", "josta", "jota"))
    addAll(arrayOf("jotain", "joten", "jotenkin", "jotenkuten", "jotka", "jotta", "jouduimme", "jouduin", "jouduit", "jouduitte"))
    addAll(arrayOf("joudumme", "joudun", "joudutte", "joukkoon", "joukossa", "joukosta", "joutua", "joutui", "joutuivat", "joutumaan"))
    addAll(arrayOf("joutuu", "joutuvat", "juuri", "jälkeen", "jälleen", "jää", "kahdeksan", "kahdeksannen", "kahdella", "kahdelle"))
    addAll(arrayOf("kahdelta", "kahden", "kahdessa", "kahdesta", "kahta", "kahteen", "kai", "kaiken", "kaikille", "kaikilta"))
    addAll(arrayOf("kaikkea", "kaikki", "kaikkia", "kaikkiaan", "kaikkialla", "kaikkialle", "kaikkialta", "kaikkien", "kaikkin", "kaksi"))
    addAll(arrayOf("kannalta", "kannattaa", "kanssa", "kanssaan", "kanssamme", "kanssani", "kanssanne", "kanssasi", "kauan", "kauemmas"))
    addAll(arrayOf("kaukana", "kautta", "kehen", "keiden", "keihin", "keiksi", "keille", "keillä", "keiltä", "keinä"))
    addAll(arrayOf("keissä", "keistä", "keitten", "keittä", "keitä", "keneen", "keneksi", "kenelle", "kenellä", "keneltä"))
    addAll(arrayOf("kenen", "kenenä", "kenessä", "kenestä", "kenet", "kenettä", "kennessästä", "kenties", "kerran", "kerta"))
    addAll(arrayOf("kertaa", "keskellä", "kesken", "keskimäärin", "ketkä", "ketä", "kiitos", "kohti", "koko", "kokonaan"))
    addAll(arrayOf("kolmas", "kolme", "kolmen", "kolmesti", "koska", "koskaan", "kovin", "kuin", "kuinka", "kuinkan"))
    addAll(arrayOf("kuitenkaan", "kuitenkin", "kuka", "kukaan", "kukin", "kukka", "kumpainen", "kumpainenkaan", "kumpi", "kumpikaan"))
    addAll(arrayOf("kumpikin", "kun", "kuten", "kuuden", "kuusi", "kuutta", "kylliksi", "kyllä", "kymmenen", "kyse"))
    addAll(arrayOf("liian", "liki", "lisäksi", "lisää", "lla", "luo", "luona", "lähekkäin", "lähelle", "lähellä"))
    addAll(arrayOf("läheltä", "lähemmäs", "lähes", "lähinnä", "lähtien", "läpi", "mahdollisimman", "mahdollista", "me", "meidän"))
    addAll(arrayOf("meidät", "meihin", "meille", "meillä", "meiltä", "meissä", "meistä", "meitä", "melkein", "melko"))
    addAll(arrayOf("menee", "meneet", "menemme", "menen", "menet", "menette", "menevät", "meni", "menimme", "menin"))
    addAll(arrayOf("menit", "menivät", "mennessä", "mennyt", "menossa", "mihin", "mikin", "miksi", "mikä", "mikäli"))
    addAll(arrayOf("mikään", "mille", "milloin", "milloinkan", "millä", "miltä", "minkä", "minne", "minua", "minulla"))
    addAll(arrayOf("minulle", "minulta", "minun", "minussa", "minusta", "minut", "minuun", "minä", "missä", "mistä"))
    addAll(arrayOf("miten", "mitkä", "mitä", "mitään", "moi", "molemmat", "mones", "monesti", "monet", "moni"))
    addAll(arrayOf("moniaalla", "moniaalle", "moniaalta", "monta", "muassa", "muiden", "muita", "muka", "mukaan", "mukaansa"))
    addAll(arrayOf("mukana", "mutta", "muu", "muualla", "muualle", "muualta", "muuanne", "muulloin", "muun", "muut"))
    addAll(arrayOf("muuta", "muutama", "muutaman", "muuten", "myöhemmin", "myös", "myöskin", "myöskään", "myötä", "ne"))
    addAll(arrayOf("neljä", "neljän", "neljää", "niiden", "niihin", "niiksi", "niille", "niillä", "niiltä", "niin"))
    addAll(arrayOf("niinä", "niissä", "niistä", "niitä", "noiden", "noihin", "noiksi", "noilla", "noille", "noilta"))
    addAll(arrayOf("noin", "noina", "noissa", "noista", "noita", "nopeammin", "nopeasti", "nopeiten", "nro", "nuo"))
    addAll(arrayOf("nyt", "näiden", "näihin", "näiksi", "näille", "näillä", "näiltä", "näin", "näinä", "näissä"))
    addAll(arrayOf("näissähin", "näissälle", "näissältä", "näissästä", "näistä", "näitä", "nämä", "ohi", "oikea", "oikealla"))
    addAll(arrayOf("oikein", "ole", "olemme", "olen", "olet", "olette", "oleva", "olevan", "olevat", "oli"))
    addAll(arrayOf("olimme", "olin", "olisi", "olisimme", "olisin", "olisit", "olisitte", "olisivat", "olit", "olitte"))
    addAll(arrayOf("olivat", "olla", "olleet", "olli", "ollut", "oma", "omaa", "omaan", "omaksi", "omalle"))
    addAll(arrayOf("omalta", "oman", "omassa", "omat", "omia", "omien", "omiin", "omiksi", "omille", "omilta"))
    addAll(arrayOf("omissa", "omista", "on", "onkin", "onko", "ovat", "paikoittain", "paitsi", "pakosti", "paljon"))
    addAll(arrayOf("paremmin", "parempi", "parhaillaan", "parhaiten", "perusteella", "peräti", "pian", "pieneen", "pieneksi", "pienelle"))
    addAll(arrayOf("pienellä", "pieneltä", "pienempi", "pienestä", "pieni", "pienin", "poikki", "puolesta", "puolestaan", "päälle"))
    addAll(arrayOf("runsaasti", "saakka", "sadam", "sama", "samaa", "samaan", "samalla", "samallalta", "samallassa", "samallasta"))
    addAll(arrayOf("saman", "samat", "samoin", "sata", "sataa", "satojen", "se", "seitsemän", "sekä", "sen"))
    addAll(arrayOf("seuraavat", "siellä", "sieltä", "siihen", "siinä", "siis", "siitä", "sijaan", "siksi", "sille"))
    addAll(arrayOf("silloin", "sillä", "silti", "siltä", "sinne", "sinua", "sinulla", "sinulle", "sinulta", "sinun"))
    addAll(arrayOf("sinussa", "sinusta", "sinut", "sinuun", "sinä", "sisäkkäin", "sisällä", "siten", "sitten", "sitä"))
    addAll(arrayOf("ssa", "sta", "suoraan", "suuntaan", "suuren", "suuret", "suuri", "suuria", "suurin", "suurten"))
    addAll(arrayOf("taa", "taas", "taemmas", "tahansa", "tai", "takaa", "takaisin", "takana", "takia", "tallä"))
    addAll(arrayOf("tapauksessa", "tarpeeksi", "tavalla", "tavoitteena", "te", "teidän", "teidät", "teihin", "teille", "teillä"))
    addAll(arrayOf("teiltä", "teissä", "teistä", "teitä", "tietysti", "todella", "toinen", "toisaalla", "toisaalle", "toisaalta"))
    addAll(arrayOf("toiseen", "toiseksi", "toisella", "toiselle", "toiselta", "toisemme", "toisen", "toisensa", "toisessa", "toisesta"))
    addAll(arrayOf("toista", "toistaiseksi", "toki", "tosin", "tuhannen", "tuhat", "tule", "tulee", "tulemme", "tulen"))
    addAll(arrayOf("tulet", "tulette", "tulevat", "tulimme", "tulin", "tulisi", "tulisimme", "tulisin", "tulisit", "tulisitte"))
    addAll(arrayOf("tulisivat", "tulit", "tulitte", "tulivat", "tulla", "tulleet", "tullut", "tuntuu", "tuo", "tuohon"))
    addAll(arrayOf("tuoksi", "tuolla", "tuolle", "tuolloin", "tuolta", "tuon", "tuona", "tuonne", "tuossa", "tuosta"))
    addAll(arrayOf("tuota", "tuotä", "tuskin", "tykö", "tähän", "täksi", "tälle", "tällä", "tällöin", "tältä"))
    addAll(arrayOf("tämä", "tämän", "tänne", "tänä", "tänään", "tässä", "tästä", "täten", "tätä", "täysin"))
    addAll(arrayOf("täytyvät", "täytyy", "täällä", "täältä", "ulkopuolella", "usea", "useasti", "useimmiten", "usein", "useita"))
    addAll(arrayOf("uudeksi", "uudelleen", "uuden", "uudet", "uusi", "uusia", "uusien", "uusinta", "uuteen", "uutta"))
    addAll(arrayOf("vaan", "vahemmän", "vai", "vaiheessa", "vaikea", "vaikean", "vaikeat", "vaikeilla", "vaikeille", "vaikeilta"))
    addAll(arrayOf("vaikeissa", "vaikeista", "vaikka", "vain", "varmasti", "varsin", "varsinkin", "varten", "vasen", "vasenmalla"))
    addAll(arrayOf("vasta", "vastaan", "vastakkain", "vastan", "verran", "vielä", "vierekkäin", "vieressä", "vieri", "viiden"))
    addAll(arrayOf("viime", "viimeinen", "viimeisen", "viimeksi", "viisi", "voi", "voidaan", "voimme", "voin", "voisi"))
    addAll(arrayOf("voit", "voitte", "voivat", "vuoden", "vuoksi", "vuosi", "vuosien", "vuosina", "vuotta", "vähemmän"))
    addAll(arrayOf("vähintään", "vähiten", "vähän", "välillä", "yhdeksän", "yhden", "yhdessä", "yhteen", "yhteensä", "yhteydessä"))
    addAll(arrayOf("yhteyteen", "yhtä", "yhtäälle", "yhtäällä", "yhtäältä", "yhtään", "yhä", "yksi", "yksin", "yksittäin"))
    addAll(arrayOf("yleensä", "ylemmäs", "yli", "ylös", "ympäri", "älköön", "älä"))
}}