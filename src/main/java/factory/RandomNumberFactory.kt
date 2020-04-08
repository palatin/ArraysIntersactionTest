package factory

import kotlin.random.Random

class RandomIntFactory : ArrayFactory<Int> {


    override fun create(): Array<Int> {
        return Array<Int>(Random.nextInt(1, 100000)) {
            Random.nextInt()
        }
    }

}