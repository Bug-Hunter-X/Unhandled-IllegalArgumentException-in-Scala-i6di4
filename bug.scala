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
println(obj.myMethod(0)) // This line will throw an exception
```