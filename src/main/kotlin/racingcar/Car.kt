package racingcar

class Car(val name: String) {

    private var position: Int = 0

    fun moving(num: Int) {
        if (num >= 4) position++
    }
}