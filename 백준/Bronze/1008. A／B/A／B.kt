import java.lang.String.format
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()
    print(format("%.9f", a/b))
}