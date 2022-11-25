fun main() {
    print(solution("cabca"))
}

fun solution(s: String): Int {
    val tempList = mutableListOf<Char>()
    for (i in s.indices) {
        if (!tempList.contains(s[i])) {
            tempList.add(s[i])
        }
    }

    return tempList.size
}