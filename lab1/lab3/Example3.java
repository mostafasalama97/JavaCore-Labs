public class Example3 {
	public static void main(String[] args) {
		if(args.length == 2){
            int num = Integer.parseInt(args[0]);
			for(int i=1; i <= num ; i++){
				System.out.println("your enterd string is: " + args[1]);
			} 
		}
	}
}