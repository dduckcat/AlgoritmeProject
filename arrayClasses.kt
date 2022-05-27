package MyProjectForGitHub

class ArrayClasses(var userArray: Array<Char>) {

    fun wordOftenAndLonger(){
        val textUser = convertToStringArray(userArray)
        var lot1: Int
        var lotOften = 0
        var wordOften = ""
        var wordLonger = ""
        for (i in textUser) {
            lot1 = 0
            for (n in textUser) {
                if (i == n) lot1++
                if (lot1 > lotOften) {
                    lotOften = lot1
                    wordOften = i
                }
            }
            if (wordLonger.toCharArray().size < i.toCharArray().size) wordLonger = i
        }
        println ("""Самое часто повторяющееся слово: $wordOften
        |Самое длинное слово: $wordLonger
    """.trimMargin())
    }

    fun uniqueNumbers() {
        val numbers = convertToIntArray(userArray)
        var i = 0
        for (m in numbers) {
            if (i > 1) break
            i = 0
            for (n in numbers) {
                if (m == n) {
                    i++
                    if (i > 1) break
                }
            }
        }
        if (i > 1) println("В последовательности есть неуникальные числа")
        else println("Все числа в последовательности уникальны")
    }

    inline fun divideOperation(div: (Int)->Int) {
        val numbers = convertToIntArray(userArray)
        for (i in numbers){
            when (div(i)){
                0 -> print("$i ")
            }
        }
    }

    fun howManySymb (symb: Char){
        var result = 0
        for (i in userArray)
            if (i == symb) result++
        println("Символ '$symb' встречается в тексте $result раз")
    }

    fun sumOfDigits (){
        var num2 = intArrayOf().toTypedArray()
        var result = 0
        for (i in userArray)
            num2 += i.digitToInt()
        for (j in num2)
            result += j
        println("Сумма цифр числа равна $result")
    }
    fun incorrectWord(): Array<Char> {
        if (' ' in userArray) throw Exception("Введите одно слово без пробелов")
        return userArray
    }

    fun firstLastNumb(){
        val numbers = convertToIntArray(userArray)
        var numbersRev: Array<Int> = arrayOf()
        for (i in numbers)
            numbersRev += i
        personalReverse(numbersRev)
        println("Первый элемент: ${numbers[0]}, последний элемент: ${numbersRev[0]}")
    }

    fun palindrom(){
        var revStr = charArrayOf().toTypedArray()
        for (i in userArray)
            revStr += i
        for (i in revStr.indices){
            if (i < revStr.size/2) {
                val m = revStr[i]
                revStr[i] = revStr[revStr.size - 1 - i]
                revStr[revStr.size - 1 - i] = m
            }
        }
        if (userArray.contentEquals(revStr)) println("Слово является палиндромом")
        else println("Слово не является палиндромом")
    }
}