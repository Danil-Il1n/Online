fun main() {
    agoToText(700)
}

fun agoToText(second: Int) {

    val minutesTextForm = second / 60
    val minutesText = when (minutesTextForm) {
        1 , 21 , 31 , 41 , 51 -> " минуту назад "
        2 , 3 , 4 , 22 , 23 , 24, 32 , 33 , 34 , 42 , 43 , 44 , 52 , 53 , 54 -> " минуты назад "
        else -> " минут назад"
    }

    val hoursTextForm = second / (60 * 60)
    val hoursText = when (hoursTextForm) {
        1 , 21 -> " час назад "
        2 , 3 , 4 , 22 , 23 , 24 -> " часа назад "
        else -> " часов назад "
    }

    val minutesDivider = 60
    val hoursDivider = minutesDivider * 60
    val day = hoursDivider * 24
    when {
        second >= 0 && second < 60 -> println("был(а) только что")
        second >= 60 && second < 60 * 60 -> println("был(а) " + second / minutesDivider + minutesText)
        second >= 60 * 60 && second <= day -> println("был(а) " + second / hoursDivider + hoursText)
        second >= day + 1 && second <= day * 2 -> println("был(а) вчера")
        second >= day * 2 && second < day * 3 -> println("был(а) позавчера")
        second >= day * 3 -> println("был(а) давно")
        else -> println("Вы ввели некорректное значение")
    }
}