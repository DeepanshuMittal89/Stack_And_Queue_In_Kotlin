interface Stack<T> {
    fun push(item: T)
    fun pop(): T?
    fun top(): T?
    fun isEmpty(): Boolean
    fun size(): Int
}

class ArrayListStack<T> : Stack<T> {
    private val items: MutableList<T> = mutableListOf()

    override fun push(item: T) {
        items.add(item)
    }

    override fun pop(): T? {
        if (isEmpty()) return null
        return items.removeAt(items.size - 1)
    }

    override fun top(): T? {
        if (isEmpty()) return null
        return items.last()
    }

    override fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    override fun size(): Int {
        return items.size
    }
    override fun toString(): String {
        return items.joinToString(", ", "[", "]")
    }
}

fun main() {
    val stringStack: Stack<String> = ArrayListStack()

    stringStack.push("String 1")
    stringStack.push("String 2")
    stringStack.push("String 3")
    stringStack.push("String 4")
    stringStack.push("String 5")

    print("Enter the choice \n 1. Push \n 2. Pop \n 3. top \n 4. size \n 5. Exit")
    println(stringStack.toString())
    while(true){
        var input= readLine()?.toIntOrNull()
        when(input) {
            1 -> {
                print("Enter the string to push: ")
                val input = readLine()
                if (input != null) {
                    stringStack.push(input)
                }
                println(stringStack.toString())

            }

            2 -> {
                println(stringStack.pop())
                println(stringStack.toString())

            }

            3 -> {
                println(stringStack.top())
                println(stringStack.toString())

            }

            4 -> {
                println(stringStack.size())
                println(stringStack.toString())

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
