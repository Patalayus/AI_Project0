import java.util.Scanner;
public class MainSentient {
    //global variables
    public double count = 0;

    public static void main(String args[]) {
        //this is my AI project (0.0.1)

        //local declaration of variables used in main class
        String SubName;
        String resp;
        String resp1;
        String resp2;
        double config;

        //initialise input
        Scanner enps = new Scanner(System.in);

        //jump function
        SecondSentient jump = new SecondSentient();
        MainSentient stay = new MainSentient();

        System.out.println("Hi, I'm Alex");
        config=1;
        resp = enps.nextLine();
        if ((resp.equals("hi alex")) || (resp.equals("Hi Alex")
                || (resp.equals("hello Alex")|| (resp.equals("Hello alex")
                || (resp.equals("hello alex") || (resp.equals("Hello Alex")
                || (resp.equals("Hi alex") || (resp.equals("hi Alex")
                || (resp.equals("Hi Alex") || (resp.equals("Hi Alex")
                || (resp.equals("Hi") || (resp.equals("hi")
                || (resp.equals("Hello") || (resp.equals("hello")
        )))))))))))))) {
            System.out.println("Can I ask you a question?");
            resp1 = enps.nextLine();
            if ((resp1.equals("yes")) || (resp1.equals("Yes") || (resp1.equals("Yeah")
                    || (resp1.equals("yeah") || (resp1.equals("Sure")
                    || (resp1.equals("sure") || (resp1.equals("Okay") || (resp1.equals("okay")
                    ||(resp1.equals("yea")||(resp1.equals("Yea")||(resp1.equals("YEA")))))))))))) {
                System.out.println("What is your name?");
                SubName = enps.nextLine();
                //parse into global equivalent

                if ((SubName != null)) {
                    System.out.println("Well, hello " + SubName+".");
                    stay.nextf();
                }
            }else{
                //option no
                jump.val_option();
            }
        } else {
            double count = 0;
                if(count==0) {
                    System.out.printf(jump.out0());
                    resp2 = enps.nextLine();
                    if ((resp2.equals("hi alex")) || (resp2.equals("Hi Alex")
                            || (resp2.equals("hello alex") || (resp2.equals("Hello Alex")
                            || (resp2.equals("Hi alex") || (resp.equals("hi Alex")
                            || (resp2.equals("Hi Alex") || (resp2.equals("Hi Alex")
                            || (resp2.equals("Hi") || (resp2.equals("hi") || (resp2.equals("Hello")
                            || (resp2.equals("hello")
                    )))))))))))) {
                        System.out.println("Can I ask you a question?");
                        resp1 = enps.nextLine();
                        if ((resp1.equals("yes")) || (resp1.equals("Yes") || (resp1.equals("Yeah")
                                || (resp1.equals("yeah") || (resp1.equals("Sure")
                                || (resp1.equals("sure") || (resp1.equals("Okay")
                                || (resp1.equals("okay")||(resp1.equals("yea")
                                ||(resp1.equals("Yea")||(resp1.equals("YEA")))))))))))) {
                            System.out.println("What is your name?");
                            SubName = enps.nextLine();
                            //parse into global equivalent

                            if ((SubName != null)) {
                                System.out.println("Well, hello " + SubName+".");
                                stay.nextf();
                            }
                        } else {
                            //option no
                            jump.val_option();
                        }
                    }else{
                        //option no
                        jump.val_option();
                    }
                }
                if(count==1){
                    count++;
                    System.out.println("This will never be printed to the user");
                }
            }
    }public void nextf(){
        //local declaration of jump function (specific to this subroutine)
        SecondSentient jump_0 = new SecondSentient();

        System.out.println("What's your favourite colour?");
        jump_0.colourpreferance();
    }
    public String extrapolate(){
        return  String.format("");
    }
}