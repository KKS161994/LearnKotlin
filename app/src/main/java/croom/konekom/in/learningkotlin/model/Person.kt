package croom.konekom.`in`.learningkotlin.model

class Person(name: String, weightLbs: Double){
    val name: String = name
    var weightLbs: Double = weightLbs
    var weightKilos: Double
        get() = weightLbs/2.2
        set(value) {
            weightLbs = value*2.2
        }

}