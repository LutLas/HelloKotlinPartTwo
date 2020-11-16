package spice

import quiz.Spice

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}