package fundamentos.funcoes

fun potencia(base: Int = 2, expoent: Int = 1): Int {
    return Math.pow(base.toDouble(), expoent.toDouble()).toInt()
}

fun main(args: Array<String>) {
    println(potencia(2, 3))
    println(potencia(10))
    println(potencia(base = 10))
    println(potencia(expoent = 8))
}
