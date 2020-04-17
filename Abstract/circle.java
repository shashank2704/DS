abstract class Area
{
double r;
  double getradius()
  {
      return r;
  }
 abstract double getarea();
}
public class circle extends Area
{
    circle()
    {

    }
    circle(double rad)
    {
r=rad;
    }
   double getarea()
    {
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        circle c1 = new circle(2.4);
        System.out.println(" radius = "+ c1.getradius());
        System.out.println(" area = "+ c1.getarea());
    }
}
