package learningGD;


	 class Final
	 {
		
		 int i=10;
		 final double PIE=3.1465;
		
	final void Operation()
		{
			System.out.println("Pie value is:"+PIE);
			
		}

	}
	 
	class Final3 extends Final
	{
		int i=20;
	  final double PIE=3.165;
		
		void Operation(int j)
		{
		System.out.println(" "+PIE+ j);
		}
		public static void main(String[] args) {
			Final3 f=new Final3();
			f.Operation();
			//Final.PIE=120;

	}
	}
