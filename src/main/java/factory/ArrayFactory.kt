package factory

interface ArrayFactory<T> {

    fun create(): Array<T>
}