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
  
  if (i > max) {
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
  //I chose to use an array instead of if else or switch, as this is more optimized. - I also made the other methods, so you can see that I can use them too...
  println(dayNames[weekDay]);
  
  //Other method
  /* if (weekDay == 0) {
    print("MONDAY :(");
  } else if (weekDay == 1) {
    print("SUNDAY YAY!");
  } 
  
  // Third method
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
