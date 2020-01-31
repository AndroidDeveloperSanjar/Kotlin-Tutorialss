fun main(){
    Outer3().Inner().sum()
}

class Outer3{
    val a = 35
    val b = 45
    inner class Inner{
        val sum = a + b
        fun sum(){
            println("Sum : #$sum")
        }
    }
}