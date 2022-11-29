package ir.dariaos.calculator.ui.main.helper

import org.junit.Assert.assertEquals
import org.junit.Test

class HandleButtonClickTest {

    @Test
    fun testHandleBinaryOperatorClick() {
        assertEquals("", handleClick("", "+", cursorPosition = cursorPosition))
        assertEquals("5+", handleClick("5", "+", cursorPosition = cursorPosition))
        assertEquals("5!+", handleClick("5!", "+", cursorPosition = cursorPosition))
        assertEquals("5+4)+", handleClick("5+4)", "+", cursorPosition = cursorPosition))
        assertEquals("5.0+", handleClick("5.", "+", cursorPosition = cursorPosition))
        assertEquals("5+", handleClick("5-", "+", cursorPosition = cursorPosition))
        assertEquals("-", handleClick("-", "+", cursorPosition = cursorPosition))
        assertEquals("(-", handleClick("(-", "+", cursorPosition = cursorPosition))
        assertEquals("5+(-", handleClick("5+(-", "+", cursorPosition = cursorPosition))
        assertEquals("√", handleClick("√", "+", cursorPosition = cursorPosition))
        assertEquals("√-", handleClick("√-", "+", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleMinusClick() {
        assertEquals("-", handleClick("", "-", cursorPosition = cursorPosition))
        assertEquals("5-", handleClick("5", "-", cursorPosition = cursorPosition))
        assertEquals("5!-", handleClick("5!", "-", cursorPosition = cursorPosition))
        assertEquals("5+4)-", handleClick("5+4)", "-", cursorPosition = cursorPosition))
        assertEquals("5.0-", handleClick("5.", "-", cursorPosition = cursorPosition))
        assertEquals("5+", handleClick("5-", "-", cursorPosition = cursorPosition))
        assertEquals("-", handleClick("-", "-", cursorPosition = cursorPosition))
        assertEquals("(-", handleClick("(-", "-", cursorPosition = cursorPosition))
        assertEquals("5+(-", handleClick("5+(-", "-", cursorPosition = cursorPosition))
        assertEquals("√-", handleClick("√", "-", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleNumberClick() {
        assertEquals("5", handleClick("", "5", cursorPosition = cursorPosition))
        assertEquals("55", handleClick("5", "5", cursorPosition = cursorPosition))
        assertEquals("5!×5", handleClick("5!", "5", cursorPosition = cursorPosition))
        assertEquals("5+4)×5", handleClick("5+4)", "5", cursorPosition = cursorPosition))
        assertEquals("5.5", handleClick("5.", "5", cursorPosition = cursorPosition))
        assertEquals("5-5", handleClick("5-", "5", cursorPosition = cursorPosition))
        assertEquals("-5", handleClick("-", "5", cursorPosition = cursorPosition))
        assertEquals("(-5", handleClick("(-", "5", cursorPosition = cursorPosition))
        assertEquals("5+(-5", handleClick("5+(-", "5", cursorPosition = cursorPosition))
        assertEquals("√5", handleClick("√", "5", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleTrigonometricClick() {
        assertEquals("sin(", handleClick("", "sin", cursorPosition = cursorPosition))
        assertEquals("5×sin(", handleClick("5", "sin", cursorPosition = cursorPosition))
        assertEquals("5!×sin(", handleClick("5!", "sin", cursorPosition = cursorPosition))
        assertEquals("5+4)×sin(", handleClick("5+4)", "sin", cursorPosition = cursorPosition))
        assertEquals("5.0×sin(", handleClick("5.", "sin", cursorPosition = cursorPosition))
        assertEquals("5-sin(", handleClick("5-", "sin", cursorPosition = cursorPosition))
        assertEquals("-sin(", handleClick("-", "sin", cursorPosition = cursorPosition))
        assertEquals("(-sin(", handleClick("(-", "sin", cursorPosition = cursorPosition))
        assertEquals("5+(-sin(", handleClick("5+(-", "sin", cursorPosition = cursorPosition))
        assertEquals("√sin(", handleClick("√", "sin", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleRightUnaryClick() {
        assertEquals("", handleClick("", "!", cursorPosition = cursorPosition))
        assertEquals("5!", handleClick("5", "!", cursorPosition = cursorPosition))
        assertEquals("5!", handleClick("5!", "!", cursorPosition = cursorPosition))
        assertEquals("5+4)!", handleClick("5+4)", "!", cursorPosition = cursorPosition))
        assertEquals("5.0!", handleClick("5.", "!", cursorPosition = cursorPosition))
        assertEquals("5!", handleClick("5-", "!", cursorPosition = cursorPosition))
        assertEquals("-", handleClick("-", "!", cursorPosition = cursorPosition))
        assertEquals("(-", handleClick("(-", "!", cursorPosition = cursorPosition))
        assertEquals("5+(-", handleClick("5+(-", "!", cursorPosition = cursorPosition))
        assertEquals("√", handleClick("√", "!", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleLeftUnaryClick() {
        assertEquals("√", handleClick("", "√", cursorPosition = cursorPosition))
        assertEquals("5×√", handleClick("5", "√", cursorPosition = cursorPosition))
        assertEquals("5!×√", handleClick("5!", "√", cursorPosition = cursorPosition))
        assertEquals("5+4)×√", handleClick("5+4)", "√", cursorPosition = cursorPosition))
        assertEquals("5.0×√", handleClick("5.", "√", cursorPosition = cursorPosition))
        assertEquals("5-√", handleClick("5-", "√", cursorPosition = cursorPosition))
        assertEquals("-√", handleClick("-", "√", cursorPosition = cursorPosition))
        assertEquals("(-√", handleClick("(-", "√", cursorPosition = cursorPosition))
        assertEquals("5+(-√", handleClick("5+(-", "√", cursorPosition = cursorPosition))
        assertEquals("√√", handleClick("√", "√", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleConstantClick() {
        assertEquals("π", handleClick("", "π", cursorPosition = cursorPosition))
        assertEquals("5×π", handleClick("5", "π", cursorPosition = cursorPosition))
        assertEquals("5!×π", handleClick("5!", "π", cursorPosition = cursorPosition))
        assertEquals("5+4)×π", handleClick("5+4)", "π", cursorPosition = cursorPosition))
        assertEquals("5.0×π", handleClick("5.", "π", cursorPosition = cursorPosition))
        assertEquals("5-π", handleClick("5-", "π", cursorPosition = cursorPosition))
        assertEquals("-π", handleClick("-", "π", cursorPosition = cursorPosition))
        assertEquals("(-π", handleClick("(-", "π", cursorPosition = cursorPosition))
        assertEquals("5+(-π", handleClick("5+(-", "π", cursorPosition = cursorPosition))
        assertEquals("√π", handleClick("√", "π", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleOpenBracketClick() {
        assertEquals("(", handleClick("", "(", cursorPosition = cursorPosition))
        assertEquals("5×(", handleClick("5", "(", cursorPosition = cursorPosition))
        assertEquals("5!×(", handleClick("5!", "(", cursorPosition = cursorPosition))
        assertEquals("5+4)×(", handleClick("5+4)", "(", cursorPosition = cursorPosition))
        assertEquals("5.0×(", handleClick("5.", "(", cursorPosition = cursorPosition))
        assertEquals("5-(", handleClick("5-", "(", cursorPosition = cursorPosition))
        assertEquals("-(", handleClick("-", "(", cursorPosition = cursorPosition))
        assertEquals("(-(", handleClick("(-", "(", cursorPosition = cursorPosition))
        assertEquals("5+(-(", handleClick("5+(-", "(", cursorPosition = cursorPosition))
        assertEquals("√(", handleClick("√", "(", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleCloseBracketClick() {
        assertEquals("", handleClick("", ")", cursorPosition = cursorPosition))
        assertEquals("5)", handleClick("5", ")", cursorPosition = cursorPosition))
        assertEquals("5!)", handleClick("5!", ")", cursorPosition = cursorPosition))
        assertEquals("5+4))", handleClick("5+4)", ")", cursorPosition = cursorPosition))
        assertEquals("5.0)", handleClick("5.", ")", cursorPosition = cursorPosition))
        assertEquals("5-", handleClick("5-", ")", cursorPosition = cursorPosition))
        assertEquals("-", handleClick("-", ")", cursorPosition = cursorPosition))
        assertEquals("(-", handleClick("(-", ")", cursorPosition = cursorPosition))
        assertEquals("5+(-", handleClick("5+(-", ")", cursorPosition = cursorPosition))
        assertEquals("√", handleClick("√", ")", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleDecimalClick() {
        assertEquals("0.", handleClick("", ".", cursorPosition = cursorPosition))
        assertEquals("5.", handleClick("5", ".", cursorPosition = cursorPosition))
        assertEquals("5!×0.", handleClick("5!", ".", cursorPosition = cursorPosition))
        assertEquals("5+4)×0.", handleClick("5+4)", ".", cursorPosition = cursorPosition))
        assertEquals("5.", handleClick("5.", ".", cursorPosition = cursorPosition))
        assertEquals("5-0.", handleClick("5-", ".", cursorPosition = cursorPosition))
        assertEquals("-0.", handleClick("-", ".", cursorPosition = cursorPosition))
        assertEquals("(-0.", handleClick("(-", ".", cursorPosition = cursorPosition))
        assertEquals("5+(-0.", handleClick("5+(-", ".", cursorPosition = cursorPosition))
        assertEquals("√0.", handleClick("√", ".", cursorPosition = cursorPosition))
    }

    @Test
    fun testHandleDelete() {
        assertEquals("", handleDelete(""))
        assertEquals("", handleDelete("5"))
        assertEquals("5", handleDelete("5!"))
        assertEquals("5+4", handleDelete("5+4)"))
        assertEquals("5", handleDelete("5."))
        assertEquals("5", handleDelete("5-"))
        assertEquals("", handleDelete("-"))
        assertEquals("(", handleDelete("(-"))
        assertEquals("5+(", handleDelete("5+(-"))
        assertEquals("", handleDelete("√"))
        assertEquals("", handleDelete("sin("))
        assertEquals("", handleDelete("sin⁻¹("))
    }

}