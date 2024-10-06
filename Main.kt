//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Введите начальный номер билета (N):")
    val n = readLine()!!.toInt()

    println("Введите конечный номер билета (M):")
    val m = readLine()!!.toInt()

    var happyTicketCount = 0

    for (i in n..m) {
        if (isHappyTicket(i)) {
            happyTicketCount++
        }
    }

    println("Количество счастливых билетов: $happyTicketCount")
}

fun isHappyTicket(ticketNumber: Int): Boolean {
    val ticketString = ticketNumber.toString().padStart(6, '0') // дполнение свободных ячеек нулями
    val firstHalf = ticketString.substring(0, 3).toInt()
    val secondHalf = ticketString.substring(3, 6).toInt()
    return firstHalf == secondHalf
}