object Q2 {
  val result = (num: Int) => if(num<=0) "Negative/Zero is input."
  else if(num%2==0) "Input is even."
  else if(num%2!=0) "Input is odd."

  def main(args: Array[String]): Unit={
    print("Enter the number: ")
    var number = scala.io.StdIn.readLine()
    println(result(number.toInt))
  }
}

