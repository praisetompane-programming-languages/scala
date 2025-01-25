import io.Source.stdin
import io.StdIn

@main def main(): Unit =
    println("Please enter two numbers on separate lines")
    val sum = stdin.getLines().take(2).map(_.toInt).sum
    println(s"sum: $sum")