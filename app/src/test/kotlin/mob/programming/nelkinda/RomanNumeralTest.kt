/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package mob.programming.nelkinda

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.row
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class RomanNumeralTest: FunSpec() {

    init {

        context("Roman numerals") {
            withData(
                row("I", 1),
                row("II", 2),
            ) { (numeral, expectedValue) ->
                RomanNumeral(numeral).toInt() shouldBe expectedValue
            }
        }

        test("Roman numeral 'IV' equals 4"){
            RomanNumeral("IV").toInt() shouldBe 4
        }

        test("Roman numeral 'V' equals 5") {
            RomanNumeral("V").toInt() shouldBe 5
        }

        context("Roman numerals") {
            withData(
                row("VI", 6),
                row("VII", 7),
            ) { (numeral, expectedValue) ->
                RomanNumeral(numeral).toInt() shouldBe expectedValue
            }
        }

        test("Roman numeral 'IX' equals 9") {
            RomanNumeral("IX").toInt() shouldBe 9
        }

        test("Roman numeral 'X' equals 10") {
            RomanNumeral("X").toInt() shouldBe 10
        }

    }
}
