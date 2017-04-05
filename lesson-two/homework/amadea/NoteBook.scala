import scala.collection.mutable.ListBuffer

class NoteBook(list: List[Note]) {
  val noteList : List[Note] = list
  var noteBuffer : ListBuffer[Note] = noteList.to[ListBuffer]
  def this() = this(List.empty)
  def + (that: Note) = {noteBuffer += that}
  def - (that: Note) = {noteBuffer -= that}
  def ::: (that: NoteBook): NoteBook = new NoteBook(noteBuffer.toList ++ that.noteBuffer.toList)
  override def toString = noteBuffer.toList.toString()
  def getSize : Int = noteBuffer.toList.size
}