object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    
    val input = scala.io.StdIn.readInt()

    
    val multipleOfThree: Int => Boolean = _ % 3 == 0
    val multipleOfFive: Int => Boolean = _ % 5 == 0

    
    val result = (multipleOfThree(input), multipleOfFive(input)) match {
      case (true, true) => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(result)
  }
}
