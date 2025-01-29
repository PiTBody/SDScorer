import kotlin.math.pow
import kotlin.math.sqrt

class SDScorer {
    fun sdScorer(list: List<Double>, sample: Int): List<Double> {
        val average = list.average()
        var difference = 0.0
        for (item in list) {
            val value = item - average
            difference += value.pow(2)
        }
        val sd = sqrt(difference / (list.size - sample))
        val sdScored = mutableListOf<Double>()
        for (item in list) {
            val change = item - average
            val sdScore = change / sd
            sdScored.add(sdScore)
        }
        return sdScored
    }
}