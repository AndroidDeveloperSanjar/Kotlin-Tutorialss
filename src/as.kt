fun main() {
    val pair = Pair(0, "Sanjar","Bukhara")

   val (id, name, region) = pair

    println("id = $id, name = $name, region = $region")

}

class Pair<ID, NAME, REGION>(
    private val id: ID,
    private val name: NAME,
    private val region: REGION
) {
    operator fun component1(): ID {
        return id
    }

    operator fun component2(): NAME {
        return name
    }

    operator fun component3(): REGION{
        return region
    }
}