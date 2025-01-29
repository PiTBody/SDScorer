import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val list = mutableListOf<Double>()
    println("Is this a sample (1), or a population (0)?")
    val sample = sc.nextInt()
    println("Insert the values of the list for them to be z-scored (enter 694201337 to stop):")
    var value = sc.nextDouble()
    while (value != 694201337.0) {
        list.add(value)
        value = sc.nextDouble()
    }
    if (list.isNotEmpty()) {
        val SDScorer = SDScorer()
        println(SDScorer.sdScorer(list, sample))
    } else {
        println("No SD is possible without some elements of the set.")
    }
}