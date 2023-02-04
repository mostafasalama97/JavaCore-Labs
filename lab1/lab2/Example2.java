public class Example2 {
	public static void main(String[] args) {
		if(args.length >= 0){
			if(args[0].equals("corejava")){
				System.out.println("your enterd string is: " + args[0]);
			} else {
				System.out.println("fault string your enterd string is: " + args[0]);
			}
		}
	}
}