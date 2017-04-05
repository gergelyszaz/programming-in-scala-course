
class Note (input: String) {
  val text = input
  def ::: (that: Note): Note = 
    new Note(that.text + " " + text)
  override def toString = text.toString()
}
