


class SetIntersector : ArrayIntersector<Any> {


    override fun intersect(first: Array<Any>, second: Array<Any>): Int {
        if(first.isEmpty() || second.isEmpty())
            return 0
        return first.toSet().intersect(second.toSet()).size
    }


}