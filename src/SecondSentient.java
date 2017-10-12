import java.util.Scanner;
public class SecondSentient extends MainSentient {
    public double check;

    public String out0(){
        return String.format("Are you going to say hi?");
    }
    public void colourpreferance(){
        Scanner and = new Scanner(System.in);

        //local variables
        String colourpref =and.nextLine();
        if((colourpref.equals("purple"))||(colourpref.equals("Purple")||(colourpref.equals("PURPLE")))){
        System.out.println("Hey! My favourite colour is purple too!");
        }else{
        System.out.println("I'm not really a fan of "+colourpref+".\nI think " +
                "my favourite colour is purple.");
        System.out.println("So, ");
        }
    }
    public void val_option(){
        System.out.println("Well I guess this is it then...");
    }
    public String check_run() {
        check = 1;
        return String.format(""+check);
    }

}
