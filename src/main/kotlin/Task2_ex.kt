fun main(){
    val numarray = Array(5) {IntArray(5)}
    println("Заполняем матрицу 5х5: ")
    for (row in 0..4) for (collum in 0..4){
            numarray[row][collum] = readln().toInt()
        }
    println("###########################")
    println("Полученная матрица: ")
    for (row in 0..4){
        for (collum in 0..4) {
            print(numarray[row][collum].toString() + "\t")
        }
        println()
    }
    for (row in 0 .. 4) {
        for (collum in 0.. 4)
            if (numarray[row][collum] != numarray[collum][row]){
                println("Матрица несеметрична!!")
                return
        }
    }
    println("Матрица симмитрична.")
}