import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CodeTest {
    @Test
    fun reOrderTest() {
        val oddEvenSorting = OddEvenSorting()
        assertEquals(intArrayOf(1, 3, 5, 7, 9, 2, 4, 6, 8).contentToString(), oddEvenSorting.reOrder(intArrayOf(2, 5, 1, 4, 3, 6, 8, 7, 9)).contentToString())
    }

    @Test
    fun uniquePermutationTest() {
        val uniquePermutations = UniquePermutations()
        val result: MutableList<List<Int>> = ArrayList()
        result.add(listOf(1, 2, 3, 3))
        result.add(listOf(1, 3, 2, 3))
        result.add(listOf(1, 3, 3, 2))
        result.add(listOf(2, 1, 3, 3))
        result.add(listOf(2, 3, 1, 3))
        result.add(listOf(2, 3, 3, 1))
        result.add(listOf(3, 2, 1, 3))
        result.add(listOf(3, 2, 3, 1))
        result.add(listOf(3, 1, 2, 3))
        result.add(listOf(3, 1, 3, 2))
        result.add(listOf(3, 3, 1, 2))
        result.add(listOf(3, 3, 2, 1))
        assertEquals(result, uniquePermutations.permuteUnique(intArrayOf(1, 2, 3, 3)))
    }
}