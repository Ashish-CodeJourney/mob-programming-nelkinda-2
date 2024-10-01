/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package mob.programming.nelkinda

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RomanNumeralTest: FunSpec() {

    init {
        test("Roman numeral 'I' equals 1") {
            RomanNumeral("I").toInt() shouldBe 1
        }

        test("Roman numeral 'II' equals 2") {
            RomanNumeral("II").toInt() shouldBe 2
        }
    }
}
