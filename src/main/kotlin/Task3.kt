fun main() {
    val alphabet = listOf('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я')
    var shiftedAlphabet = mutableListOf<Char>()
    val incoutput = StringBuilder()
    val decoutput = StringBuilder()


    print("Введите строку для шифровки/дешифровки: ")
    val input = readlnOrNull()?.uppercase() ?: ""
    print("Введите ключевое слово: ")
    val keyword = readlnOrNull()?.uppercase() ?: ""

    //Формирование шифра
    for (i in keyword.indices) {
        val charIndex = keyword[i].code - 1040
        val shiftedChars = alphabet.drop(charIndex) + alphabet.take(charIndex)
        shiftedAlphabet = mutableListOf()
        shiftedAlphabet.addAll(shiftedChars)
    }

    //шифровка сообщения по ключевому слову.
    for (i in input.indices) {
        val inputChar = input[i]
        val index = alphabet.indexOf(inputChar)
        if (index >= 0) {
            val outputChar = shiftedAlphabet[index]
            incoutput.append(outputChar)
        } else {
            incoutput.append(inputChar)
        }
    }
    //Дешифровка ранее зашифрованного сообщения по ключевому слову.
    for (i in incoutput.indices) {
        val inputChar = incoutput[i]
        val index = shiftedAlphabet.indexOf(inputChar)
        if (index >= 0) {
            val outputChar = alphabet[index]
            decoutput.append(outputChar)
        } else {
            decoutput.append(inputChar)
        }
    }

    println(incoutput)
    println(decoutput)
}
