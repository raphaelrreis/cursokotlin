package fundamentos.funcoes

import java.lang.ArithmeticException

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("Joao", "Maria"))
    println(relacaoDeTrabalho(funcionario = "Joao", chefe = "Maria"))

}
