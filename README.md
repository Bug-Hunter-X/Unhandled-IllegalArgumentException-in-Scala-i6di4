# Unhandled IllegalArgumentException in Scala

This example demonstrates a common error in Scala: an unhandled `IllegalArgumentException`. The code defines a class `MyClass` with a method `myMethod` that throws an `IllegalArgumentException` if the input `x` is 0. The main part of the code then calls `myMethod` with `x` as 0, resulting in the exception.

**How to fix:**

The best way to handle this is using try-catch blocks to gracefully manage exceptions.
