import scala.io.Source

	val topK = 10
	
	val url = "http://blog.gainlo.co/index.php/2016/05/24/design-a-recommendation-system/?utm_source=quora&utm_medium=How+can+I+start+building+a+recommendation+engine%3F&utm_campaign=quora"

	def createListOfWords(url: String) = Source.fromURL(url)("ISO-8859-1").getLines.map(line => line.split("\\W+")).flatMap(word => word).toList
	
	def filterNonHtmlWords(list: List[String]) = list.filterNot(w => (w.startsWith("<") && w.endsWith(">"))).filter(_ >= ' '.toString())
	
	def createWordCountMap(words: List[String]): Map[String, Int] = words.groupBy(word=>word).map(l=>(l._1, l._2.size))
	
	def sortByValueAndGetFirstN(map :Map[String, Int] , n :Int) = map.toSeq.sortBy(_._2).reverse.take(n)
	
	val allWords = createListOfWords(url)
	
	val words = filterNonHtmlWords(allWords)

	val wordCountMap = createWordCountMap(words)
	
	val topKwords = sortByValueAndGetFirstN(wordCountMap, topK)
	
	topKwords.foreach(println)
	
	
	
	/*
	def createWordCountMap(words: List[String]): mutable.Map[String, Int] = {
		val wordCountMap = mutable.Map[String, Int]()
		for(word <- words){
			if (wordCountMap.contains(word)) wordCountMap(word) = wordCountMap.get(word).get + 1 else wordCountMap += (word -> 1)
		}
		return wordCountMap
	}
	*/
                        
     
	
