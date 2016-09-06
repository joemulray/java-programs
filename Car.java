public class Car {
	private int yearModel;
	private String make;
	private int speed;

    public Car()
{
	yearModel= 0;
	make="unknown";
	speed= 0;
}
    public void Car(int y, String m, int s)
{
    yearModel = y;
    make = m;
    speed = s;
}
    public void setyearModel(int y)
{
	yearModel = y;
}
	public int getyearModel()
{
	return yearModel;
}
	public void setmake(String m)
{
	make = m;
}
	public String getmake()
{
		return make;
}
	public void setspeed(int s)
{
	speed = s;
}
	public int getspeed()
{
		return speed;
}
	public void Accelerate()
{
		speed+=5;
}
	public void brake()
{
		speed-=5;
}
}
