package MyProjectForGitHub
 
fun main() {
    println(
        """
        |
        |Привет! Выбери тип операции, которую хочешь выполнить:""".trimMargin()
    )
    while (true) {
        try {
            println(
                """
            |
            |1. Математические модели
            |2. Работа с массивами
            |
            |0. Завершить программу
        """.trimMargin()
            )
            when (incorrectIntChoice(readLine()!!.toInt(), 2)) {
                1 -> {
                    println("Введи номер операции, которую хочешь выполнить:")
                    while (true) {
                        try {
                            println(
                                """
            |
            |1. Посчитать сумму вклада
            |2. Числа Фиббоначи
            |3. Нарисовать ёлочку из чисел
            |4. Тетрация
            |5. Арифметическая прогрессия
            |6. Треугольник Паскаля
            |
            |0. Вернуться в предыдущее меню
        """.trimMargin()
                            )
                            when (incorrectIntChoice(readLine()!!.toInt(), 6)) {
                                1 -> {
                                    while (true) {
                                        try{
                                            println("Введите сумму вклада:")
                                            val sum = readLine()!!.toFloat()
                                            println("Введите срок вклада в месяцах:")
                                            val period = readLine()!!.toInt()
                                            depositSum(sum, period)
                                        }catch (n: NumberFormatException){
                                            println("Сумму и срок вклада нужно ввести целыми числами")
                                        }finally {
                                            askRepeat()
                                            if (readLine() == "0") break
                                        }
                                    }
                                }
                                2 -> {
                                    while (true) {
                                        try {
                                            println("Введите желаемую длину последовательности чисел Фиббоначи:")
                                            numFibonacci(readLine()!!.toInt())
                                        }catch (n: NumberFormatException) {
                                            println("Длина последовательности должна быть в виде целого числа")
                                        }finally {
                                            askRepeat()
                                            if (readLine() == "0") break
                                        }
                                    }
                                }
                                3 -> {
                                    while (true) {
                                        try {
                                            println("Введите высоту ёлочки:")
                                            christmasTree(readLine()!!.toInt())
                                        }catch (n: NumberFormatException){
                                            println("Высота должна быть в виде целого числа")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                4 -> {
                                    while (true) {
                                        try {
                                            println("Введите целое число:")
                                            val userNumb = readLine()!!.toLong()
                                            println("Введите степень тетрации в виде целого числа:")
                                            val degree = readLine()!!.toInt()
                                            tetration(userNumb, degree)
                                        }catch (n: NumberFormatException){
                                            println("Число и степень тетрации должны быть в виде целых чисел")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                5 -> {
                                    while (true) {
                                        try {
                                            println("Введите число, с которого начнется последовательность:")
                                            val userNum = readLine()!!.toInt()
                                            println("Введите разность арифметической прогрессии:")
                                            val differenceProgress = readLine()!!.toInt()
                                            println("Введите длину последовательности:")
                                            val memberNum = readLine()!!.toInt()
                                            arithmeticProgression(userNum, differenceProgress, memberNum)
                                        }catch (n: NumberFormatException){
                                            println("Все данные должны быть в виде целых чисел")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                6 -> {
                                    while (true) {
                                        try {
                                            println("Введите необходимую высоту треугольника Паскаля:")
                                            trianglePaskal(readLine()!!.toLong())
                                        }catch (n: NumberFormatException){
                                            println("Высота треугольника Паскаля должна быть в виде целого числа")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                0 -> break
                            }
                        } catch (i: NumberFormatException) {
                            println("Нужно ввести число")
                        } catch (e: Exception) {
                            println(e.message)
                        }
                    }
                }
                2 -> {
                    println("Введи номер операции, которую хочешь выполнить:")
                    while (true) {
                        try {
                            println(
                                """
                |
                |1. Проверить слово или число на палиндром
                |2. Конвертер времени
                |3. Вывести первое и последнее число последовательности
                |4. Сложить цифры целого числа
                |5. Сколько раз встречается символ в тексте
                |6. Вывести числа, делимые на 15 нацело
                |7. Проверить все ли числа последовательности уникальны
                |8. Вывести самое частое и самое длинное слово из текста
                |
                |0. Вернуться в предыдущее меню
                    """.trimMargin()
                            )
                            when (incorrectIntChoice(readLine()!!.toInt(), 8)) {
                                1 -> {
                                    while (true) {
                                        try {
                                            println("Введи слово или число")
                                            palindrom(incorrectWord(readLine()!!.toCharArray()))
                                        }catch (e: Exception){
                                            println(e.message)
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                2 -> {
                                    while (true) {
                                        try {
                                            println("Введите количество секунд: ")
                                            timeConverter(readLine()!!.toInt())
                                        }catch (n: NumberFormatException){
                                            println("Количество секунд должно быть в виде целого числа")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                3 -> {
                                    while (true) {
                                        try {
                                            println("Введите последовательность чисел через запятую:")
                                            firstAndLastNumber(
                                                convertToIntArray(
                                                    readLine()!!.toCharArray().toTypedArray()
                                                )
                                            )
                                        }catch (n: NumberFormatException){
                                            println("Нужно было ввести последовательность чисел через запятую без лишних символов")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                4 -> {
                                    while (true) {
                                        try {
                                            println("Введите целое число")
                                            sumOfDigits(readLine()!!.toCharArray())
                                        }catch (i: IllegalArgumentException){
                                            println("Нужно вводить одно целое число без пробелов и различных знаков препинания")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                5 -> {
                                    while (true) {
                                        try {
                                            println("Введите текст")
                                            val textUser = readLine()!!.toCharArray()
                                            println("Введите символ, который хотите проверить")
                                            val symbUser = readLine()!![0]
                                            howManySymb(textUser, symbUser)
                                        }catch (s: StringIndexOutOfBoundsException){
                                            println("Надо было ввести текст")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                6 -> {
                                    while (true) {
                                        try {
                                            println("Введите последовательность чисел через запятую")
                                            divide15(convertToIntArray(readLine()!!.toCharArray().toTypedArray()))
                                        }catch (n: NumberFormatException) {
                                            println("Нужно было ввести последовательность чисел через запятую без лишних символов")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                7 -> {
                                    while (true) {
                                        try {
                                            println("Введите последовательность чисел через запятую")
                                            uniqueNumbers(convertToIntArray(readLine()!!.toCharArray().toTypedArray()))
                                        }catch (n: NumberFormatException) {
                                            println("Нужно было ввести последовательность чисел через запятую без лишних символов")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                8 -> {
                                    while (true) {
                                        try {
                                            println("Введите текст в нижнем регистре")
                                            wordOftenAndLonger(
                                                convertToStringArray(
                                                    readLine()!!.toCharArray().toTypedArray()
                                                )
                                            )
                                        }catch (e: Exception){
                                            println("Программа принимает текст в нижнем регистре,с одним пробелом между словами, примитивными знаками препинания.")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                0 -> break
                            }
                        } catch (n: NumberFormatException){
                            println("Нужно ввести число")
                        } catch (e: Exception) {
                            println(e.message)
                        }
                    }
                }
                    0 -> break
                }
            } catch (n: NumberFormatException) {
                println("Нужно ввести число")
            } catch (e: Exception) {
                println(e.message)
            }
    }
}

fun incorrectWord(word:CharArray):CharArray{
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
fun divide15(numbers: Array<Int>) {
    for (i in numbers)
        if (i % 15 == 0) print("$i\t")
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
fun palindrom (userStr: CharArray){
    var revStr = charArrayOf()
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
fun trianglePaskal (heightUser: Long){
    var height: Long
    var weight: Long
    var subtraction: Long
    var result: Long
    for (n in 1 until heightUser)
        print ("  ")
    println (1)
    for (n in 1 until heightUser) {
        for (m in 1 until heightUser - n)
            print ("  ")
        print("1  ")
        for (m in 1 .. n) {
            height = n
            weight = m
            subtraction = n - m
            for (f in 1 until height)
                height *= f
            for (f in 1 until weight)
                weight *= f
            when (subtraction) {
                0L -> subtraction = 1
                else -> {
                    for (f in 1 until subtraction)
                        subtraction *= f
                }
            }
            result = height / (weight * subtraction)
            print ("$result  ")
        }
        println()
    }
}
fun arithmeticProgression (startNum: Int, differenceProgress: Int, memberNum: Int){
    var userNum = startNum
    print(userNum)
    for (n in 1 until memberNum) {
        userNum += differenceProgress
        print(", $userNum")
    }
}
fun tetration (nUser: Long, nGrade: Int){
    var nFinal = nUser
    if (nGrade == 0)
        println(1)
    else {
        var nDop: Long
        val nConst = nFinal
        for (n in 1 until nGrade) {
            nDop = nFinal
            nFinal = nConst
            for (m in 1 until nDop)
                nFinal *= nConst
        }
        println (nFinal)
    }
}
fun christmasTree (heightTree: Int){
    for (n in 1..heightTree) {
        var void = heightTree-n-1
        for (m in 1..n) {
            while (void >= 0){
                print (" ")
                void--
            }
            if (n < 10) print("$n ")
            else print(n)
        }
        println()
    }
}
fun personalReverse (numbers: Array<Int>): Array<Int> {
    for (i in numbers.indices) {
        if (i < numbers.size / 2) {
            val m = numbers[i]
            numbers[i] = numbers[numbers.size - 1 - i]
            numbers[numbers.size - 1 - i] = m
        }
    }
    return numbers
}
fun numFibonacci(a: Int){
    var f0 = 0
    var f1 = 1
    print (0)
    for (n in 1 until a){
        f1 += f0
        f0 = f1 - f0
        print (" ,$f0")
    }
    println()
}
fun depositSum(sumUser: Float, time: Int) {
    var sum = sumUser
    val timeN = when (time % 100){
        1 -> "месяца"
        else -> "месяцев"
    }
    for (n in 1..time) sum += sum * 0.07F
    println("После $time $timeN сумма вклада составит $sum")
}
fun askRepeat(){
    println(
        """
            |
            | Введите любой символ, чтобы повторить
            | 0. Вернуться в предыдущее меню
           """.trimMargin()
    )
}