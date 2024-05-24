interface Queue<T>{
    fun enQueue(element: T)
    fun deQueue():T?

    val count:Int
        get
    val isEmpty:Boolean
        get()= count ==0

    fun peak():T?
}

class ArrayListQueue<T>: Queue<T>{
    private val list = arrayListOf<T>()
    override fun enQueue(element: T) {
        list.add(element)
    }

    override fun deQueue(): T? {
        if(isEmpty)return null
        return list.removeAt(0)
    }

    override val count: Int
        get() = list.size

    override fun peak(): T? {
        return list.getOrNull(0)
    }

    override fun toString(): String = list.toString()

}
fun main(){
    val listQueue : Queue<String> = ArrayListQueue()
    listQueue.enQueue("1")
    listQueue.enQueue("2")
    listQueue.enQueue("3")
    listQueue.enQueue("4")
    listQueue.enQueue("5")

    print("Enter the choice \n 1. Enqueue \n 2. Dequeue \n 3. Peak \n 4. Size \n 5. Exit")
    println(listQueue.toString())
    while(true){
        var input= readLine()?.toIntOrNull()
        when(input) {
            1 -> {
                print("Enter the string to Enqueue: ")
                val input = readLine()
                if (input != null) {
                    listQueue.enQueue(input)
                }
                println(listQueue.toString())

            }

            2 -> {
                println(listQueue.deQueue())
                println(listQueue.toString())

            }

            3 -> {
                println(listQueue.peak())
                println(listQueue.toString())

            }

            4 -> {
                println(listQueue.count)
                println(listQueue.toString())

            }

            5 -> {
                return
            }

            else -> {
                println("enter the valid input")
            }
        }

    }
}