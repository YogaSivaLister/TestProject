import java.util.*

class UniquePermutations {
    fun permuteUnique(inputArray: IntArray): MutableList<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        permute(0, inputArray, result)
        return result
    }

    private fun permute(start: Int, inputArray: IntArray, result: MutableList<List<Int>>) {
        if (start == inputArray.size - 1) {
            val tempList = ArrayList<Int>()
            for (num in inputArray) {
                tempList.add(num)
            }
            //adding permuted list to result
            result.add(tempList)
            return
        }
        val set = HashSet<Int>()
        for (i in start until inputArray.size) {
            //check for unique permutation value.
            if (set.contains(inputArray[i])) {
                continue
            }
            set.add(inputArray[i])
            //swap for next set
            swap(inputArray, i, start)
            permute(start + 1, inputArray, result)
            //Re-swap to original position to continue for loop
            swap(inputArray, i, start)
        }
    }
}