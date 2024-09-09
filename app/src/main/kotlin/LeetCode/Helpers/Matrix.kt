package LeetCode

fun areMatricesEqual(
    matrix1: Array<IntArray>,
    matrix2: Array<IntArray>
): Boolean {

    if (matrix1.size != matrix2.size || 
        matrix1[0].size != matrix2[0].size) return false

    for (i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            if (matrix1[i][j] != matrix2[i][j]) return false
        }
    }

    return true
}