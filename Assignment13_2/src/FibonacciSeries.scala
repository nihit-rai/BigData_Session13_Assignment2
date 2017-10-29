
/**
 * Author Nihit Rai
 * This class provides two methods to find Nth number in fibonacci series
 */
class FibonacciSeries {
  
  /**
   * Method to find Nth number in fibonacci series using for loop
   */
  def findViaLoop(n: Int) = {
  if (n < 2) n
  else {
    var ans = 0
    var n1 = 0
    var n2 = 1
 
    for (i <- n-1 to 1 by -1)
    {
      ans = n1 + n2
      n1 = n2
      n2 = ans
    }
  ans
  }
}

  /**
   * Method to find Nth number in fibonacci series using recursion
   */
def findViaRecursion(n: Int): Int = {
  n match {
    case i if i < 2 => i
    case i => findViaRecursion(n-1) + findViaRecursion(n-2)
  }
}  
  
}

//Main object
object mainObj
{
    def main(args: Array[String]) {
        var obj = new FibonacciSeries();
        val fibLoop = 5;
        val fibRecur = 3;
        //Passing fibLoop as parameter to FibonacciSeries.findViaLoop method to determine Nth fibonacci number 
        println(fibLoop+" Fibonacci number using For Loop: " +obj.findViaLoop(fibLoop));
        //Passing fibRecur as parameter to FibonacciSeries.findViaRecursion method to determine Nth fibonacci number
        println(fibRecur+" Fibonacci number using Recursion: " +obj.findViaRecursion(fibRecur));
    }
}