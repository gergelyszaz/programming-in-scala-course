object testComplex {

 implicit def intToComplex(x: Double) = new Complex(x)
                                                  //> intToComplex: (x: Double)Complex

  val c1 = new Complex(3, 4)                      //> c1  : Complex = 3.0 + 4.0 * i
  val c2 = new Complex(2, 6)                      //> c2  : Complex = 2.0 + 6.0 * i
  
  c1 + c2                                         //> res0: Complex = 5.0 + 10.0 * i
  c1-c2                                           //> res1: Complex = 1.0 + -2.0 * i
  c1*c2                                           //> res2: Complex = -18.0 + 26.0 * i
  c1/c2                                           //> res3: Complex = 0.75 + -0.25 * i
  val num1 = c1!                                  //> num1  : Double = 5.0
  val num2 = 2 + c2                               //> num2  : Complex = 4.0 + 6.0 * i
  
  
}