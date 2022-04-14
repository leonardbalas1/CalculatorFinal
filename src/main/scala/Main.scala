import scala.io.StdIn.{readChar, readLine}

object Main extends App {

  def myreadChar (prompt: String): Char= {
    print(prompt)
    java.lang.System.out.flush()
    readChar()
  }

while(true){
  val calc = new Calculator//private
  val x = readLine("podaj x: ").toInt
  val y = readLine("podaj y: ").toInt
  val wybor= readLine("wybierz dzialanie:" +
    "1. add" +
    "2. subtract" +
    "3. multiple" +
    "4. divide").toInt

  if (wybor == 1)
    println(calc.add(x, y))
  if (wybor == 2)
    println(calc.subtract(x, y))
  if (wybor == 3)
    println(calc.multiple(x, y))
  if (wybor == 4)
    println(calc.divine(x, y))

//  println(calc.add(x,y))
//  println(calc.subtract(x,y))
//  println(calc.multiple(x,y))
//  println(calc.divine(x,y))
  val answer = readLine("kontynuowac? (Y/n)")
  if (answer == "n")
    println("dzieki")
  if (answer=="Y") {
    val x = readLine("podaj x: ").toInt
    val y = readLine("podaj y: ").toInt
    val wybor = readLine("wybierz dzialanie:" +
      "1. add" +
      "2. subtract" +
      "3. multiple" +
      "4. divide").toInt
    if (wybor == 1)
      println(calc.add(x, y))
    if (wybor == 2)
      println(calc.subtract(x, y))
    if (wybor == 3)
      println(calc.multiple(x, y))
    if (wybor == 4)
      println(calc.divine(x, y))


  }
}
}
