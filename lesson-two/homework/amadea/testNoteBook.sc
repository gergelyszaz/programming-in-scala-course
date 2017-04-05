object hw02 {
val milk = new Note("buy milk")                   //> milk  : Note = buy milk
val call = new Note("call the doctor")            //> call  : Note = call the doctor
val homework = new Note("do the homework")        //> homework  : Note = do the homework
val learn = new Note("learn scala")               //> learn  : Note = learn scala
val cat = new Note("feed the cat")                //> cat  : Note = feed the cat
val dinner = new Note("cook dinner")              //> dinner  : Note = cook dinner

val doAtHome = new NoteBook()                     //> doAtHome  : NoteBook = List()
doAtHome + homework                               //> res0: scala.collection.mutable.ListBuffer[Note] = ListBuffer(do the homework
                                                  //| )
doAtHome + cat                                    //> res1: scala.collection.mutable.ListBuffer[Note] = ListBuffer(do the homework
                                                  //| , feed the cat)
doAtHome + dinner                                 //> res2: scala.collection.mutable.ListBuffer[Note] = ListBuffer(do the homework
                                                  //| , feed the cat, cook dinner)

doAtHome - homework                               //> res3: scala.collection.mutable.ListBuffer[Note] = ListBuffer(feed the cat, c
                                                  //| ook dinner)
homework ::: learn                                //> res4: Note = do the homework learn scala

val doTomorrow = new NoteBook()                   //> doTomorrow  : NoteBook = List()
doTomorrow + call                                 //> res5: scala.collection.mutable.ListBuffer[Note] = ListBuffer(call the doctor
                                                  //| )
doTomorrow + milk                                 //> res6: scala.collection.mutable.ListBuffer[Note] = ListBuffer(call the doctor
                                                  //| , buy milk)

val allMyNotes = doAtHome ::: doTomorrow          //> allMyNotes  : NoteBook = List(call the doctor, buy milk, feed the cat, cook 
                                                  //| dinner)
allMyNotes + new Note("wash the car")             //> res7: scala.collection.mutable.ListBuffer[Note] = ListBuffer(call the doctor
                                                  //| , buy milk, feed the cat, cook dinner, wash the car)

}