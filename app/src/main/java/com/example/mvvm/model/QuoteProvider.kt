package com.example.mvvm.model

/**
 * Created by Oscar Arce
 * on 30/09/2022.
 */
class QuoteProvider {
    companion object {
        const val NUM_QUOTES = 100

        fun random(): QuoteModel {
            val position = (0..NUM_QUOTES).random()
            return quoteProvider[position]
        }

        private val quoteProvider = listOf<QuoteModel>(
            //1-10
            QuoteModel(
                id = 1,
                quote = "Nunca confíes en un ordenador que no puedas lanzar por una ventana",
                author = "Steve Wozniak"
            ),
            QuoteModel(
                id = 2,
                quote = "R2D2, ¿te lo dijo la computadora central de la ciudad? ¡R2D2, sabes bien que no debes confiar en una computadora extraña!",
                author = "C3PO"
            ),
            QuoteModel(
                id = 3,
                quote = "Es ridículo vivir 100 años y sólo ser capaces de recordar 30 millones de bytes. O sea, menos que un compact disc. La condición humana se hace más obsoleta cada minuto",
                author = "Marvin Minsky"
            ),
            QuoteModel(
                id = 4,
                quote = "Preguntarse cuándo los ordenadores podrán pensar es como preguntarse cuándo los submarinos podrán nadar",
                author = "Edsger W. Dijkstra"
            ),
            QuoteModel(
                id = 5,
                quote = "He notado últimamente que el miedo paranoico hacia ordenadores inteligentes tomando el control del mundo ha desaparecido totalmente. Todo lo que puedo contar es que este hecho coincide con la aparición de MS-DOS",
                author = "Larry DeLuca"
            ),
            QuoteModel(
                id = 6,
                quote = "Los ordenadores se hacen cada vez más inteligentes. Los científicos dicen que pronto ellos serán capaces de hablarnos (y con 'ellos' me refiero a los ordenadores, dudo mucho que los científicos sean capaces de hablarnos)",
                author = "Dave Barry"
            ),
            QuoteModel(
                id = 7,
                quote = "Si la industria automovilística hubiera seguido el mismo desarrollo que los ordenadores, un Rolls-Royce costaría hoy 100 dólares, circularía un millón de millas con 3,7 litros y explotaría una vez al año, eliminando a todo el que estuviera dentro en ese momento",
                author = "Robert X. Cringely"
            ),
            QuoteModel(
                id = 8,
                quote = "Es genial trabajar con ordenadores. No discuten, lo recuerdan todo y no se beben tu cerveza",
                author = "Paul Leary"
            ),
            QuoteModel(
                id = 9,
                quote = "Tienen ordenadores, y pueden tener otras armas de destrucción masiva.",
                author = "Janet Reno"
            ),
            QuoteModel(
                id = 10,
                quote = "Los ordenadores son como los bikinis. Ahorran a la gente el hacer muchas conjeturas.",
                author = "Sam Ewing"
            ),
            //11-20
            QuoteModel(
                id = 11,
                quote = "Los ordenadores son inútiles. Solo pueden darte respuestas.",
                author = "Pablo Picasso"
            ),
            QuoteModel(
                id = 12,
                quote = "Hardware: las partes de un ordenador que pueden ser pateadas",
                author = "Jeff Pesis"
            ),
            QuoteModel(
                id = 13,
                quote = "La mayoría del software actual es muy parecido a una pirámide egipcia, con millones de ladrillos puestos unos encima de otros sin una estructura integral, simplemente realizada a base de fuerza bruta y miles de esclavos",
                author = "Alan Kay"
            ),
            QuoteModel(
                id = 14,
                quote = "Por fin he entendido lo que significa 'upward compatible' (compatible hacia arriba). Significa que mantenemos todos nuestros viejos errores",
                author = "Dennie van Tassel"
            ),
            QuoteModel(
                id = 15,
                quote = "Todos los sistemas operativos que hay ahí fuera son más o menos iguales. Todos somos una mierda",
                author = "Brian Valentine, vicepresidente senior de Microsoft describiendo el estado del arte en seguridad de sistemas operativos en 2003"
            ),
            QuoteModel(
                id = 16,
                quote = "Microsoft ha lanzado una nueva versión, Windows XP, que según todo el mundo 'es la versión más fiable de Windows hasta la fecha'. Para mí, esto es como decir que el espárrago es el vegetal más articulado que ha existido nunca",
                author = "Dave Barry"
            ),
            QuoteModel(
                id = 17,
                quote = "¿Internet? ¿Todavía anda eso por ahí?",
                author = "Homer Simpson"
            ),
            QuoteModel(
                id = 18,
                quote = "La web es como una dominatriz. En todos los sitios que voy me encuentro pequeños botones ordenándome que me someta",
                author = "Nytwind Nota: el texto 'submit' que solemos ver en los botones de formularios se puede traducir como el verbo 'Someter'"
            ),
            QuoteModel(
                id = 19,
                quote = "Ahora que lo pienso, ya hay un millón de monos con máquinas de escribir y Usenet no es en absoluto como la obra de Shakespeare",
                author = "Blair Houghton"
            ),
            QuoteModel(
                id = 20,
                quote = "El logro más impresionante de la industria del software es su continua anulación de los constantes y asombrosos logros de la industria del hardware",
                author = "Henry Petroski"
            ),
            //21-30
            QuoteModel(
                id = 21,
                quote = "La verdadera innovación a menudo viene de las pequeñas startups que son capaces de crear mercados pero carecen de peso para poseerlos",
                author = "Timm Martin"
            ),
            QuoteModel(
                id = 22,
                quote = "Se dice que las grandes disciplinas científicas son ejemplos de gigantes subidos a los hombros de otros gigantes. También se dice que la industria del software es un ejemplo de enanos subidos a los dedos de los pies de otros enanos",
                author = "Alan Cooper"
            ),
            QuoteModel(
                id = 23,
                quote = "No se trata bits, bytes y protocolos, sino de beneficios, pérdidas y márgenes",
                author = "Lou Gerstner"
            ),
            QuoteModel(
                id = 24,
                quote = "Somos Microsoft. La resistencia es inútil. Serás absorbido",
                author = "Bumper sticker"
            ),
            QuoteModel(
                id = 25,
                quote = "No importa lo estupendamente que haya ido la demo en los ensayos, cuando lo haces frente a tu audiencia la probabilidad de que sea una presentación existosa es inversamente proporcional al número de personas mirando, elevado a la cantidad de dinero que hay en juego",
                author = "Mark Gibbs"
            ),
            QuoteModel(
                id = 26,
                quote = "La mayoría de las patentes son una mierda. Dedicar tiempo a leerlas es estúpido. Es cosa de los propietarios de las patentes hacerlo y procurar que se respeten",
                author = "Linus Torvalds"
            ),
            QuoteModel(
                id = 27,
                quote = "Controlar la complejidad es la esencia de la programación",
                author = "Brian Kernigan"
            ),
            QuoteModel(
                id = 28,
                quote = "La complejidad es destructiva. Chupa la sangre de los desarrolladores, hace que los productos sean difíciles de planificar, construir y probar, introduce problemas de seguridad y provoca la frustración de usuarios finales y administradores",
                author = "Ray Ozzie"
            ),
            QuoteModel(
                id = 29,
                quote = "Hay dos maneras de diseñar software: una es hacerlo tan simple que sea obvia su falta de deficiencias, y la otra es hacerlo tan complejo que no haya deficiencias obvias",
                author = "C.A.R. Hoare"
            ),
            QuoteModel(
                id = 30,
                quote = "La función de un buen software es hacer que lo complejo aparente ser simple",
                author = "Grady Booch"
            ),
            //31-40
            QuoteModel(
                id = 31,
                quote = "Recuerda: no eres torpe, no importa lo que digan esos libros. Los torpes de verdad son gente que, creyéndose expertos técnicos, no podrían diseñar hardware y software manejable por usuarios normales aunque la vida les fuera en ello",
                author = "Walter Mossberg"
            ),
            QuoteModel(
                id = 32,
                quote = "Los proveedores de software están intentando hacer sus productos más amigables para el usuario. Su mejor aproximación hasta el momento ha sido tomar sus antiguos folletos y estampar las palabras 'amigable para el usuario' en la portada",
                author = "Bill Gates"
            ),
            QuoteModel(
                id = 33,
                quote = "Hay una antigua historia sobre una persona que quería que su ordenador fuese tan fácil de utilizar como su teléfono. Estos deseos se han hecho realidad, ya no sé cómo usar mi teléfono",
                author = "Bjarne Stroustrup"
            ),
            QuoteModel(
                id = 34,
                quote = "Cualquier idiota puede usar un ordenador. De hecho, muchos lo hacen",
                author = "Ted Nelson"
            ),
            QuoteModel(
                id = 35,
                quote = "Sólo hay dos industrias que se refieren a sus clientes como 'usuarios'",
                author = "Edward Tufte"
            ),
            QuoteModel(
                id = 36,
                quote = "La programación es una carrera entre los desarrolladores, intentando construir mayores y mejores programas a prueba de idiotas, y el universo, intentanto producir mayores y mejores idiotas. Por ahora va ganando el Universo",
                author = "Rich Cook"
            ),
            QuoteModel(
                id = 37,
                quote = "La mayoría de ustedes están familiarizados con las virtudes del programador. Son tres, por supusto: pereza, impaciencia y orgullo desmedido",
                author = "Larry Wall"
            ),
            QuoteModel(
                id = 38,
                quote = "El problema que hay con los programadores es que nunca puedes contar lo que un programador está haciendo hasta que es demasiado tarde",
                author = "Seymour Cray"
            ),
            QuoteModel(
                id = 39,
                quote = "Esto es lo que ocurre con la gente que piensa que odia los ordenadores. Lo que realmente odia es a los malditos programadores",
                author = "Larry Niven"
            ),
            QuoteModel(
                id = 40,
                quote = "Durante mucho tiempo no entendía cómo algo tan caro y puntero podía ser tan inútil. Y entonces me vino a la mente que un ordenador es una máquina estúpida con la habilidad de hacer cosas increíblemente inteligentes, mientras que los programadores son inteligentes personas con la habilidad de hacer cosas estúpidas. Son, en resumen, una pareja perfecta",
                author = "Bill Bryson"
            ),
            //41-50
            QuoteModel(
                id = 41,
                quote = "La formación en informática no puede convertir a nadie en experto programador, de la misma forma que estudiar pinceles y pigmentos puede hacer a alguien un experto pintor",
                author = "Eric Raymond"
            ),
            QuoteModel(
                id = 42,
                quote = "Un programador es la persona considerada experta en ser capaz de sacar, después de innumerables tecleos, una serie infinita de respuestas incomprensibles calculadas con precisión micrométrica a partir de vagas asunciones basadas en discutibles cifras tomadas de documentos inconcluyentes y llevados a cabo con instrumentos de escasa precisión, por personas de fiabilidad dudosa y cuestionable mentalidad con el propósito declarado de molestar y confundiar al desesperado e indefenso departamento que tuvo la mala fortuna de pedir la información en primer lugar",
                author = "IEEE Grid newsmagazine"
            ),
            QuoteModel(
                id = 43,
                quote = "Un hacker puede ser capaz de producir, en unos pocos meses, algo que un pequeño grupo de desarrolladores (digamos de 7 u 8 personas) podría tener trabajado duramente juntos más de un año. IBM solía decir que ciertos programadores podían ser 100 veces más productivos que otros trabajadores, o más",
                author = "Peter Seebach"
            ),
            QuoteModel(
                id = 44,
                quote = "Los mejores programadores no son sólo marginalmente mejores que los buenos. Se trata de un orden de magnitud mayor, medida por cualquier estándar: creatividad conceptual, velocidad, ingenio o habilidad para solucionar problemas",
                author = "Randall E. Stross"
            ),
            QuoteModel(
                id = 45,
                quote = "Un gran operario de tornos vale varias veces más que un operario medio, pero un gran escritor de código vale 10.000 veces el precio de un desarrollador medio",
                author = "Bill Gates"
            ),
            QuoteModel(
                id = 46,
                quote = "No te preocupes si no funciona bien. Si todo estuviera correcto, serías despedido de tu trabajo",
                author = "Ley de Mosher de la Ingeniería del Software"
            ),
            QuoteModel(
                id = 47,
                quote = "Medir el progreso del desarrollo de software por líneas de código es como medir el progreso de la construcción de un avión por su peso",
                author = "Bill Gates"
            ),
            QuoteModel(
                id = 48,
                quote = "La escritura de código tiene un lugar en la jerarquía humana de valores por encima del saqueo de tumbas y por debajo de la dirección y gestión",
                author = "Gerald Weinberg"
            ),
            QuoteModel(
                id = 49,
                quote = "Primero aprende informática y toda la teoría. Después desarrolla un estilo de programación. Entonces, olvídalo todo y hackea",
                author = "George Carrette"
            ),
            QuoteModel(
                id = 50,
                quote = "Primero resuelve el problema. Entonces, escribe el código",
                author = "John Johnson"
            ),
            //51-60
            QuoteModel(
                id = 51,
                quote = "El optimismo es un riesgo laboral de la programación; el feedback es el tratamiento",
                author = "Kent Beck"
            ),
            QuoteModel(
                id = 52,
                quote = "Iterar es humano, 'recursivar' es divino",
                author = "L. Peter Deutsch"
            ),
            QuoteModel(
                id = 53,
                quote = "Lo mejor de los booleanos es que si te equivocas estás a un sólo bit de la solución correcta",
                author = "Anónimo"
            ),
            QuoteModel(
                id = 54,
                quote = "¿Los índices de los arrays deberían comenzar en 0 o en 1? Mi propuesta neutral de usar 0.5 fue rechazada, en mi opinión, sin la debida consideración",
                author = "Stan Kelly-Bootle"
            ),
            QuoteModel(
                id = 55,
                quote = "Hay sólo dos clases de lenguajes de programación: aquellos de los que la gente está siempre quejándose y aquellos que nadie usa",
                author = "Bjarne Stroustrup"
            ),
            QuoteModel(
                id = 56,
                quote = "PHP es un mal menor perpetrado y creado por amaterus incompetentes, mientras que Perl es un gran e insidioso mal perpetrado por hábiles pero pervertidos profesionales",
                author = "Jon Ribbens"
            ),
            QuoteModel(
                id = 57,
                quote = "El uso de COBOL daña la mente. Su enseñanza debería ser considerada como un ataque criminal",
                author = "E. W. Dijkstra"
            ),
            QuoteModel(
                id = 58,
                quote = "Es prácticamente imposible enseñar buenos hábitos de programación a estudiantes que hayan sido previamente sometidos a una exposición de BASIC. Como desarrolladores en potencia, están mentalmente mutilados sin esperanza de regeneración",
                author = "E. W. Dijkstra"
            ),
            QuoteModel(
                id = 59,
                quote = "Pienso que Microsoft eligió el nombre .Net para que no pudiera ser mostrado en un listado de directorio de Unix",
                author = "Oktal"
            ),
            QuoteModel(
                id = 60,
                quote = "No hay lenguaje de programación, no importa su estructura, que impida que los programadores hagan malos programas",
                author = "Larry Flon"
            ),
            //61-70
            QuoteModel(
                id = 61,
                quote = "El diseño de lenguajes de programación es como pasear en el parque. Bueno, en parque jurásico",
                author = "Larry Wall"
            ),
            QuoteModel(
                id = 62,
                quote = "¿Cincuenta años de investigación en lenguajes de programación, y acabamos con C++?",
                author = "Richard A. O'Keefe"
            ),
            QuoteModel(
                id = 63,
                quote = "Escribir en C o C++ es como utilizar una sierra eléctrica sin ningún tipo de protección",
                author = "Bob Gray"
            ),
            QuoteModel(
                id = 64,
                quote = "Cuando usas C++ es más difícil que te dispares a tí mismo en el pie, pero cuando lo haces, te vuelas la pierna entera",
                author = "Bjarne Stroustrup"
            ),
            QuoteModel(
                id = 65,
                quote = "C++ : Donde los amigos tienen acceso a tus miembros privados",
                author = "Gavin Russell Baker"
            ),
            QuoteModel(
                id = 66,
                quote = "Una de las causas principales de la caída del imperio romano fue que, como no usaban el cero, no tenían forma de saber cuándo sus programas en C terminaban correctamente",
                author = "Robert Firth"
            ),
            QuoteModel(
                id = 67,
                quote = "Java es, en muchos sentidos, C++-",
                author = "Michael Feldman"
            ),
            QuoteModel(
                id = 68,
                quote = "Decir que Java es estupendo porque funciona con todos los sistemas operativos es como decir que el sexo anal es estupendo porque funciona con todos los géneros",
                author = "Alanna"
            ),
            QuoteModel(
                id = 69,
                quote = "Bien, Java podría ser un buen ejemplo de cómo debería ser un lenguaje de programación. Sin embargo, las aplicaciones Java son buenos ejemplos de cómo las aplicaciones no deberían ser",
                author = "Pixadel"
            ),
            QuoteModel(
                id = 70,
                quote = "Si Java dispusiera de un mecanismo real de recolección de basura, la mayoría de los programas deberían autoeliminarse al ser ejecutados",
                author = "Robert Sewell"
            ),
            // 71-80
            QuoteModel(
                id = 71,
                quote = "El software es como el sexo: mejor si es libre y gratis",
                author = "Linus Torvalds"
            ),
            QuoteModel(
                id = 72,
                quote = "Las únicas personas que tienen algo que temer de software libre son aquellos cuyos productos tienen un valor aún menor",
                author = "David Emery"
            ),
            QuoteModel(
                id = 73,
                quote = "El buen código es su mejor documentación",
                author = "Steve McConnell"
            ),
            QuoteModel(
                id = 74,
                quote = "Cualquier código tuyo que no hayas mirado en los últimos seis meses o más es como si lo hubiese escrito otro",
                author = "Eagleson's Law"
            ),
            QuoteModel(
                id = 75,
                quote = "El primer 90% del código corresponde al primer 90% del tiempo de desarrollo. El 10% restante corresponde al otro 90% del desarrollo",
                author = "Tom Cargill"
            ),
            QuoteModel(
                id = 76,
                quote = "Los buenos programadores usan sus cerebros, pero unas buenas directrices nos ahorran de tener que hacerlo en cada caso",
                author = "Francis Glassborow"
            ),
            QuoteModel(
                id = 77,
                quote = "En software, muy raramente partimos de requisitos con sentido. Incluso teniéndolos, la única medida del éxito que importa es si nuestra solución resuelve la cambiante idea que el cliente tiene de lo que es su problema",
                author = "Jeff Atwood"
            ),
            QuoteModel(
                id = 78,
                quote = "Considerando el lamentable estado de nuestras aplicaciones informáticas actuales, el desarrollo de software es todavía un arte oscuro, y no puede ser aún considerado una ingeniería",
                author = "Bill Clinton"
            ),
            QuoteModel(
                id = 79,
                quote = "No puedes crear un gran software sin un gran equipo, y la mayoría de los equipos de desarrollo se comportan como familias disfuncionales",
                author = "Jim McCarthy"
            ),
            QuoteModel(
                id = 80,
                quote = "Tan pronto como comenzamos a programar encontramos, para nuestra sorpresa, que crear programas correctos no era tan fácil como habíamos pensado. Tuvo que descubrirse la depuración. Puedo recordar el instante exacto en el que me dí cuenta que una gran parte de mi vida desde entonces iba a pasarla encontrando errores en mis propios programas",
                author = "Maurice Wilkes descubre la depuración, 1949"
            ),
            // 81-90
            QuoteModel(
                id = 81,
                quote = "Depurar es al menos dos veces más duro que escribir el código por primera vez. Por tanto, si tu escribes el código de la forma más inteligente posible no serás, por definición, lo suficientemente inteligente para depurarlo",
                author = "Brian Kernighan"
            ),
            QuoteModel(
                id = 82,
                quote = "Si la depuración es el proceso de eliminar errores, entonces la programación debe ser el proceso de introducirlos",
                author = "Edsger W. Dijkstra"
            ),
            QuoteModel(
                id = 83,
                quote = "¡No me importa si funciona en tu máquina! ¡No estamos vendiendo tu máquina!",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                id = 84,
                quote = "Programar es como el sexo: un único error y tienes que estar soportándolo toda la vida",
                author = "Michael Sinz"
            ),
            QuoteModel(
                id = 85,
                quote = "Hay dos formas de escribir programas sin errores; sólo la tercera funciona",
                author = "Alan J. Perlis"
            ),
            QuoteModel(
                id = 86,
                quote = "Puedes tener un software de calidad o puedes tener aritmética de punteros, pero no puedes tener ambas cosas al mismo tiempo",
                author = "Bertrand Meyer"
            ),
            QuoteModel(
                id = 87,
                quote = "Si McDonnalds funcionara como una compañía de software, uno de cada cien Big Macs te envenenarían, y la respuesta sería 'lo sentimos, aquí tiene un cupón para dos más'",
                author = "Mark Minasi"
            ),
            QuoteModel(
                id = 88,
                quote = "Codifica siempre como si la persona que finalmente mantendrá tu código fuera un psicópata violento que sabe dónde vives",
                author = "Martin Golding"
            ),
            QuoteModel(
                id = 89,
                quote = "Cometer errores es humano, pero para estropear realmente las cosas necesitas un ordenador",
                author = "Paul Ehrlich"
            ),
            QuoteModel(
                id = 90,
                quote = "Un ordenador te permite cometer más errores y más rápido que cualquier otra invención en la historia de la humanidad, con las posibles excepciones de las pistolas y el tequila",
                author = "Mitch Radcliffe"
            ),
            // 91-100
            QuoteModel(
                id = 91,
                quote = "Todo lo que puede ser inventado ha sido ya inventado",
                author = "Charles H. Duell, Comisario de oficina de Patentes en EEUU, en 1899"
            ),
            QuoteModel(
                id = 92,
                quote = "Pienso que hay mercado en el mundo como para unos cinco ordenadores",
                author = "Thomas J. Watson, Presidente de la Junta Directiva de IBM, sobre 1948"
            ),
            QuoteModel(
                id = 93,
                quote = "Podría parecer que hemos llegado a los límites alcanzables por la tecnología informática, aunque uno debe ser prudente con estas afirmaciones, pues tienden a sonar bastante tontas en cinco años",
                author = "John Von Neumann, sobre 1949"
            ),
            QuoteModel(
                id = 94,
                quote = "Pero, ¿para qué puede valer eso?",
                author = "Ingeniero en la división de sistemas informáticos avanzados de IBM, hablando sobre los microchips, en 1968"
            ),
            QuoteModel(
                id = 95,
                quote = "No hay ninguna razón para que un individuo tenga un ordenador en su casa",
                author = "Ken Olson, Presidente de Digital Equipment Corporation, en 1977"
            ),
            QuoteModel(
                id = 96,
                quote = "640K deberían ser suficientes para todo el mundo",
                author = "Bill Gates, 1981"
            ),
            QuoteModel(
                id = 97,
                quote = "Windows NT podrá direccionar 2GB de RAM, que es más de lo que cualquier aplicación va a necesitar jamás",
                author = "Microsoft, durante el desarrollo de Windows NT, en 1992"
            ),
            QuoteModel(
                id = 98,
                quote = "Nunca seremos realmente una sociedad sin papeles hasta que la gente de la Palm Pilot creen 'WipeMe 1.0'",
                author = "Andy Pierson (Nota: Wipe es la traducción de toallita de papel)"
            ),
            QuoteModel(
                id = 99,
                quote = "Si las cosas siguen así, al hombre se le atrofiarán todas sus extremidades excepto los dedos de pulsar los botones",
                author = "Frank Lloyd Wright"
            ),
            QuoteModel(
                id = 100,
                quote = "Deja de contar fans, seguidores y suscriptores como si fueran tapones de botellas. Piensa en qué esperas lograr con ello con y mediante la comunidad que actualmente está pendiente de lo que estás haciendo",
                author = "Amber Naslund"
            ),
            QuoteModel(
                id = 101,
                quote = "Lo peor de leer citas en Internet es que no puedes estar cien por cien seguro de su autoría",
                author = "Abraham Lincoln"
            )
        )
    }
}