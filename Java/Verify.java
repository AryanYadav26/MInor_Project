class species{
 void breathe(){
 System.out.println(" yes , we can breathe ");
 }
 void sight(){
 System.out.println(" yes , we  can see also ");
 }
}
class humans extends species
{

void brain(){
System.out.println(" yes , we can think also ");
}
void work(){
    super.breathe();
    super.sight();
    brain();
}
}
class Verify{
    public static void main(String args[]){
        humans h = new humans();
        h.work();
    }
}
