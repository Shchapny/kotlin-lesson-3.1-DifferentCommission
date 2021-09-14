const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"
const val VK_PAY = "VK Pay"

const val MAX_AMOUNT_DAY = 15_000_000
const val MAX_AMOUNT_MONTH = 60_000_000
const val MAX_AMOUNT_DAY_VK_PAY = 1_500_000
const val MAX_AMOUNT_MONTH_VK_PAY = 4_000_000
const val MIN_AMOUNT_VISA_MIR = 3_500

fun main() {
    println(commission(MAESTRO, 4_000_00, 7_000_000))
}

fun commissionMastercardAndMaestro(amountDay: Long, amountMonth: Long): String {
    val sum = ((amountDay / 100 * 0.6) + 2_000)
    return when {
        amountDay in 30_000..7_500_00 -> "Без комиссии"
        amountDay >= MAX_AMOUNT_DAY -> "Сумма превышает дневной лимит!"
        amountMonth >= MAX_AMOUNT_MONTH -> "Превышен лимит за месяц!"
        else -> "Комиссия $sum коп."
    }
}

fun commissionVisaAndMir(amountDay: Long, amountMonth: Long): String {
    val sum = (amountDay / 100 * 0.75)
    return when {
        amountDay <= MIN_AMOUNT_VISA_MIR -> "Комиссия 35 руб."
        amountDay >= MAX_AMOUNT_DAY -> "Сумма превышает дневной лимит!"
        amountMonth >= MAX_AMOUNT_MONTH -> "Превышен лимит за месяц!"
        else -> "Комиссия $sum коп."
    }
}

fun commissionVkPay(amountDay: Long, amountMonth: Long): String {
    return when {
        amountDay >= MAX_AMOUNT_DAY_VK_PAY -> "Сумма превышает дневной лимит!"
        amountMonth >= MAX_AMOUNT_MONTH_VK_PAY -> "Превышен лимит за месяц"
        else -> "Без комиссии"
    }
}

fun commission(bankCard: String = VK_PAY, amountDay: Long, amountMonth: Long = 0): String {
    return when (bankCard) {
        MASTERCARD -> commissionMastercardAndMaestro(amountDay, amountMonth)
        MAESTRO -> commissionMastercardAndMaestro(amountDay, amountMonth)
        VISA -> commissionVisaAndMir(amountDay, amountMonth)
        MIR -> commissionVisaAndMir(amountDay, amountMonth)
        else -> commissionVkPay(amountDay, amountMonth)
    }
}