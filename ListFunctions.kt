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

// Max value
fun findMax(listName: List<Int>): Int {
  var largestNumber = listName[0]

  for (item in listName) {
    if (value > largestNumber) {
      largestNumber = value
    }
  }
  return largestNumber
}

// Min value
fun findMin(minList: List<Int>) : Int {
  var smallestNumber = minList[0]

  for(num in minList) {
    if (num < smallestNumber) {
      smallestNumber = num
    }
  }
  return smallestNumber
}

fun main() {
  // Write more code below

  var values = getListOfNumbers()
  println(values)

  var largestValue = findMax(values)
  println("The largest number is $largestValue.")

  var smallestValue = findMin(values)
  println("The smallest number is $smallestValue.")

}

