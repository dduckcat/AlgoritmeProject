package MyProjectForGitHub
 
fun main() {
    val askRepeat: ()->Unit = {println(
        """
            |
            | Введите любой символ, чтобы повторить
            | 0. Вернуться в предыдущее меню
           """.trimMargin()
    )}

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
            |7. Сравнить рост двух студентов
            |
            |0. Вернуться в предыдущее меню
        """.trimMargin()
                            )
                            when (incorrectIntChoice(readLine()!!.toInt(), 6)) {
                                1 -> {
                                    while (true) {
                                        try{
                                            println("Введите сумму вклада:")
                                            val sum = readLine()!!.toInt()
                                            println("Введите срок вклада в месяцах:")
                                            val period = readLine()!!.toInt()
                                            depositSum(
                                                time = period,
                                                sumUser = sum
                                            )
                                        }catch (n: NumberFormatException){
                                            println("Сумму и срок вклада нужно ввести целыми числами")
                                        }finally {
                                            askRepeat()
                                            if (readLine() == "0") break
                                        }
                                    }
                                }
                                2 -> {
                                    blockWithOneParam(
                                        text = "Введите желаемую длину последовательности чисел Фиббоначи:",
                                        func = ::numFibonacci,
                                        text1 = "Длина последовательности должна быть в виде целого числа"
                                    )
                                }
                                3 -> {
                                    blockWithOneParam(
                                        text = "Введите высоту елочки",
                                        func = ::christmasTree,
                                        text1 = "Высота должна быть в виде целого числа"
                                    )
                                }
                                4 -> {
                                    while (true) {
                                        try {
                                            println("Введите целое число:")
                                            val userNumb = readLine()!!.toInt()
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
                                    blockWithOneParam(
                                        text = "Введите необходимую высоту треугольника Паскаля:",
                                        func = ::trianglePaskal,
                                        text1 = "Высота треугольника Паскаля должна быть в виде целого числа"
                                    )
                                }
                                7 -> {
                                    while (true) {
                                        try {
                                            println("Введите рост первого студента")
                                            val height1 = readLine()!!.toFloat()
                                            println("Введите рост второго студента")
                                            val height2 = readLine()!!.toFloat()
                                            heightComparison(
                                                h1 = height1,
                                                h2 = height2
                                            )
                                        }catch (n: NumberFormatException){
                                        println("Некорректный ввод. Нужно ввести в виде чисел")
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
                                    blockWithOneParam(
                                        text = "Введите количество секунд: ",
                                        func = ::timeConverter,
                                        text1 = "Количество секунд должно быть в виде целого числа"
                                    )
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
                                            val numbers = convertToIntArray(readLine()!!.toCharArray().toTypedArray()).toIntArray()
                                            println("Введите число - делитель")
                                            val divider = readLine()!!.toInt()
                                            divideOperation(*numbers){it % divider}
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

