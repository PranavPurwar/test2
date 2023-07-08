package ff

class Main {
  fun main(args: Array<String>) {
    print("Your name")
    val n = readLine()!!
    println(n.substringAfter(':'))
  }
}
