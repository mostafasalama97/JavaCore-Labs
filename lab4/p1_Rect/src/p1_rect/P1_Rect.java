package p1_rect;


/**
 *
 * @author gt
 */
public class P1_Rect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Rectangle r1 = new Rectangle();
//        
//        System.out.println("rect length: " + r1.getLength());
//        System.out.println("rect width: " + r1.getWidth());
//        System.out.println("---------------------------");
//        r1.setLength(5);
//        r1.setWidth(10);
//         System.out.println("rect length: " + r1.getLength());
//        System.out.println("rect width: " + r1.getWidth());
//        System.out.println("---------------------------");
//      
//                System.out.println("---------------------------");
//
//        System.out.println("rect length: " + r1.getLength());
//        System.out.println("rect width: " + r1.getWidth());
//      
//        System.out.println("---------------------------");
//        Car c1 = new Car();
//        c1.setMake("BMW");
//        c1.setYearMade("2011");
//        System.out.println(c1.getMake());
//        System.out.println(c1.getYearMade());

            Rectangle r1 = new Rectangle(10,20);
             Rectangle r2 = new Rectangle(10,120);
             
             if(r1.isEqual(r2)){
                 System.out.println("objects are equals");
             }else{
                 System.out.println("objects not equals");
             }
            
    }
}

