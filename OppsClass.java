import java.util.Scanner;

class Pane{
    String Color;
    String Shape;
    String Brand;
    String Dessign_by;

    public void functionality(){
        System.out.println("Its Simple Pane To Wring");
    }
    
}

class OppsClass{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Object Section
        Pane saino=new Pane();
        saino.Color="Blue";
        saino.Shape="Simple and User Freandly";
        saino.Brand="Saino Softtek";
        saino.Dessign_by="Saino Softtek";

        Pane parker=new Pane();
        parker.Color="Chrome color";
        parker.Dessign_by="Luxor Writing Instruments Pvt. Ltd";
        parker.Shape="ergonomic shape";
        parker.Brand="Parker";

        Pane uniball=new Pane();
        uniball.Brand="Uniball";
        uniball.Color="Assorted";
        uniball.Dessign_by="Mitsubishi Pencil Co";
        uniball.Shape="Stick Ballpoint Pens";

        // Object Section Over
        // Basic Functionality
               
        
        int item= menuDisplay();
        switch (item) {
            case 1:
                Branding(saino);
                Branding(parker);
                Branding(uniball);
                break;
            case 2:
                Color(saino);
                Color(parker);
                Color(uniball);
            break;

            case 3:
                Description(saino);
                Description(parker);
                Description(uniball);
            break;
            default:
                System.out.println("Try Again");
                break ;
        }
        
        
    }
    public static void menues(int a){
        
    }
    public static int menuDisplay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("1.Which Brand\n2.Which Color\n3.Show Description\nEnter Your Choice");
        int item = sc.nextInt();
        return item;

    }
    public static void Branding(Pane a){
        System.out.println("Brand : "+a.Brand);
    }
    
    public static void Color(Pane a) {
        System.out.println("Color : " + a.Color);
    }
    
    public static void Description(Pane a) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Brand   : " + a.Brand);
        System.out.println("Shape   : " + a.Shape);
        System.out.println("Color   : " + a.Color);
        System.out.println("Desiner : " + a.Dessign_by);
        System.out.println("--------------------------------------------------------");
        a.functionality();

    }
}