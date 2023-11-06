fun main() {
    val sorted_words: MutableMap<String, ArrayList<String>> = mutableMapOf()

    print("Введите слова через запятую: ")
    val input = readln().split(",")

    for (word in input) {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (sortedWord !in sorted_words.keys){
            sorted_words[sortedWord] = arrayListOf(word)
        }
        else sorted_words[sortedWord]?.add(word)
    }
    for (item in sorted_words.values){
        for (word in item) print(word + "\t")
        println()
    }

}