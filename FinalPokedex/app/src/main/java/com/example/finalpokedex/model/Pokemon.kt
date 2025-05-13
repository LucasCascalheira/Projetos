package com.example.finalpokedex.model

data class Pokemon(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val types: List<String>,
    val description: String,
    val evolutions: List<String>
)

val samplePokemons = listOf(
    Pokemon(
        id = 1,
        name = "Bulbasaur",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
        types = listOf("Planta", "Veneno"),
        description = "Bulbasaur pode ser visto cochilando sob a luz solar. Há uma semente em suas costas. Ao absorver os raios do sol, a semente cresce progressivamente.",
        evolutions = listOf("Ivysaur", "Venusaur")
    ),
    Pokemon(
        id = 2,
        name = "Ivysaur",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png",
        types = listOf("Planta", "Veneno"),
        description = "Quando o bulbo nas costas de Ivysaur cresce, parece perder a capacidade de ficar de pé sobre as patas traseiras.",
        evolutions = listOf("Venusaur")
    ),
    Pokemon(
        id = 3,
        name = "Venusaur",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png",
        types = listOf("Planta", "Veneno"),
        description = "Venusaur possui uma flor nas costas. Diz-se que a flor adquire cores vivas se estiver bem nutrida e exposta à luz solar.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 4,
        name = "Charmander",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png",
        types = listOf("Fogo"),
        description = "A chama na ponta da cauda de Charmander indica sua saúde e humor.",
        evolutions = listOf("Charmeleon", "Charizard")
    ),
    Pokemon(
        id = 5,
        name = "Charmeleon",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png",
        types = listOf("Fogo"),
        description = "Charmeleon é feroz e gosta de batalhas intensas.",
        evolutions = listOf("Charizard")
    ),
    Pokemon(
        id = 6,
        name = "Charizard",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
        types = listOf("Fogo", "Voador"),
        description = "Charizard cospe fogo que pode derreter qualquer coisa.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 7,
        name = "Squirtle",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
        types = listOf("Água"),
        description = "Squirtle se esconde dentro de sua concha e borrifa água.",
        evolutions = listOf("Wartortle", "Blastoise")
    ),
    Pokemon(
        id = 8,
        name = "Wartortle",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png",
        types = listOf("Água"),
        description = "Wartortle é conhecido por sua cauda peluda e habilidades aquáticas.",
        evolutions = listOf("Blastoise")
    ),
    Pokemon(
        id = 9,
        name = "Blastoise",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png",
        types = listOf("Água"),
        description = "Blastoise tem canhões de água montados em sua carapaça.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 10,
        name = "Caterpie",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png",
        types = listOf("Inseto"),
        description = "Caterpie liberta um forte odor por seus chifres quando ameaçado.",
        evolutions = listOf("Metapod", "Butterfree")
    ),
    Pokemon(
        id = 11,
        name = "Metapod",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png",
        types = listOf("Inseto"),
        description = "Metapod é uma forma evolutiva de Caterpie. Ele está em processo de transformação.",
        evolutions = listOf("Butterfree")
    ),
    Pokemon(
        id = 12,
        name = "Butterfree",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png",
        types = listOf("Inseto", "Voador"),
        description = "Butterfree é conhecido por suas habilidades de voo e seus grandes olhos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 13,
        name = "Weedle",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png",
        types = listOf("Inseto", "Veneno"),
        description = "Weedle tem um ferrão venenoso na ponta de sua cauda.",
        evolutions = listOf("Kakuna", "Beedrill")
    ),
    Pokemon(
        id = 14,
        name = "Kakuna",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png",
        types = listOf("Inseto", "Veneno"),
        description = "Kakuna é a forma intermediária de Weedle antes de se tornar Beedrill.",
        evolutions = listOf("Beedrill")
    ),
    Pokemon(
        id = 15,
        name = "Beedrill",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png",
        types = listOf("Inseto", "Veneno"),
        description = "Beedrill é agressivo e usa suas garras afiadas para atacar.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 16,
        name = "Pidgey",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png",
        types = listOf("Normal", "Voador"),
        description = "Pidgey é um Pokémon pequeno que é bastante comum em áreas abertas.",
        evolutions = listOf("Pidgeotto", "Pidgeot")
    ),
    Pokemon(
        id = 17,
        name = "Pidgeotto",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png",
        types = listOf("Normal", "Voador"),
        description = "Pidgeotto é um pássaro com grande velocidade, usado frequentemente para transporte.",
        evolutions = listOf("Pidgeot")
    ),
    Pokemon(
        id = 18,
        name = "Pidgeot",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png",
        types = listOf("Normal", "Voador"),
        description = "Pidgeot é um dos voadores mais rápidos e hábeis, conhecido por seus ataques aéreos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 19,
        name = "Rattata",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png",
        types = listOf("Normal"),
        description = "Rattata é um Pokémon ágil, sempre em movimento em busca de comida.",
        evolutions = listOf("Raticate")
    ),
    Pokemon(
        id = 20,
        name = "Raticate",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/20.png",
        types = listOf("Normal"),
        description = "Raticate é um Pokémon rápido e muito agressivo, sempre em busca de alimento.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 21,
        name = "Spearow",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/21.png",
        types = listOf("Normal", "Voador"),
        description = "Spearow é um pássaro de pequeno porte que pode ser muito agressivo.",
        evolutions = listOf("Fearow")
    ),
    Pokemon(
        id = 22,
        name = "Fearow",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/22.png",
        types = listOf("Normal", "Voador"),
        description = "Fearow tem grande poder de voo e uma cauda longa que usa para se guiar.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 23,
        name = "Ekans",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/23.png",
        types = listOf("Veneno"),
        description = "Ekans se enrola ao redor de suas presas e é capaz de se camuflar facilmente.",
        evolutions = listOf("Arbok")
    ),
    Pokemon(
        id = 24,
        name = "Arbok",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/24.png",
        types = listOf("Veneno"),
        description = "Arbok é muito agressivo e seu veneno pode ser mortal para suas presas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 25,
        name = "Pikachu",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png",
        types = listOf("Elétrico"),
        description = "Pikachu é um Pokémon elétrico com uma cauda que brilha e descarrega eletricidade.",
        evolutions = listOf("Raichu")
    ),
    Pokemon(
        id = 26,
        name = "Raichu",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/26.png",
        types = listOf("Elétrico"),
        description = "Raichu é a evolução de Pikachu e tem a capacidade de gerar grandes quantidades de eletricidade.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 27,
        name = "Sandshrew",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/27.png",
        types = listOf("Terrestre"),
        description = "Sandshrew vive sob a terra e se enrola em sua forma esférica para se proteger.",
        evolutions = listOf("Sandslash")
    ),
    Pokemon(
        id = 28,
        name = "Sandslash",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/28.png",
        types = listOf("Terrestre"),
        description = "Sandslash usa suas garras para cavar rapidamente e se proteger de predadores.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 29,
        name = "Nidoran♀",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/29.png",
        types = listOf("Veneno"),
        description = "Nidoran♀ é conhecida por sua natureza agressiva e pelo veneno potente que possui.",
        evolutions = listOf("Nidorina", "Nidoqueen")
    ),
    Pokemon(
        id = 30,
        name = "Nidorina",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/30.png",
        types = listOf("Veneno"),
        description = "Nidorina é mais forte que Nidoran♀ e usa sua força para defender seu território.",
        evolutions = listOf("Nidoqueen")
    ),
    Pokemon(
        id = 31,
        name = "Nidoqueen",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/31.png",
        types = listOf("Veneno", "Terrestre"),
        description = "Nidoqueen é uma Pokémon forte e protetora, com grande resistência e habilidades de combate.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 32,
        name = "Nidoran♂",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png",
        types = listOf("Veneno"),
        description = "Nidoran♂ é mais agressivo que sua contraparte feminina e se destaca pela força.",
        evolutions = listOf("Nidorino", "Nidoking")
    ),
    Pokemon(
        id = 33,
        name = "Nidorino",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/33.png",
        types = listOf("Veneno"),
        description = "Nidorino é mais forte e audacioso, evoluindo para uma forma mais poderosa.",
        evolutions = listOf("Nidoking")
    ),
    Pokemon(
        id = 34,
        name = "Nidoking",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/34.png",
        types = listOf("Veneno", "Terrestre"),
        description = "Nidoking é uma Pokémon poderosa e dominante, com habilidades de combate formidáveis.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 35,
        name = "Clefairy",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/35.png",
        types = listOf("Fada"),
        description = "Clefairy é um Pokémon místico que gosta de dançar sob a luz da lua.",
        evolutions = listOf("Clefable")
    ),
    Pokemon(
        id = 36,
        name = "Clefable",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/36.png",
        types = listOf("Fada"),
        description = "Clefable é um Pokémon raro e misterioso que se esconde nas cavernas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 37,
        name = "Vulpix",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/37.png",
        types = listOf("Fogo"),
        description = "Vulpix é um Pokémon muito ágil e bonito, com seis caudas que emitem chamas.",
        evolutions = listOf("Ninetales")
    ),
    Pokemon(
        id = 38,
        name = "Ninetales",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/38.png",
        types = listOf("Fogo"),
        description = "Ninetales é conhecido por sua beleza e habilidades místicas com suas chamas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 39,
        name = "Jigglypuff",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/39.png",
        types = listOf("Normal", "Fada"),
        description = "Jigglypuff encanta a todos com sua voz suave e melodiosa.",
        evolutions = listOf("Wigglytuff")
    ),
    Pokemon(
        id = 40,
        name = "Wigglytuff",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/40.png",
        types = listOf("Normal", "Fada"),
        description = "Wigglytuff é um Pokémon com grande capacidade vocal, capaz de encantar com sua canção.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 41,
        name = "Zubat",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/41.png",
        types = listOf("Veneno", "Voador"),
        description = "Zubat vive em cavernas escuras e emite ondas supersônicas para se orientar.",
        evolutions = listOf("Golbat")
    ),
    Pokemon(
        id = 42,
        name = "Golbat",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/42.png",
        types = listOf("Veneno", "Voador"),
        description = "Golbat é um Pokémon noturno que se alimenta da energia vital de suas presas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 43,
        name = "Oddish",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/43.png",
        types = listOf("Planta", "Veneno"),
        description = "Oddish absorve a luz da lua e se esconde no solo durante o dia.",
        evolutions = listOf("Gloom", "Vileplume")
    ),
    Pokemon(
        id = 44,
        name = "Gloom",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/44.png",
        types = listOf("Planta", "Veneno"),
        description = "Gloom emite um odor desagradável para se defender de predadores.",
        evolutions = listOf("Vileplume")
    ),
    Pokemon(
        id = 45,
        name = "Vileplume",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png",
        types = listOf("Planta", "Veneno"),
        description = "Vileplume possui pétalas grandes e vibrantes que espalham esporos tóxicos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 46,
        name = "Paras",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/46.png",
        types = listOf("Inseto", "Planta"),
        description = "Paras cultiva cogumelos em suas costas, que são usados para medicina.",
        evolutions = listOf("Parasect")
    ),
    Pokemon(
        id = 47,
        name = "Parasect",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/47.png",
        types = listOf("Inseto", "Planta"),
        description = "Parasect é completamente dominado pelo cogumelo que carrega.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 48,
        name = "Venonat",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/48.png",
        types = listOf("Inseto", "Veneno"),
        description = "Venonat tem olhos grandes que enxergam no escuro e libera toxinas.",
        evolutions = listOf("Venomoth")
    ),
    Pokemon(
        id = 49,
        name = "Venomoth",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/49.png",
        types = listOf("Inseto", "Veneno"),
        description = "Venomoth libera pólen venenoso com o bater de suas asas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 50,
        name = "Diglett",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/50.png",
        types = listOf("Terrestre"),
        description = "Diglett vive no subsolo e é raramente visto acima da terra.",
        evolutions = listOf("Dugtrio")
    ),
    Pokemon(
        id = 51,
        name = "Dugtrio",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/51.png",
        types = listOf("Terrestre"),
        description = "Dugtrio consiste em três Digletts unidos que causam terremotos subterrâneos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 52,
        name = "Meowth",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/52.png",
        types = listOf("Normal"),
        description = "Meowth é atraído por objetos brilhantes e anda furtivamente à noite.",
        evolutions = listOf("Persian")
    ),
    Pokemon(
        id = 53,
        name = "Persian",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/53.png",
        types = listOf("Normal"),
        description = "Persian é ágil e elegante, com um temperamento feroz se provocado.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 54,
        name = "Psyduck",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/54.png",
        types = listOf("Água"),
        description = "Psyduck sofre de dores de cabeça que liberam poderes psíquicos.",
        evolutions = listOf("Golduck")
    ),
    Pokemon(
        id = 55,
        name = "Golduck",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/55.png",
        types = listOf("Água"),
        description = "Golduck nada com grande velocidade e poder, usando seus poderes psíquicos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 56,
        name = "Mankey",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/56.png",
        types = listOf("Lutador"),
        description = "Mankey é muito temperamental e ataca quando fica irritado.",
        evolutions = listOf("Primeape")
    ),
    Pokemon(
        id = 57,
        name = "Primeape",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/57.png",
        types = listOf("Lutador"),
        description = "Primeape se torna ainda mais agressivo quando é provocado.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 58,
        name = "Growlithe",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/58.png",
        types = listOf("Fogo"),
        description = "Growlithe é fiel ao seu treinador e late ferozmente contra ameaças.",
        evolutions = listOf("Arcanine")
    ),
    Pokemon(
        id = 59,
        name = "Arcanine",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/59.png",
        types = listOf("Fogo"),
        description = "Arcanine corre a velocidades incríveis e exala uma aura de nobreza.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 60,
        name = "Poliwag",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/60.png",
        types = listOf("Água"),
        description = "Poliwag tem uma pele lisa e seu redemoinho é um órgão visível.",
        evolutions = listOf("Poliwhirl", "Poliwrath")
    ),
    Pokemon(
        id = 61,
        name = "Poliwhirl",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/61.png",
        types = listOf("Água"),
        description = "Poliwhirl é conhecido por sua pele escorregadia e espiral hipnótica.",
        evolutions = listOf("Poliwrath", "Politoed")
    ),
    Pokemon(
        id = 62,
        name = "Poliwrath",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/62.png",
        types = listOf("Água", "Lutador"),
        description = "Poliwrath possui braços fortes e é um excelente nadador.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 63,
        name = "Abra",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/63.png",
        types = listOf("Psíquico"),
        description = "Abra dorme a maior parte do tempo e se teleporta para escapar do perigo.",
        evolutions = listOf("Kadabra")
    ),
    Pokemon(
        id = 64,
        name = "Kadabra",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/64.png",
        types = listOf("Psíquico"),
        description = "Kadabra emite ondas cerebrais que afetam aparelhos eletrônicos.",
        evolutions = listOf("Alakazam")
    ),
    Pokemon(
        id = 65,
        name = "Alakazam",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/65.png",
        types = listOf("Psíquico"),
        description = "Alakazam possui um cérebro altamente desenvolvido e poderes psíquicos impressionantes.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 66,
        name = "Machop",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/66.png",
        types = listOf("Lutador"),
        description = "Machop treina constantemente seus músculos e adora lutar.",
        evolutions = listOf("Machoke")
    ),
    Pokemon(
        id = 67,
        name = "Machoke",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/67.png",
        types = listOf("Lutador"),
        description = "Machoke possui força enorme e ajuda em construções com seu poder físico.",
        evolutions = listOf("Machamp")
    ),
    Pokemon(
        id = 68,
        name = "Machamp",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/68.png",
        types = listOf("Lutador"),
        description = "Machamp tem quatro braços poderosos e golpes velozes.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 69,
        name = "Bellsprout",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/69.png",
        types = listOf("Planta", "Veneno"),
        description = "Bellsprout se move com graça para capturar presas com seu caule flexível.",
        evolutions = listOf("Weepinbell")
    ),
    Pokemon(
        id = 70,
        name = "Weepinbell",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/70.png",
        types = listOf("Planta", "Veneno"),
        description = "Weepinbell usa ácido para derreter suas presas antes de comê-las.",
        evolutions = listOf("Victreebel")
    ),
    Pokemon(
        id = 71,
        name = "Victreebel",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/71.png",
        types = listOf("Planta", "Veneno"),
        description = "Victreebel atrai suas presas com um aroma doce antes de devorá-las.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 72,
        name = "Tentacool",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/72.png",
        types = listOf("Água", "Veneno"),
        description = "Tentacool vive no mar e solta toxinas para se defender.",
        evolutions = listOf("Tentacruel")
    ),
    Pokemon(
        id = 73,
        name = "Tentacruel",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/73.png",
        types = listOf("Água", "Veneno"),
        description = "Tentacruel possui muitos tentáculos e ataca com toxinas paralisantes.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 74,
        name = "Geodude",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/74.png",
        types = listOf("Pedra", "Terrestre"),
        description = "Geodude vive nas montanhas e camufla-se entre as rochas.",
        evolutions = listOf("Graveler")
    ),
    Pokemon(
        id = 75,
        name = "Graveler",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/75.png",
        types = listOf("Pedra", "Terrestre"),
        description = "Graveler rola ladeira abaixo esmagando tudo em seu caminho.",
        evolutions = listOf("Golem")
    ),
    Pokemon(
        id = 76,
        name = "Golem",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/76.png",
        types = listOf("Pedra", "Terrestre"),
        description = "Golem possui uma carapaça dura como rocha e grande poder destrutivo.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 77,
        name = "Ponyta",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/77.png",
        types = listOf("Fogo"),
        description = "Ponyta corre velozmente com sua crina flamejante balançando ao vento.",
        evolutions = listOf("Rapidash")
    ),
    Pokemon(
        id = 78,
        name = "Rapidash",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/78.png",
        types = listOf("Fogo"),
        description = "Rapidash é rápido como o vento e deixa rastros de fogo por onde passa.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 79,
        name = "Slowpoke",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/79.png",
        types = listOf("Água", "Psíquico"),
        description = "Slowpoke é lento e tranquilo, raramente se assusta com algo.",
        evolutions = listOf("Slowbro", "Slowking")
    ),
    Pokemon(
        id = 80,
        name = "Slowbro",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/80.png",
        types = listOf("Água", "Psíquico"),
        description = "Slowbro ganhou uma concha presa à cauda que aumentou seus poderes psíquicos.",
        evolutions = listOf("Slowking")
    ),
    Pokemon(
        id = 81,
        name = "Magnemite",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/81.png",
        types = listOf("Elétrico", "Aço"),
        description = "Magnemite flutua usando magnetismo e emite ondas elétricas.",
        evolutions = listOf("Magneton", "Magnezone")
    ),
    Pokemon(
        id = 82,
        name = "Magneton",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/82.png",
        types = listOf("Elétrico", "Aço"),
        description = "Magneton é a junção de três Magnemite que atuam em uníssono.",
        evolutions = listOf("Magnezone")
    ),
    Pokemon(
        id = 83,
        name = "Farfetch’d",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/83.png",
        types = listOf("Normal", "Voador"),
        description = "Farfetch’d é conhecido por carregar um alho-poró que usa como arma.",
        evolutions = listOf("Sirfetch’d")
    ),
    Pokemon(
        id = 84,
        name = "Doduo",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/84.png",
        types = listOf("Normal", "Voador"),
        description = "Doduo tem duas cabeças que pensam de forma independente.",
        evolutions = listOf("Dodrio")
    ),
    Pokemon(
        id = 85,
        name = "Dodrio",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/85.png",
        types = listOf("Normal", "Voador"),
        description = "Dodrio tem três cabeças e é muito veloz em terra firme.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 86,
        name = "Seel",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/86.png",
        types = listOf("Água"),
        description = "Seel nada com graça em águas geladas e resiste bem ao frio.",
        evolutions = listOf("Dewgong")
    ),
    Pokemon(
        id = 87,
        name = "Dewgong",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/87.png",
        types = listOf("Água", "Gelo"),
        description = "Dewgong adora o frio e desliza suavemente no gelo e na neve.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 88,
        name = "Grimer",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/88.png",
        types = listOf("Veneno"),
        description = "Grimer é feito de lodo tóxico e polui onde quer que passe.",
        evolutions = listOf("Muk")
    ),
    Pokemon(
        id = 89,
        name = "Muk",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/89.png",
        types = listOf("Veneno"),
        description = "Muk libera um odor fétido e tóxico por todo o seu corpo.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 90,
        name = "Shellder",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/90.png",
        types = listOf("Água"),
        description = "Shellder se prende com força e é protegido por sua concha resistente.",
        evolutions = listOf("Cloyster")
    ),
    Pokemon(
        id = 91,
        name = "Cloyster",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/91.png",
        types = listOf("Água", "Gelo"),
        description = "Cloyster possui uma das conchas mais duras conhecidas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 92,
        name = "Gastly",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/92.png",
        types = listOf("Fantasma", "Veneno"),
        description = "Gastly é um gás fantasmagórico que assusta com facilidade.",
        evolutions = listOf("Haunter")
    ),
    Pokemon(
        id = 93,
        name = "Haunter",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/93.png",
        types = listOf("Fantasma", "Veneno"),
        description = "Haunter se move pelas sombras e ataca com sua língua venenosa.",
        evolutions = listOf("Gengar")
    ),
    Pokemon(
        id = 94,
        name = "Gengar",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/94.png",
        types = listOf("Fantasma", "Veneno"),
        description = "Gengar se diverte assustando as pessoas com sua risada sinistra.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 95,
        name = "Onix",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/95.png",
        types = listOf("Pedra", "Terrestre"),
        description = "Onix cava túneis subterrâneos com seu corpo imenso e rochoso.",
        evolutions = listOf("Steelix")
    ),
    Pokemon(
        id = 96,
        name = "Drowzee",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/96.png",
        types = listOf("Psíquico"),
        description = "Drowzee se alimenta dos sonhos das pessoas e pode induzir o sono.",
        evolutions = listOf("Hypno")
    ),
    Pokemon(
        id = 97,
        name = "Hypno",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/97.png",
        types = listOf("Psíquico"),
        description = "Hypno usa seu pêndulo para hipnotizar seus alvos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 98,
        name = "Krabby",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/98.png",
        types = listOf("Água"),
        description = "Krabby usa suas pinças poderosas para se defender e lutar.",
        evolutions = listOf("Kingler")
    ),
    Pokemon(
        id = 99,
        name = "Kingler",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/99.png",
        types = listOf("Água"),
        description = "Kingler possui uma pinça gigantesca com força esmagadora.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 100,
        name = "Voltorb",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/100.png",
        types = listOf("Elétrico"),
        description = "Voltorb parece uma Pokébola e explode ao menor toque.",
        evolutions = listOf("Electrode")
    ),
    Pokemon(
        id = 101,
        name = "Electrode",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/101.png",
        types = listOf("Elétrico"),
        description = "Electrode é conhecido por sua tendência a explodir ao menor estímulo.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 102,
        name = "Exeggcute",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/102.png",
        types = listOf("Planta", "Psíquico"),
        description = "Exeggcute é um grupo de seis ovos que compartilham uma consciência coletiva.",
        evolutions = listOf("Exeggutor")
    ),
    Pokemon(
        id = 103,
        name = "Exeggutor",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/103.png",
        types = listOf("Planta", "Psíquico"),
        description = "Exeggutor é um Pokémon com múltiplas cabeças que pensa de forma coordenada.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 104,
        name = "Cubone",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/104.png",
        types = listOf("Terrestre"),
        description = "Cubone usa o crânio de sua mãe falecida como capacete.",
        evolutions = listOf("Marowak")
    ),
    Pokemon(
        id = 105,
        name = "Marowak",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/105.png",
        types = listOf("Terrestre"),
        description = "Marowak é um guerreiro habilidoso que usa um osso como arma.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 106,
        name = "Hitmonlee",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/106.png",
        types = listOf("Lutador"),
        description = "Hitmonlee é mestre em chutes e possui pernas extremamente elásticas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 107,
        name = "Hitmonchan",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/107.png",
        types = listOf("Lutador"),
        description = "Hitmonchan é especialista em socos rápidos e precisos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 108,
        name = "Lickitung",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/108.png",
        types = listOf("Normal"),
        description = "Lickitung possui uma língua longa que usa para capturar e saborear objetos.",
        evolutions = listOf("Lickilicky")
    ),
    Pokemon(
        id = 109,
        name = "Koffing",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/109.png",
        types = listOf("Veneno"),
        description = "Koffing flutua no ar liberando gases tóxicos e inflamáveis.",
        evolutions = listOf("Weezing")
    ),
    Pokemon(
        id = 110,
        name = "Weezing",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/110.png",
        types = listOf("Veneno"),
        description = "Weezing é formado por dois Koffing que se fundiram, emitindo gases ainda mais tóxicos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 111,
        name = "Rhyhorn",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/111.png",
        types = listOf("Terrestre", "Pedra"),
        description = "Rhyhorn é um Pokémon robusto que avança destruindo tudo em seu caminho.",
        evolutions = listOf("Rhydon")
    ),
    Pokemon(
        id = 112,
        name = "Rhydon",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/112.png",
        types = listOf("Terrestre", "Pedra"),
        description = "Rhydon possui uma pele resistente e um chifre capaz de perfurar rochas.",
        evolutions = listOf("Rhyperior")
    ),
    Pokemon(
        id = 113,
        name = "Chansey",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/113.png",
        types = listOf("Normal"),
        description = "Chansey é gentil e carrega um ovo nutritivo que compartilha com os necessitados.",
        evolutions = listOf("Blissey")
    ),
    Pokemon(
        id = 114,
        name = "Tangela",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/114.png",
        types = listOf("Planta"),
        description = "Tangela é coberto por vinhas azuis que se movem constantemente.",
        evolutions = listOf("Tangrowth")
    ),
    Pokemon(
        id = 115,
        name = "Kangaskhan",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/115.png",
        types = listOf("Normal"),
        description = "Kangaskhan é uma mãe protetora que carrega seu filhote na bolsa.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 116,
        name = "Horsea",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/116.png",
        types = listOf("Água"),
        description = "Horsea nada habilmente e pode disparar jatos de tinta para se defender.",
        evolutions = listOf("Seadra")
    ),
    Pokemon(
        id = 117,
        name = "Seadra",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/117.png",
        types = listOf("Água"),
        description = "Seadra possui espinhos venenosos e é territorial em seu habitat aquático.",
        evolutions = listOf("Kingdra")
    ),
    Pokemon(
        id = 118,
        name = "Goldeen",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/118.png",
        types = listOf("Água"),
        description = "Goldeen é conhecido por sua beleza e nado gracioso.",
        evolutions = listOf("Seaking")
    ),
    Pokemon(
        id = 119,
        name = "Seaking",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/119.png",
        types = listOf("Água"),
        description = "Seaking é um nadador poderoso que patrulha rios e lagos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 120,
        name = "Staryu",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/120.png",
        types = listOf("Água"),
        description = "Staryu é uma estrela do mar que brilha intensamente à noite.",
        evolutions = listOf("Starmie")
    ),
    Pokemon(
        id = 121,
        name = "Starmie",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/121.png",
        types = listOf("Água", "Psíquico"),
        description = "Starmie possui um núcleo que emite luzes misteriosas e se comunica com estrelas distantes.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 122,
        name = "Mr. Mime",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/122.png",
        types = listOf("Psíquico", "Fada"),
        description = "Mr. Mime cria barreiras invisíveis com seus gestos mímicos.",
        evolutions = listOf("Mime Jr.")
    ),
    Pokemon(
        id = 123,
        name = "Scyther",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/123.png",
        types = listOf("Inseto", "Voador"),
        description = "Scyther é ágil e usa suas lâminas para cortar tudo com precisão.",
        evolutions = listOf("Scizor")
    ),
    Pokemon(
        id = 124,
        name = "Jynx",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/124.png",
        types = listOf("Gelo", "Psíquico"),
        description = "Jynx dança para se comunicar e hipnotiza seus oponentes com movimentos elegantes.",
        evolutions = listOf("Smoochum")
    ),
    Pokemon(
        id = 125,
        name = "Electabuzz",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/125.png",
        types = listOf("Elétrico"),
        description = "Electabuzz atrai raios e pode causar blecautes com sua energia elétrica.",
        evolutions = listOf("Electivire")
    ),
    Pokemon(
        id = 126,
        name = "Magmar",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/126.png",
        types = listOf("Fogo"),
        description = "Magmar vive em vulcões e seu corpo emite calor intenso.",
        evolutions = listOf("Magmortar")
    ),
    Pokemon(
        id = 127,
        name = "Pinsir",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/127.png",
        types = listOf("Inseto"),
        description = "Pinsir usa suas mandíbulas para esmagar seus inimigos com força.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 128,
        name = "Tauros",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/128.png",
        types = listOf("Normal"),
        description = "Tauros é um Pokémon feroz que corre em manadas, atacando com suas caudas e chifres.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 129,
        name = "Magikarp",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/129.png",
        types = listOf("Água"),
        description = "Magikarp é fraco e inútil em combate, mas é famoso por sua persistência.",
        evolutions = listOf("Gyarados")
    ),
    Pokemon(
        id = 130,
        name = "Gyarados",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/130.png",
        types = listOf("Água", "Voador"),
        description = "Gyarados é temido por sua fúria devastadora e aparência imponente.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 131,
        name = "Lapras",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/131.png",
        types = listOf("Água", "Gelo"),
        description = "Lapras é gentil e inteligente, usado para transporte em mares e lagos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 132,
        name = "Ditto",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png",
        types = listOf("Normal"),
        description = "Ditto pode se transformar em qualquer outro Pokémon que veja.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 133,
        name = "Eevee",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/133.png",
        types = listOf("Normal"),
        description = "Eevee tem uma estrutura genética instável, permitindo múltiplas evoluções.",
        evolutions = listOf("Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon")
    ),
    Pokemon(
        id = 134,
        name = "Vaporeon",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/134.png",
        types = listOf("Água"),
        description = "Vaporeon se camufla na água e tem barbatanas que o tornam excelente nadador.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 135,
        name = "Jolteon",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/135.png",
        types = listOf("Elétrico"),
        description = "Jolteon emite eletricidade estática de sua pelagem e ataca com raios rápidos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 136,
        name = "Flareon",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/136.png",
        types = listOf("Fogo"),
        description = "Flareon armazena calor em seu corpo e libera chamas intensas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 137,
        name = "Porygon",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/137.png",
        types = listOf("Normal"),
        description = "Porygon é um Pokémon virtual capaz de entrar em sistemas computacionais.",
        evolutions = listOf("Porygon2", "Porygon-Z")
    ),
    Pokemon(
        id = 138,
        name = "Omanyte",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/138.png",
        types = listOf("Pedra", "Água"),
        description = "Omanyte é um fóssil revivido que se enrola na concha para se proteger.",
        evolutions = listOf("Omastar")
    ),
    Pokemon(
        id = 139,
        name = "Omastar",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/139.png",
        types = listOf("Pedra", "Água"),
        description = "Omastar tem tentáculos fortes e uma carapaça resistente que o protege de predadores.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 140,
        name = "Kabuto",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/140.png",
        types = listOf("Pedra", "Água"),
        description = "Kabuto é um Pokémon antigo que se protege com sua concha dura.",
        evolutions = listOf("Kabutops")
    ),
    Pokemon(
        id = 141,
        name = "Kabutops",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/141.png",
        types = listOf("Pedra", "Água"),
        description = "Kabutops é um Pokémon pré-histórico com lâminas afiadas que usa para cortar suas presas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 142,
        name = "Aerodactyl",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/142.png",
        types = listOf("Pedra", "Voador"),
        description = "Aerodactyl é um Pokémon voador pré-histórico com mandíbulas poderosas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 143,
        name = "Snorlax",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/143.png",
        types = listOf("Normal"),
        description = "Snorlax é conhecido por seu apetite insaciável e por dormir a maior parte do tempo.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 144,
        name = "Articuno",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/144.png",
        types = listOf("Gelo", "Voador"),
        description = "Articuno é um pássaro lendário que controla o gelo e as nevascas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 145,
        name = "Zapdos",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/145.png",
        types = listOf("Elétrico", "Voador"),
        description = "Zapdos é um pássaro lendário que controla os raios e tempestades.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 146,
        name = "Moltres",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/146.png",
        types = listOf("Fogo", "Voador"),
        description = "Moltres é um pássaro lendário envolto em chamas que traz a primavera.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 147,
        name = "Dratini",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/147.png",
        types = listOf("Dragão"),
        description = "Dratini é um Pokémon serpentino que vive em águas profundas e cresce continuamente.",
        evolutions = listOf("Dragonair")
    ),
    Pokemon(
        id = 148,
        name = "Dragonair",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/148.png",
        types = listOf("Dragão"),
        description = "Dragonair é elegante e emite uma aura mística que controla o clima.",
        evolutions = listOf("Dragonite")
    ),
    Pokemon(
        id = 149,
        name = "Dragonite",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/149.png",
        types = listOf("Dragão", "Voador"),
        description = "Dragonite é um Pokémon poderoso e benevolente que pode dar a volta ao mundo em 16 horas.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 150,
        name = "Mewtwo",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/150.png",
        types = listOf("Psíquico"),
        description = "Mewtwo é um Pokémon criado geneticamente com poderes psíquicos imensos.",
        evolutions = emptyList()
    ),
    Pokemon(
        id = 151,
        name = "Mew",
        imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/151.png",
        types = listOf("Psíquico"),
        description = "Mew é um Pokémon mítico que contém o DNA de todos os Pokémon existentes.",
        evolutions = emptyList()
    )
)