class OddEvenSorting {

    fun reOrder(inputArray: IntArray): IntArray {
        //Rearranging array with Odd and Even.
        val oddIndexEnd = rearrangeOddAndEven(inputArray)
        // Sorting Odd numbers
        sortWithIndex(0, oddIndexEnd, inputArray)
        //Sorting Even numbers
        sortWithIndex(oddIndexEnd + 1, inputArray.size - 1, inputArray)
        return inputArray
    }

    private fun sortWithIndex(fromIndex: Int, toIndex: Int, numbers: IntArray) {
        for (pass in fromIndex until (toIndex)) {
            for (currentPosition in fromIndex until (toIndex)) {
                if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                    // swap the element
                    swap(numbers, currentPosition, currentPosition + 1)
                }
            }
        }
    }

    private fun rearrangeOddAndEven(numbers: IntArray): Int {
        var j: Int = -1
        for (currentPosition in 0 until (numbers.size)) {
            // is odd then swap
            if (numbers[currentPosition] % 2 != 0) {
                // increment j by one
                j++
                // swap the element
                swap(numbers, currentPosition, j)
            }
        }
        return j
    }
}