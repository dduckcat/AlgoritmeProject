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
            |
            |0. Вернуться в предыдущее меню
        """.trimMargin()
                            )
                            when (incorrectIntChoice(readLine()!!.toInt(), 5)) {
                                1 -> {
                                    while (true) {
                                        try {
                                            println("Введите срок вклада:")
                                            val depositSum = Arithmetic(readLine()!!.toInt())
                                            println("Введите сумму вклада")
                                            depositSum.numb = readLine()!!.toFloat()
                                            depositSum.printDepositSum()
                                        } catch (n: NumberFormatException) {
                                            println("Сумму и срок вклада нужно ввести целыми числами")
                                        } finally {
                                            askRepeat()
                                            if (readLine() == "0") break
                                        }
                                    }
                                }
                                2 -> {
                                    while (true) {
                                        try {
                                            println("Введите срок вклада:")
                                            val fibonacci = Arithmetic(readLine()!!.toInt())
                                            fibonacci.numFibonacci()
                                        } catch (n: NumberFormatException) {
                                            println("Длина последовательности должна быть в виде целого числа")
                                        } finally {
                                            askRepeat()
                                            if (readLine() == "0") break
                                        }
                                    }
                                }
                                3 -> {
                                    while (true) {
                                        try {
                                            println("Введите высоту елочки:")
                                            val tree = Arithmetic(readLine()!!.toInt())
                                            tree.christmasTree()
                                        } catch (n: NumberFormatException) {
                                            println("Высота должна быть в виде целого числа")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                4 -> {
                                    while (true) {
                                        try {
                                            println("Введите степень тетрации в виде целого числа:")
                                            val tetra = Arithmetic(readLine()!!.toInt())
                                            println("Введите целое число:")
                                            tetra.secondNumb = readLine()!!.toLong()
                                            tetra.tetration()
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
                                            val progression = Arithmetic(readLine()!!.toInt())
                                            println("Введите разность арифметической прогрессии:")
                                            progression.numb1 = readLine()!!.toInt()
                                            println("Введите длину последовательности:")
                                            progression.numb2 = readLine()!!.toInt()
                                            progression.arithmeticProgression()
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
                                            val heightPaskal = Arithmetic(readLine()!!.toInt())
                                            heightPaskal.trianglePaskal()
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
                |6. Вывести числа, делимые на некое число нацело
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
                                            val userStr = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            userStr.incorrectWord()
                                            userStr.palindrom()
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
                                            println("Введите количество секунд:")
                                            val timeOClock = Arithmetic(readLine()!!.toInt())
                                            timeOClock.timeConverter()
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
                                            val numbers = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            numbers.firstLastNumb()
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
                                            val number = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            number.sumOfDigits()
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
                                            val textUser = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            println("Введите символ, который хотите проверить")
                                            textUser.howManySymb(readLine()!![0])
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
                                            val numbers = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            println("Введите число - делитель")
                                            val divider = readLine()!!.toInt()
                                            numbers.divideOperation { it % divider }
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
                                            val numbers = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            numbers.uniqueNumbers()
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
                                            val text = ArrayClasses(readLine()!!.toCharArray().toTypedArray())
                                            text.wordOftenAndLonger()
                                        }catch (e: Exception){
                                            println("Программа принимает текст в нижнем регистре,с одним пробелом между словами, примитивными знаками препинания.")
                                        }
                                        askRepeat()
                                        if (readLine() == "0") break
                                    }
                                }
                                0 -> break
                            }
                        } catch (n: NumberFormatException) {
                            println("Нужно ввести число234")
                        } catch (e: Exception) {
                            println(e.message)
                        }
                    }
                }
                    0 -> break
                }
            } catch (n: NumberFormatException) {
                println("Нужно ввести число123")
            } catch (e: Exception) {
                println(e.message)
            }
    }
}



