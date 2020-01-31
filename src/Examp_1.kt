fun main(){
    val car = Car()
    car.carNameAndColor()
    car.carMaxSpeed()
}

interface CarParameters{
    val name: String
    val color: String
    val maxSpeed: Int

    fun carMaxSpeed()

    fun carNameAndColor(){
        println("Car name : #$name and color : #$color")
    }
}

class Car: CarParameters{
    override var name = "Chevrolet Captiva"

    override var color = "Black"

    override var maxSpeed = 240

    override fun carMaxSpeed() {
        println("Chevrolet Captiva max speed : #$maxSpeed")
    }
}