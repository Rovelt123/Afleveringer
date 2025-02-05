String adress = "Bytoften 25, 2 th, 2650 Hvidovre";
int firstMath = 42 / 2;
float secondMath = 5.0 / 2;
String message = "Hello my friend! This is random, but are you able to have %s cats? Or is it weird to have cats in decimal?";
String otherMessage = "Hello, I like coffee";
boolean isFirst = false;

void setup(){
 for (int k = 0; k < 2; k++) {
     if (isFirst == false) {
       isFirst = true;
       println("My adress is: " + adress); 
       println("What's 9 plus 10? " + firstMath);
       println(String.format(message, secondMath)); // Jeg indebyggede bare min gemte besked til brugeren med ind under min second math i en string.format, blot for at lege lidt med det.
       //println(otherMessage); //Just in case, har jeg også lavet til min gemte besked.      
      }else {
       adress = "Landlystvej 62, 2650 Hvidovre";
       firstMath = 84 / 2;
       secondMath = 3.0 / 2;
       otherMessage = "Now I hate coffe...";
       println("My new adress is: " + adress); 
       println("What's the answer to everything? " + firstMath);
       println(String.format("I wished that I could have %s coffee, but that might be too much?", secondMath));
       println(otherMessage); 
     }
     println();
   }
}
