import scala.math._ 

class Complex(a: Double, b: Double) {
  val real: Double = a
  val imag: Double = b
  
  def this(r: Double) = this(r, 0)
  
  private def countTmpReal(other: Complex): Double = pow(other.real, 2) + pow(other.imag, 2)
  
  def + (that: Complex): Complex = new Complex(real + that.real, imag + that.imag)
  def - (that: Complex): Complex = new Complex(real - that.real, imag - that.imag)
  def * (that: Complex): Complex = new Complex(real * that.real - imag * that.imag, real * that.imag + imag * that.real)
  def / (that: Complex): Complex = new Complex((real * that.real + imag * that.imag)/countTmpReal(that), (imag * that.real - real * that.imag)/countTmpReal(that))
  def !(): Double = sqrt(pow(real, 2) + pow(imag, 2))
  override def toString = real.toString() + " + " + imag.toString() + " * i"
}