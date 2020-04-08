



class LoopArrayIntersector : ArrayIntersector<Any> {


    override fun intersect(first: Array<Any>, second: Array<Any>): Int {
        if(first.isEmpty() || second.isEmpty())
            return 0
        //use data class for destructive syntax
        val (smallerArray, biggerArray) = if(first.size < second.size) Data(first, second) else Data(second, first)
        val visited = HashSet<Any>(smallerArray.size)
        var intersect = 0
        smallerArray.forEach {
            if(!visited.contains(it)) {
                visited.add(it)
                for (i in biggerArray.indices) {
                    if(biggerArray[i] == it) {
                        intersect++
                        break
                    }
                }
            }
        }
        return intersect
    }

    data class Data(val smallerArray: Array<Any>, val biggerArray: Array<Any>)
}