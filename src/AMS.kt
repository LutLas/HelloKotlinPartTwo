import java.lang.Math.random
import java.util.*

/*fun main() {
    println("Hello World")
    dayOfWeek()
    val fortuneReads = getFortuneCookie(0)
    println(fortuneReads)
}

fun dayOfWeek(){
    println("What Day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })

    println("What Time is it right now?")
    val hour = when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY).toString()) {
        "0" -> "00"
        "1" -> "01"
        "2" -> "02"
        "3" -> "03"
        "4" -> "04"
        "5" -> "05"
        "6" -> "06"
        "7" -> "07"
        "8" -> "08"
        "9" -> "09"
        else -> Calendar.getInstance().get(Calendar.HOUR_OF_DAY).toString()
    }
    val min = when (Calendar.getInstance().get(Calendar.MINUTE).toString()) {
        "0" -> "00"
        "1" -> "01"
        "2" -> "02"
        "3" -> "03"
        "4" -> "04"
        "5" -> "05"
        "6" -> "06"
        "7" -> "07"
        "8" -> "08"
        "9" -> "09"
        else -> Calendar.getInstance().get(Calendar.MINUTE).toString()
    }
    println( "Time is $hour:$min" )
}


fun getFortuneCookie(birthday: Int): String{
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    val fortune1 = fortunes.random()
    val fortune2 = fortunes[Random().nextInt(fortunes.size)]
    println("$fortune1 VS $fortune2")
    println(fortune1==fortune2)

    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}*/

/*fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 36) : String {
    return when {
        mood == "happy" && weather == "Sunny" && temperature >= 24 || temperature <= 34 -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}*/

/*fun main(args: Array<String>) {
    //println(whatShouldIDoToday("happy", "sunny"))
    //println(whatShouldIDoToday("sad"))
    //print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))

    val random1 = random()
    val random2 = {random()}

    println(random1)
    println(random2)

}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}*/
/*
fun main(args: Array<String>) {
    var fortune: String = ""
    repeat (10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}*/

fun main(){

}
