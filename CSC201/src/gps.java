public class gps {
	public static void main(String[] args) {
		int random, yvalue, xvalue;
		double total;
		
		yvalue = 0;
		xvalue = 0;
		
		for (int i = 1;  i<=12; ++i) {
			random = (int)(Math.random()*4);
			System.out.println(random);
			
		switch (random) {
		case 0: yvalue = yvalue-5; //SOUTH WAY
			break;
		case 1:  xvalue = xvalue-5; //WEST WAY
			break;
		case 2:yvalue = yvalue +5; // NORTH WAY
			break;
		case 3: xvalue = xvalue+5; // EAST WAY
			break;
	}
		
		System.out.println("Y-Value is at the coordinate of:" +yvalue);
		System.out.println("X-Value is at the coordinate of:" +xvalue);
		total = Math.sqrt(Math.pow(yvalue, 2)+(Math.pow(xvalue, 2)));
		System.out.println("The distance from origin to the final location is "+ total +" miles within an hour.");

}
}
}