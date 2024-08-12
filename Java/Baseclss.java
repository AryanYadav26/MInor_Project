class Superclass {
private int privateMember = 10; public int getPrivateMember()
{
return privateMember;
}
public void showPrivateMember()
{
System.out.println("BaseClass: Private Member = " + privateMember);
}
}
class DerivedClass extends Superclass
{
void accessPrivateMemberIndirectly()
{
int indirectAccess = getPrivateMember(); 
System.out.println("DerivedClass: Indirectly Accessed Private Member = " + indirectAccess);
}
}
class Main{
public static void main(String[] args){ 
DerivedClass derivedObj = new DerivedClass();
}
}
