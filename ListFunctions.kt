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



fun main() {
  // Write more code below
 

}

