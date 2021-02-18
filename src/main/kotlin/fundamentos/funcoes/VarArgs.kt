package fundamentos.funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(28, 3, 451, 88, 931, a = 1))
        println("$n ")
}
