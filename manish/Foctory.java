import java.util.Scanner;
class Foctory  {
    public static Inovoice getInovoicetype()
    {
		Inovoice inv=null;
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
        case 1:inv=new Inovoice_wall();
              
               break;
        case 2:inv=new Inovoice_wfwoh();
              
              break;
        case 3:inv=new Inovoice_wh();
              
               break;
       case 4:inv= new Inovoice_whwof();

              break;
        case 5:inv=new Inovoice_wf();

              break;
        case 6:inv=new Inovoice_woall();
       
             break;
        default:
               System.out.println("please Enter valide choice...!");
            break;
       }
        return inv;
    }
      
        
    }
}
