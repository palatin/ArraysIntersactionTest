import factory.RandomIntFactory
import org.junit.Assert.*

class LoopArrayIntersectorTest {


    private val intersector = LoopArrayIntersector()

    @org.junit.Test
    fun `Intersect with one empty array`() {
        val factory = RandomIntFactory()
        val first = factory.create()
        val second = arrayOf<Int>()
        assert(intersector.intersect(first as Array<Any>, second as Array<Any>) == 0)
    }

    @org.junit.Test
    fun `Intersect without intersected data`() {
        val factory = RandomIntFactory()
        val first = arrayOf<Int>(0, 5 ,3)
        val second = arrayOf<Int>(1, 6, 8)
        assert(intersector.intersect(first as Array<Any>, second as Array<Any>) == 0)
    }

    @org.junit.Test
    fun `Intersect with intersected data`() {
        val factory = RandomIntFactory()
        val first = arrayOf<Int>(0, 5 ,3, 8)
        val second = arrayOf<Int>(1, 6, 8)
        assert(intersector.intersect(first as Array<Any>, second as Array<Any>) == 1)
    }
}