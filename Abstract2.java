abstract class Shape
{
abstract void draw();
void draw1()
{
System.out.println("\nnon abstract method");
}
}

class Rectangle extends Shape
{
void draw()
{
System.out.println("\ndrawing rectangle");
super.draw();
}
}

class Circle extends Shape
{
void draw()
{
System.out.println("\ndrawing circle");
super.draw1();
}
}

class Abstract2
{
public static void main(String args[])
{
Shape s=new Circle();
s.draw();
Shape s1=new Rectangle();
s1.draw();

/*
Circle c=new Circle();
c.draw();
c.draw1();

Rectangle r=new Rectangle();
r.draw();
r.draw1();
}
}