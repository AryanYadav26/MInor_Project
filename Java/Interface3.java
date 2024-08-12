interface Constants
{
float PI = 3.14f; 
float GRAVITY = 9.8f;
}
public class Interface3 implements Constants
{
void freeFall(float time)
{
float height = GRAVITY * time * time * 0.5f; float vel = GRAVITY * time; 
System.out.println("Height travelled: " + height);
System.out.println("Velocity: "+vel);
}
void circleArea(float r)
{
float area = PI * r * r; System.out.println("Area of circle of radius "+ r + " : " + area);
}
public static void main(String[] args)
{
Interface3 cal = new Interface3(); 
cal.freeFall(20f);
cal.circleArea (10f);
}
}
