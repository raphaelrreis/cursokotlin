package fundamentos.funcoes

fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimeMaior3(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun imprimrMeior5(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMaior1(2, 1)
    imprimeMaior2(2, 1)
    imprimeMaior3(1, 2)
    imprimrMeior5(2, 1).run { 2 > 4 }.run { 3 > 4 }.run { 4 > 5 }


}
