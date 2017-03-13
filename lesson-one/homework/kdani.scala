import scala.io.Source

val URI = "https://en.wikipedia.org/wiki/Scala_(programming_language)"

val html = Source.fromURL(URI, "ISO-8859-1")

val wordMap =
    html.getLines()
        .flatMap(_.split("\\W+"))
        .toList
        .groupBy(identity)
        .mapValues(_.size)

val sortedWordSeq = wordMap.toSeq.sortBy(-_._2)

println(s"The 10 most frequent words on the - $URI - page")

sortedWordSeq.take(10).foreach(println)