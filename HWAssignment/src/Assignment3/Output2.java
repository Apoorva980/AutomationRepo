package Assignment3;

public class Output2 {
	

		public static void main(String[] args) {

		try{
		int o[] = new int[2];
		o[3]=23;
		o[1]=33;
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		System.out.println(o[1]);
		}

		}



