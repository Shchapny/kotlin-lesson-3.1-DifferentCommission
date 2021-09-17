package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionMastercardAndMaestro_CheckForTheTestCI() {
        val testAmountDay = 4_000_00
        val testAmountMonth = 7_000_000

        val result = ru.netology.commissionMastercardAndMaestro(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Без комиссии", result)
    }

    @Test
    fun commissionMastercardAndMaestro() {
        val testAmountDay = 4_000_00
        val testAmountMonth = 7_000_000

        val result = ru.netology.commissionMastercardAndMaestro(
            amountDay = testAmountDay.toLong(),
            amountMonth = testAmountMonth.toLong()
        )

        assertEquals("Без комиссии", result)
    }

}