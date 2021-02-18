package fundamentos.funcoes

fun <Element> List<Element>.secondOrNull(): Element? = if (this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    var list = listOf("Joao", "Maria", "Pedro")
    println(list.secondOrNull())
}
