object MainChapter12 {
	def main(args: Array[String]) {

		// Question 1
		def values(fun: (Int) => Int, low: Int, high: Int) = {
			for (n <- low to high) yield (n, fun(n))
		}

		// Question 2
		def findMax(nums: Array[Int]) = {
		  	nums.reduceLeft(_ max _)
		}
  
		// Question 3
		def fact(x: Int) = {
		  (1 to x).reduceLeft(_ * _)
		}
  
		// Question 4
		def safeFact(x: Int) = {}}
  
	}
}