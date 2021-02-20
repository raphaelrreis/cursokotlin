package fundamentos.funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    var listaFiltrada = ArrayList<E>()
    for (e in lista) {
        if (filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
        return nome.length == 3
}


fun main(args: Array<String>) {
        val nomes = listOf("Ana", "Pedro", "Maria", "Bia", "Rebeca")
        println(filtrar(nomes, ::comTresLetras))
}

