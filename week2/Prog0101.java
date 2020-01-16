
import java.util.*;
// Write  java program that asks the user to enter the x- and y-coordinates
// of the vertices of a 2D triangle and calculates the area. Use the Heron's formula to calculate
// the area. Use a loop to repeat the calculation as long as the user wants to do it
public class Prog0101 {
  public Prog0101(){
    Scanner in = new Scanner(System.in);
    int check = -4;
    do{
    System.out.println(" enter the first set of coordinates of the triangle");
    int x1 = in.nextInt();
    int y1 = in.nextInt();
    System.out.println(" enter the second set of coordinates of the triangle");
    int x2 = in.nextInt();
    int y2 = in.nextInt();
    System.out.println(" enter the third set of coordinates of the triangle");
    int x3 = in.nextInt();
    int y3 = in.nextInt();

    System.out.println("area: "+ area( distance(x1,y1,x2,y2), distance(x2,y2,x3,y3), distance(x3,y3,x1,y1)));

    System.out.println("Enter -1 to end the program");
    check = in.nextInt();
    } while( check != -1);
  }
  public double area(double dist1, double dist2, double dist3){
    double s = (dist1 + dist2 +dist3 )/2;
    double area = Math.sqrt( s*(s-dist1)*(s-dist2)*(s-dist3) );
    return area;
  }

  public double distance(int x1,int y1,int x2, int y2){
      double distance= Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );
      return distance;
  }

  public static void main(String[]args){
     new Prog0101();
  }
}