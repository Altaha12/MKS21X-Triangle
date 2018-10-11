public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;
  public Triangle(Point I,Point II,Point III){
    v1=I;
    v2=II;
    v3=III;
  }
  public Triangle(double x1, double y1,double x2,double y2, double x3, double y3){
    Point I = new Point(x1,y1);
    Point II = new Point(x2,y2);
    Point III = new Point(x3,y3);
    v1=I;
    v2=II;
    v3=III;
  }
  public double getPerimeter(){
    return Point.distance(v1,v2)+Point.distance(v2,v3)+Point.distance(v3,v1);
  }
  public Point getVertex(int x){
    if(x==0){Point r =new Point(v1);return r;}
    if(x==1){Point r =new Point(v2);return r;}
    if(x==2){Point r =new Point(v3);return r;}
    return null;
  }
  public void setVertex(int x, Point I){
    Point r = new Point(I);
    if(x==0)v1=r;
    if(x==1)v2=r;
    if(x==2)v3=r;
  }
  public String toString(){
    return "Triangle: A("+v1.getX()+","+v1.getY()+")B("+v2.getX()+","+v2.getY()+")c("+v3.getX()+","+v3.getY()+")";
  }
}
