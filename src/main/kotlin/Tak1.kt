fun main() {
    println("Введите кол-во строк: ")
    val rows: Int = readln().toInt()
    println("Введите кол-во столбцов: ")
    val collums: Int = readln().toInt()
    val array = Array(rows) { _ ->
        Array(collums) { _ -> readln() }
    }

    val digits = CharArray(10)
    var count = 0

    for (row in array){
        for (num in row) {
            for (ch in num) {
                if (ch !in digits) {
                    digits[count] = ch
                    count++
                }
            }
        }
    }
    println("##############################")
    for (row in array){
        for (num in row) {
            print(num + "\t")
        }
        println()
    }
    println("Кол-во исспользуемых цифр: $count")
}