def filter_out_odd_indices(lst: List[Int]): List[Int] =
  def is_odd(number: Int) = number % 2 == 1
  lst.zipWithIndex
    .filterNot { (value, index) => is_odd(index + 1) }
    .map { (value, index) => value }

@main def main() =
  val numbers = List(2, 5, 3, 4, 6, 7, 9, 8)
  println(filter_out_odd_indices(numbers))
