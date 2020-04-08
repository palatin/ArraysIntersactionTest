


class BinarySearchIntersector : ArrayIntersector<Number> {


    override fun intersect(first: Array<Number>, second: Array<Number>): Int {
        if(first.isEmpty() || second.isEmpty())
            return 0
        first.sort()
        val visited = HashSet<Any>()
        var count = 0
        second.forEach {
            if(!visited.contains(it)) {
                visited.add(it)
                if(first.binarySearch(it) > 0)
                    count++
            }
        }
        return count
    }


}