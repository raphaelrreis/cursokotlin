package fundamentos.classes

class Cliente {
    var nome: String = ""
}

fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome = "Joao"
    print("o cliente é ${cliente.nome}")
}
