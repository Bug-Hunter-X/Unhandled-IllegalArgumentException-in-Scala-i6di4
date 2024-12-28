```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x == 0) {
      throw new IllegalArgumentException("x cannot be zero")
    }
    value / x
  }
}

val obj = new MyClass(10)

try {
  println(obj.myMethod(0))
} catch {
  case e: IllegalArgumentException => println(s"Error: ${e.getMessage}")
  case e: Exception => println(s"An unexpected error occurred: ${e.getMessage}")
}
```