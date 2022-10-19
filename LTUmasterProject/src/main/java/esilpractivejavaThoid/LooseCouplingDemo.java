package esilpractivejavaThoid;



interface Keyboard  
{  
String display();  
}  
  
class DellKeyboard implements Keyboard  
{  
  
String info;  
  
public String display()  
{  
this.info = "the Dell keyboard.";  
return this.info;  
}  
}  
  
class LenovoKeyboard implements Keyboard  
{  
  
String info;  
  
public String display()  
{  
this.info = "the Lenovo keyboard.";  
return this.info;  
}  
}  
  
class Computer  
{  
// the method only handles keyboard made by the company Dell  
public void keyboardUsed(DellKeyboard dk)  
{  
System.out.println("The computer is using " + dk.display());  
}  
}  
  
public class LooseCouplingDemo  
{  
  
// main method   
public static void main(String argvs[])   
{  
// creating an object of the class Computer  
Computer obj = new Computer();  
  
// creating an object of the class DellKeyboard  
DellKeyboard dk = new DellKeyboard();  
  
obj. keyboardUsed(dk);  
  
}  
}  