import java.lang.IndexOutOfBoundsException

fun main(){
    print("Введите первый массив: ")
    var first = readln().split(",").toMutableList()
    print("Введите второй массив: ")
    var second = readln().split(",").toMutableList()
    val outpoot: ArrayList<String> = arrayListOf()

    println("Введённые массивы:")
    println(first)
    println(second)

    if (first.size > second.size) {
        val swap = first
        first = second
        second = swap
    }
    var num = 0
    while (true){
        try {
            if (first[num] in second) {
                outpoot.add(first[num])
                second.remove(first[num])
                first.removeAt(num)
                num = 0
            }
            num++
        }
        catch (e: IndexOutOfBoundsException) {
            if (first[0] in second)
                outpoot.add(first[0])
            break
        }
    }
    println("###################################")
    println("Пересечение введённых массивов")
    println(outpoot)
}
