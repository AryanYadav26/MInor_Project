package mpackage; 
public class MyPackage {
public void displayMessage() 
{
System.out.println("This is a class from mypackage.");
}
}



import mpackage.MyPackage;

public class main {
public static void main(String[] args) {
MyPackage myPackageObject = new MyPackage(); myPackageObject.displayMessage();
}
}

