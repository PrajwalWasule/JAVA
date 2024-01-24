package distance;
import java.lang.Math;
public class Point2D {
	private int x;
	private int y;
	Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;	
	}
	public String show()
	{
		return "x is:-"+x+"y is:-"+y;
	}
public boolean isequal(Point2D p2)
{
	if( this.x==p2.x && this.y==p2.y)
		return true;
	else 
		return false;
}
double calculateDistance(Point2D p2)
{
	return Math.sqrt((p2.y-this.y)*(p2.y-this.y)+(p2.x-this.x)*(p2.x-this.x));
	    
}

}
