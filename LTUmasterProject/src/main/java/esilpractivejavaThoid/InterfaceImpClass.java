package esilpractivejavaThoid;

public class InterfaceImpClass extends AbstractDemoMain implements InterfacaAdemo,InterfaceCDemo,InterfaceBDemo{

	private double power;


	@Override
	public float reminder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double powerOff(double Base) {
        Math.pow(Base, power);
		return 0;
	}


	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multi1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float division1() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void add(int a, int b) {
		super.add(a, b);
		
		show(45);
		
	}
	

	
	
	

}
