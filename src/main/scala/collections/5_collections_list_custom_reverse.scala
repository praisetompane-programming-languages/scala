def reverse[T, L](lst: List[T]): List[T] = lst.zipWithIndex
  .sortWith { _._2 > _._2 }
  .map { case (value, index) => value }

@main def main() = 
  println("using custom code")
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(reverse(numbers))

  println("using standard scala library")
  println(numbers.reverse)