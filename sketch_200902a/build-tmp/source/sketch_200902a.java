import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_200902a extends PApplet {

public void setup()
{
  
}

public void draw()
{
  background(50, 166, 240);
  stroke(202, 25, 25);
  strokeWeight(2.5f);
  noFill();
  drawV();
  drawI();
  drawK();
  drawT();
  drawO();
  drawR();

}
public void drawV(){
  line(10, 10, 30, 50);
  line(30, 50, 50, 10);
}

public void drawI(){
  line(70, 10, 70, 10);
  line(70, 20, 70, 50);
}

public void drawK(){
  line(90, 10, 90, 50);
  line(90, 35, 105, 50);
  line(90, 35, 105, 20);
}
public void drawT(){
arc(135, 35, 30, 30, HALF_PI, PI);
line(120, 10, 120, 35);
line(110, 20, 130, 20);
}
public void drawO(){
ellipse(165, 30, 40, 40);
}
public void drawR(){
line(200, 10, 200, 50);
arc(215, 45, 40, 60, PI+QUARTER_PI, TWO_PI-1.2f);

}


  public void settings() {  size(768, 432); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_200902a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
