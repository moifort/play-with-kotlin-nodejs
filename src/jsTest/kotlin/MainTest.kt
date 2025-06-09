import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun testGreetMessage() {
        val expected = "Hello from Kotlin on Node.js! [Hello, from, Kotlin, on, Node.js!]"
        assertEquals(expected, greetMessage())
    }
}
