int a = 0;
int b = 10;

if (a + b == 10 || (a==10 || b==10)) {
  println("Success");
} else {
  println("Failure");
}

int min = 5;
int max = 11;
int math = min + max;
if (5 >= min && math >= 10 && max <= 10) {
  println("Success");
} else {
  println("Failure");
}

int x = 11, y = 11, z = 8; 
if (x + y + z == 30 && (x%10 != 0 && y%10 != 0 && z%10 != 0)) {
  println("Success");
} else {
  if (!(x + y + z == 30)) {
    println("The math is not 30. It is: " + (x + y + z));
  } else if ((x% 10 == 0)) {
    println("X FAILED - was " +x);
  } else if ((y% 10 == 0)) {
    println("Y FAILED - was " +y);
  } else if ((z% 10 == 0)) {
    println("Z FAILED - was " +z);
  }
  println("Failure" + (x+y+z));
}
