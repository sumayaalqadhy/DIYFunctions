// Write your code below
fun getListOfNumbers(): List<Int> {
  var myList = mutableListOf<Int>()

  for (item in 1..7) {
    println("Enter a value: ")
    val answer = Integer.valueOf(readLine())

    myList.add(answer)
  }

  return myList
}

fun findMax(listName: List<Int>): Int {
  var largestNumber = listName[0]

  for (item in listName) {
    if (value > largestNumber) {
      largestNumber = value
    }
  }
  return largestNumber
}

fun main() {
  // Write more code below

  var values = getListOfNumbers()
  println(values)

}

