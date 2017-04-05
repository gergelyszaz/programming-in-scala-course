import scala.io.Source
val allWords = Source.fromURL(args(1)).getLines.map(line => line.split("\\W+")).flatMap(word => word).toList
val filteredWords = allWords.filterNot(w => (w.startsWith("<") && w.endsWith(">"))).filter(_ >= ' '.toString())
val wordCountMap = filteredWords.groupBy(word=>word).map(l=>(l._1, l._2.size))
val topKwords = wordCountMap.toSeq.sortBy(_._2).reverse.take(args(0).toInt)
topKwords.foreach(println)

//args(0): Int - first k word
//args(1): String - url of the web page