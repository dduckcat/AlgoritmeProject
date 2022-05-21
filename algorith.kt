package MyProjectForGitHub

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
fun heightComparison(h1: Float, h2: Float){
    fun validHeight(h:Float): Boolean = h in 120F..220F
    if (!validHeight(h1) && !validHeight(h2)){
        println("Некорректный рост")
        return
    }
    when {
        h1 > h2 -> println("Первый студент выше второго")
        h1 == h2 -> println("Эти студенты одного роста")
        else -> println("Второй студент выше первого")
    }
}