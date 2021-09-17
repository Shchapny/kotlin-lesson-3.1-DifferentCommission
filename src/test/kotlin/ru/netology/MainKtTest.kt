package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionMastercardAndMaestro_CheckForTheTestCI() {
        val testAmountDay = 4_000_00
        val testAmountMonth = 7_000_000

        val result = commissionMastercardAndMaestro(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Без комиссии", result)
    }

    @Test
    fun commissionMastercardAndMaestro() {
        val testAmountDay = 4_000_00
        val testAmountMonth = 7_000_000

        val result = commissionMastercardAndMaestro(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Без комиссии", result)
    }

    @Test
    fun commissionMastercardAndMaestro_CheckTheDay() {
        val testAmountDay = 16_000_000
        val testAmountMonth = 7_000_000

        val result = commissionMastercardAndMaestro(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Сумма превышает дневной лимит!", result)
    }

    @Test
    fun commissionMastercardAndMaestro_CheckTheMonth() {
        val testAmountDay = 4_000_000
        val testAmountMonth = 66_000_000

        val result = commissionMastercardAndMaestro(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Превышен лимит за месяц!", result)
    }

    @Test
    fun commissionVisaAndMir() {
        val testAmountDay = 4_000_00
        val testAmountMonth = 7_000_000

        val result = commissionVisaAndMir(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Комиссия 3000.0 коп.", result)
    }

    @Test
    fun commissionVisaAndMir_CheckTheDay() {
        val testAmountDay = 17_000_000
        val testAmountMonth = 7_000_000

        val result = commissionVisaAndMir(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Сумма превышает дневной лимит!", result)
    }

    @Test
    fun commissionVisaAndMir_CheckTheMonth() {
        val testAmountDay = 4_000_000
        val testAmountMonth = 68_000_000

        val result = commissionVisaAndMir(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Превышен лимит за месяц!", result)
    }

    @Test
    fun commissionVkPay() {
        val testAmountDay = 4_000_00
        val testAmountMonth = 7_000_000

        val result = commissionVkPay(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Превышен лимит за месяц", result)
    }

    @Test
    fun commissionVkPay_CheckTheMonth() {
        val testAmountDay = 4_00_00
        val testAmountMonth = 2_000_000

        val result = commissionVkPay(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Без комиссии", result)
    }

    @Test
    fun commissionVkPay_CheckTheDay() {
        val testAmountDay = 4_000_000
        val testAmountMonth = 2_000_000

        val result = commissionVkPay(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Сумма превышает дневной лимит!", result)
    }
}