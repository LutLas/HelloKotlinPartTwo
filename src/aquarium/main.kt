package aquarium

fun main(){
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}\n"+
            "Height: ${myAquarium.height}\n"+
            "Weight: ${myAquarium.weight}\n"+
            "Volume: ${myAquarium.volume}\n"
    )
}
