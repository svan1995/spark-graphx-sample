object Demo1 {
  def main(args: Array[String]): Unit = {
    var map1 : Map[String, Int] = Map()
    map1 += ("one" -> 1)
    map1 += ("two" -> 2)

    var map2 : Map[String, Int] = Map()
    map2 += ("one" -> 11)
    map2 += ("two" -> 22)
    map2 += ("three" -> 33)

    (map1.keySet ++ map2.keySet).foreach(println(_))
  }
}
