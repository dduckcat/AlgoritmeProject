package MyProjectForGitHub


fun incorrectWord(word:Array<Char>):Array<Char>{
    if (' ' in word) throw Exception ("Введите одно слово без пробелов")
    return word
}
fun incorrectIntChoice(choice: Int, max: Int):Int{
    if (choice !in 0..max) throw Exception ("Введите число из предложенного меню")
    return choice
}
fun convertToStringArray(text: Array<Char>): Array<String>{
    var void = 1
    for ((indexI,i) in text.withIndex()) {
        if (indexI == text.size-1) continue
        if (i == ' ' && text[indexI+1] != ' ')
            void++
    }
    var indexStr = 0
    val textStr = Array(void) {""}
    for (i in text.indices){
        if (i == text.size-1) continue
        if (text[i] == ' ' && text[i+1] != ' '){
            indexStr++
            continue
        }
        if ((text[i] == '.') or (text[i] == '!') or (text[i] == ',') or (text[i] == ':') or (text[i] == ';') or (text[i] == '?') or (text[i] == '"') or (text[i] ==' '))
            continue
        textStr[indexStr] += text[i].toString()
    }
    return textStr
}
fun wordOftenAndLonger(textUser: Array<String>){
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
fun uniqueNumbers(numbers: Array<Int>){
    var i = 0
    for (m in numbers){
        if (i > 1) break
        i = 0
        for (n in numbers){
            if (m == n){
                i++
                if (i > 1) break
            }
        }
    }
    if (i > 1) println("В последовательности есть неуникальные числа")
    else println("Все числа в последовательности уникальны")
}
inline fun divideOperation(vararg number: Int, div: (Int)->Int) {
    for (i in number){
        when (div(i)){
            0 -> print("$i ")
        }
    }
}
fun convertToIntArray(numbersChar: Array<Char>): Array<Int>{
    var numbersInt: Array<Int> = arrayOf()
    var numbString = ""
    for (i in numbersChar.indices){
        if (numbersChar[i] == ','){
            numbersInt += numbString.toInt()
            numbString = ""
            continue
        }
        numbString += numbersChar[i].toString()
        if (i == numbersChar.size-1)
            numbersInt += numbString.toInt()
    }
    return numbersInt
}
fun firstAndLastNumber (numbers: Array<Int>){
    var numbersRev: Array<Int> = arrayOf()
    for (i in numbers)
        numbersRev += i
    personalReverse(numbersRev)
    println("Первый элемент: ${numbers[0]}, последний элемент: ${numbersRev[0]}")
}
fun howManySymb (text: CharArray, symb: Char){
    var result = 0
    for (i in text)
        if (i == symb) result++
    println("Символ '$symb' встречается в тексте $result раз")
}
fun sumOfDigits (numbers: CharArray){
    var num2 = intArrayOf()
    var result = 0
    for (i in numbers)
        num2 += i.digitToInt()
    for (j in num2)
        result += j
    println(result)
}
fun timeConverter (secUser: Int){
    var sec = secUser
    var time = intArrayOf()
    time += sec / 86400
    sec %= 86400
    time += sec / 3600
    sec %= 3600
    time += sec / 60
    time += sec % 60
    for (i in time.indices) {
        print(time[i])
        if (i == 3) break
        print(":")
    }
}
fun palindrom (userStr: Array<Char>){
    var revStr = charArrayOf().toTypedArray()
    for (i in userStr)
        revStr += i
    for (i in revStr.indices){
        if (i < revStr.size/2) {
            val m = revStr[i]
            revStr[i] = revStr[revStr.size - 1 - i]
            revStr[revStr.size - 1 - i] = m
        }
    }
    if (userStr.contentEquals(revStr)) println("$userStr является палиндромом")
    else println("$userStr не является палиндромом")
}