import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner oScanner=new Scanner(System.in);
        while (true) {
            System.out.println("1.Inovoice_wall..");
            System.out.println("2.Inovoice_wf..");
            System.out.println("3.Inovoice_wfwoh..");
            System.out.println("4.Inovoice_wh..");
            System.out.println("5.Inovoice_whwpf..");
            System.out.println("6.Inovoice_woall..");
            System.out.println("Enter your choice:");
            int choice=oScanner.nextInt();
        
       switch (choice) 
       {
        case 1:Inovoice Inovoice_wall=Foctory.getInovoicetype(1);
               System.out.println(Inovoice_wall.getInovoice());
               break;
        case 2:Inovoice Inovoice_wf=Foctory.getInovoicetype(2);
              System.out.println(Inovoice_wf.getInovoice());
              break;
        case 3:Inovoice Inovoice_wfwoh=Foctory.getInovoicetype(3);
               System.out.println(Inovoice_wfwoh.getInovoice());
               break;
       case 4:Inovoice Inovoice_wh=Foctory.getInovoicetype(4);
              System.out.println(Inovoice_wh.getInovoice());
              break;
        case 5:Inovoice Inovoice_woall=Foctory.getInovoicetype(5);
              System.out.println(Inovoice_woall.getInovoice());
              break;
        case 6:Inovoice Inovoice_whwof=Foctory.getInovoicetype(6);
             System.out.println(Inovoice_whwof.getInovoice());
             break;
        default:
               System.out.println("please Enter valide choice...!");
            break;
       }
        
    }
    }
}
