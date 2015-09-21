def values(fun: (Int) => Int, low: Int, high: Int) = {
      for (n <- low to high) yield (n, fun(n))
}
