package MyProjectForGitHub

class Arithmetic(_firstNumb: Int) {
    var firstNumb: Int = _firstNumb
    var numb: Float = 0F
    var secondNumb: Long = 0
    var numb1 = 0
    var numb2 = 0


    constructor(_firstNumb: Int, _numb2: Float) : this(_firstNumb){
        this.numb = _numb2

    }
    constructor(_firstNumb: Int, _secondNumb: Long) : this(_firstNumb){
        this.secondNumb = _secondNumb
    }
    constructor(_firstNumb: Int, _numb1: Int, _numb2: Int): this(_firstNumb){
        this.numb1 = _numb1
        this.numb2 = _numb2
    }
    fun timeConverter(){
        var time = intArrayOf()
        time += firstNumb / 86400
        firstNumb %= 86400
        time += firstNumb / 3600
        firstNumb %= 3600
        time += firstNumb / 60
        time += firstNumb % 60
        for (i in time.indices) {
            print(time[i])
            if (i == 3) break
            print(":")
        }
    }
    fun arithmeticProgression(){
        print(firstNumb)
        for (n in 1 until numb2) {
            firstNumb += numb1
            print(", $firstNumb")
        }
    }

    fun tetration() {
        if (firstNumb == 0)
            println(1)
        else {
            var nDop: Long
            val nConst = secondNumb
            for (n in 1 until firstNumb) {
                nDop = secondNumb
                secondNumb = nConst
                for (m in 1 until nDop)
                    secondNumb *= nConst
            }
            println (secondNumb)
        }
    }

    fun numFibonacci() {
        var f0 = 0
        var f1 = 1
        print(0)
        for (n in 1 until firstNumb) {
            f1 += f0
            f0 = f1 - f0
            print(" ,$f0")
        }
        println()
    }

    fun printDepositSum() {
        val timeN = when (firstNumb % 100) {
            1 -> "месяца"
            else -> "месяцев"
        }
        for (n in 1..firstNumb) numb += numb * 0.07F
        println("После $firstNumb $timeN сумма вклада составит $numb")
    }

    fun christmasTree(){
        for (n in 1..firstNumb) {
            var void = firstNumb-n-1
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

    fun trianglePaskal (){
        var height: Long
        var weight: Long
        var subtraction: Long
        var result: Long
        for (n in 1 until firstNumb)
            print ("  ")
        println (1)
        for (n in 1 until firstNumb) {
            for (m in 1 until firstNumb - n)
                print ("  ")
            print("1  ")
            for (m in 1 .. n) {
                height = n.toLong()
                weight = m.toLong()
                subtraction = height - weight
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
}