object Q1 {
  val interest = (deposit: Int) => if(deposit<=20000) deposit*0.02
  else if(deposit<=200000) deposit*0.04
  else if(deposit<=2000000) deposit*0.035
  else if(deposit>=2000000) deposit*0.065

  def main(args:Array[String]):Unit={
    println(interest(5000))
  }
}
