import factory.RandomIntFactory


class SetIntersectorTest {

    private val intersector = SetIntersector()

    @org.junit.Test
    fun `Intersect with one empty array`() {
        val factory = RandomIntFactory()
        val first = factory.create()
        val second = arrayOf<Any>()
        assert(intersector.intersect(first as Array<Any>, second) == 0)
    }

    @org.junit.Test
    fun `Intersect without intersected data`() {
        val factory = RandomIntFactory()
        val first = arrayOf<Any>(0, 5 ,3)
        val second = arrayOf<Any>(1, 6, 8)
        assert(intersector.intersect(first, second) == 0)
    }

    @org.junit.Test
    fun `Intersect with intersected data`() {
        val factory = RandomIntFactory()
        val first = arrayOf<Any>(0, 5 ,3, 8)
        val second = arrayOf<Any>(1, 6, 8)
        assert(intersector.intersect(first, second) == 1)
    }
}