package org.kodein.db.plugin.fts.stopwords

@OptIn(ExperimentalStdlibApi::class)
internal val germanStopwords by lazy { buildSet {
    addAll(arrayOf("a", "ab", "aber", "ach", "acht", "achte", "achten", "achter", "achtes", "ag"))
    addAll(arrayOf("alle", "allein", "allem", "allen", "aller", "allerdings", "alles", "allgemeinen", "als", "also"))
    addAll(arrayOf("am", "an", "ander", "andere", "anderem", "anderen", "anderer", "anderes", "anderm", "andern"))
    addAll(arrayOf("anderr", "anders", "au", "auch", "auf", "aus", "ausser", "ausserdem", "außer", "außerdem"))
    addAll(arrayOf("b", "bald", "bei", "beide", "beiden", "beim", "beispiel", "bekannt", "bereits", "besonders"))
    addAll(arrayOf("besser", "besten", "bin", "bis", "bisher", "bist", "c", "d", "d.h", "da"))
    addAll(arrayOf("dabei", "dadurch", "dafür", "dagegen", "daher", "dahin", "dahinter", "damals", "damit", "danach"))
    addAll(arrayOf("daneben", "dank", "dann", "daran", "darauf", "daraus", "darf", "darfst", "darin", "darum"))
    addAll(arrayOf("darunter", "darüber", "das", "dasein", "daselbst", "dass", "dasselbe", "davon", "davor", "dazu"))
    addAll(arrayOf("dazwischen", "daß", "dein", "deine", "deinem", "deinen", "deiner", "deines", "dem", "dementsprechend"))
    addAll(arrayOf("demgegenüber", "demgemäss", "demgemäß", "demselben", "demzufolge", "den", "denen", "denn", "denselben", "der"))
    addAll(arrayOf("deren", "derer", "derjenige", "derjenigen", "dermassen", "dermaßen", "derselbe", "derselben", "des", "deshalb"))
    addAll(arrayOf("desselben", "dessen", "deswegen", "dich", "die", "diejenige", "diejenigen", "dies", "diese", "dieselbe"))
    addAll(arrayOf("dieselben", "diesem", "diesen", "dieser", "dieses", "dir", "doch", "dort", "drei", "drin"))
    addAll(arrayOf("dritte", "dritten", "dritter", "drittes", "du", "durch", "durchaus", "durfte", "durften", "dürfen"))
    addAll(arrayOf("dürft", "e", "eben", "ebenso", "ehrlich", "ei", "ei,", "eigen", "eigene", "eigenen"))
    addAll(arrayOf("eigener", "eigenes", "ein", "einander", "eine", "einem", "einen", "einer", "eines", "einig"))
    addAll(arrayOf("einige", "einigem", "einigen", "einiger", "einiges", "einmal", "eins", "elf", "en", "ende"))
    addAll(arrayOf("endlich", "entweder", "er", "ernst", "erst", "erste", "ersten", "erster", "erstes", "es"))
    addAll(arrayOf("etwa", "etwas", "euch", "euer", "eure", "eurem", "euren", "eurer", "eures", "f"))
    addAll(arrayOf("folgende", "früher", "fünf", "fünfte", "fünften", "fünfter", "fünftes", "für", "g", "gab"))
    addAll(arrayOf("ganz", "ganze", "ganzen", "ganzer", "ganzes", "gar", "gedurft", "gegen", "gegenüber", "gehabt"))
    addAll(arrayOf("gehen", "geht", "gekannt", "gekonnt", "gemacht", "gemocht", "gemusst", "genug", "gerade", "gern"))
    addAll(arrayOf("gesagt", "geschweige", "gewesen", "gewollt", "geworden", "gibt", "ging", "gleich", "gott", "gross"))
    addAll(arrayOf("grosse", "grossen", "grosser", "grosses", "groß", "große", "großen", "großer", "großes", "gut"))
    addAll(arrayOf("gute", "guter", "gutes", "h", "hab", "habe", "haben", "habt", "hast", "hat"))
    addAll(arrayOf("hatte", "hatten", "hattest", "hattet", "heisst", "her", "heute", "hier", "hin", "hinter"))
    addAll(arrayOf("hoch", "hätte", "hätten", "i", "ich", "ihm", "ihn", "ihnen", "ihr", "ihre"))
    addAll(arrayOf("ihrem", "ihren", "ihrer", "ihres", "im", "immer", "in", "indem", "infolgedessen", "ins"))
    addAll(arrayOf("irgend", "ist", "j", "ja", "jahr", "jahre", "jahren", "je", "jede", "jedem"))
    addAll(arrayOf("jeden", "jeder", "jedermann", "jedermanns", "jedes", "jedoch", "jemand", "jemandem", "jemanden", "jene"))
    addAll(arrayOf("jenem", "jenen", "jener", "jenes", "jetzt", "k", "kam", "kann", "kannst", "kaum"))
    addAll(arrayOf("kein", "keine", "keinem", "keinen", "keiner", "keines", "kleine", "kleinen", "kleiner", "kleines"))
    addAll(arrayOf("kommen", "kommt", "konnte", "konnten", "kurz", "können", "könnt", "könnte", "l", "lang"))
    addAll(arrayOf("lange", "leicht", "leide", "lieber", "los", "m", "machen", "macht", "machte", "mag"))
    addAll(arrayOf("magst", "mahn", "mal", "man", "manche", "manchem", "manchen", "mancher", "manches", "mann"))
    addAll(arrayOf("mehr", "mein", "meine", "meinem", "meinen", "meiner", "meines", "mensch", "menschen", "mich"))
    addAll(arrayOf("mir", "mit", "mittel", "mochte", "mochten", "morgen", "muss", "musst", "musste", "mussten"))
    addAll(arrayOf("muß", "mußt", "möchte", "mögen", "möglich", "mögt", "müssen", "müsst", "müßt", "n"))
    addAll(arrayOf("na", "nach", "nachdem", "nahm", "natürlich", "neben", "nein", "neue", "neuen", "neun"))
    addAll(arrayOf("neunte", "neunten", "neunter", "neuntes", "nicht", "nichts", "nie", "niemand", "niemandem", "niemanden"))
    addAll(arrayOf("noch", "nun", "nur", "o", "ob", "oben", "oder", "offen", "oft", "ohne"))
    addAll(arrayOf("ordnung", "p", "q", "r", "recht", "rechte", "rechten", "rechter", "rechtes", "richtig"))
    addAll(arrayOf("rund", "s", "sa", "sache", "sagt", "sagte", "sah", "satt", "schlecht", "schluss"))
    addAll(arrayOf("schon", "sechs", "sechste", "sechsten", "sechster", "sechstes", "sehr", "sei", "seid", "seien"))
    addAll(arrayOf("sein", "seine", "seinem", "seinen", "seiner", "seines", "seit", "seitdem", "selbst", "sich"))
    addAll(arrayOf("sie", "sieben", "siebente", "siebenten", "siebenter", "siebentes", "sind", "so", "solang", "solche"))
    addAll(arrayOf("solchem", "solchen", "solcher", "solches", "soll", "sollen", "sollst", "sollt", "sollte", "sollten"))
    addAll(arrayOf("sondern", "sonst", "soweit", "sowie", "später", "startseite", "statt", "steht", "suche", "t"))
    addAll(arrayOf("tag", "tage", "tagen", "tat", "teil", "tel", "tritt", "trotzdem", "tun", "u"))
    addAll(arrayOf("uhr", "um", "und", "uns", "unse", "unsem", "unsen", "unser", "unsere", "unserer"))
    addAll(arrayOf("unses", "unter", "v", "vergangenen", "viel", "viele", "vielem", "vielen", "vielleicht", "vier"))
    addAll(arrayOf("vierte", "vierten", "vierter", "viertes", "vom", "von", "vor", "w", "wahr", "wann"))
    addAll(arrayOf("war", "waren", "warst", "wart", "warum", "was", "weg", "wegen", "weil", "weit"))
    addAll(arrayOf("weiter", "weitere", "weiteren", "weiteres", "welche", "welchem", "welchen", "welcher", "welches", "wem"))
    addAll(arrayOf("wen", "wenig", "wenige", "weniger", "weniges", "wenigstens", "wenn", "wer", "werde", "werden"))
    addAll(arrayOf("werdet", "weshalb", "wessen", "wie", "wieder", "wieso", "will", "willst", "wir", "wird"))
    addAll(arrayOf("wirklich", "wirst", "wissen", "wo", "woher", "wohin", "wohl", "wollen", "wollt", "wollte"))
    addAll(arrayOf("wollten", "worden", "wurde", "wurden", "während", "währenddem", "währenddessen", "wäre", "würde", "würden"))
    addAll(arrayOf("x", "y", "z", "z.b", "zehn", "zehnte", "zehnten", "zehnter", "zehntes", "zeit"))
    addAll(arrayOf("zu", "zuerst", "zugleich", "zum", "zunächst", "zur", "zurück", "zusammen", "zwanzig", "zwar"))
    addAll(arrayOf("zwei", "zweite", "zweiten", "zweiter", "zweites", "zwischen", "zwölf", "über", "überhaupt", "übrigens"))
}}