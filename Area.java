class Room
{
int length;
int height;
}
class Area
{
public static void main(String args[])
{
Room r=new Room();
r.length=10;
r.height=20;
System.out.println("area is:"+(r.length*r.height));

Room r1=new Room();
r1.length=20;
r1.height=30;
System.out.println("area is:"+(r1.length*r1.height));
}
}

