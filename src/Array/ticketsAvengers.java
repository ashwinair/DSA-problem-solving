package Array;

public class ticketsAvengers {
    public static void main(String[] args) {
        int[] pil = {25, 25, 50, 50, 100};
        System.out.println(Tickets(pil));
    }
    public static String Tickets(int[] peopleInLine)
    {
        int tac =0;

        if(peopleInLine[0] > 25){
            return "NO";
        }
        else
        {
            tac = peopleInLine[0];
        }

        for(int i =1;i<peopleInLine.length;i++){

            int remAmt = 0;
            remAmt = peopleInLine[i] - 25;
            if(remAmt <= tac){
                tac -= remAmt;
                tac +=peopleInLine[i];
            }
            else{
                return "NO";
            }
        }
        return "YES";
    }
}
