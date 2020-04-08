import factory.RandomIntFactory

fun main() {
    val factory = RandomIntFactory()
    val first = factory.create()
    val second = factory.create()
    val intersector = LoopArrayIntersector()
    print(intersector.intersect(first as Array<Any>, second as Array<Any>))
}
