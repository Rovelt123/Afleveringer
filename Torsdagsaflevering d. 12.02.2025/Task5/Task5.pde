void setup() {
  methodOne(); 
  methodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/
String output;
void methodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    output = "i is greater than " + max + ".";   
  }
  
  println(output);
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void methodTwo() 
{
  String dayNames[] = {"Monday", "Sunday"};
  int weekDay = 1; // 0 = Monday, 1 = Sunday. 
  boolean weekend = false;
  
  if (weekDay < 1)
  {
    weekend = false;
  }
  else 
  {
    weekend = true;
  }
  
  // Print the name of the weekday here: 
  //Jeg valgte at bruge en array istedet for if else eller switch, da dette er noget mere optimeret. - Har også lavet de andre metoder, så du kan se, at jeg godt kan bruge dem også...
  println(dayNames[weekDay]);
  
  //Anden metode
  /* if (weekDay == 0) {
    print("MONDAY :(");
  } else if (weekDay == 1) {
    print("SUNDAY YAY!");
  } 
  
  // Tredje metode
  String dayName = "";
  switch(weekDay) {
   case 0:
     dayName = "MONDAY";
     break
   case 1: 
     dayName = "SUNDAY";
     break
  }
  println(dayName);
  */
    
    
  // Print if it is weekend here:
  if (weekend) {
   println("It's freaking weekend!"); 
  }
  
}
