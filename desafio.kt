// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val aluno: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
    override fun toString(): String {
        return "Na Formacao $nome, os temas a serem estudados serao ${conteudos.joinToString(", ") { "${it.nome} (${it.duracao} horas)" }}"
    }

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.aluno} foi matriculado no formacao $nome")
    }
}

fun main() {

    val conteudo = listOf(
        ConteudoEducacional("Introducao a OOP", 2),
        ConteudoEducacional("Variaveis e fluxos", 5),
        ConteudoEducacional("Algoritmos Avançados", 30)
    )

    val formacao = Formacao("Kotlin", conteudo, nivel = Nivel.INTERMEDIARIO)
    formacao.matricular(Usuario("Daniel"))
    println(formacao.toString())

}

