import java.util.Scanner;
public class MainSentient {
    String SubName;
    public static void main(String args[]){
        String SubName;
        String resp;
        String resp1;
        Scanner enps = new Scanner(System.in);
        //this is my AI project (0.0.1)
        System.out.println("Hi, I'm Alex");
        resp = enps.nextLine();
        if((resp.equals("hi alex"))||(resp.equals("Hi Alex")
                ||(resp.equals("hello alex")||(resp.equals("Hello Alex")||(resp.equals("Hi alex")||(resp.equals("hi Alex")
                ||(resp.equals("Hi Alex")||(resp.equals("Hi Alex")||(resp.equals("Hi")||(resp.equals("hi")||(resp.equals("Hello")||(resp.equals("hello")
                )))))))))))){
            System.out.println("Can I ask you a question?");
            resp1 = enps.nextLine();
            if((resp1.equals("yes"))||(resp1.equals("Yes") ||(resp1.equals("Yeah")||(resp1.equals("yeah")||(resp1.equals("Sure")||(resp1.equals("sure")||(resp1.equals("Okay")||(resp1.equals("okay"))))))))){
                System.out.println("What is your name?");
                SubName = enps.nextLine();
                if((SubName != null)){

                }
            }
        }else{
            SecondSentient jump = new SecondSentient();
            jump.out0();
        }
    }
}
