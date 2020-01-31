fun main(){
    Outer().sum()
}

class Outer{

    fun sum(){
        val sum = Nested().x + Nested().y
        println("Sum : #$sum")
    }

    class Nested{
        val x = 15
        val y = 25
    }
}