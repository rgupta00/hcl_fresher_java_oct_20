package com.day3.session2.ex25;

class Foof{
	public String getObject() {
		return null;
	}
}


class FoofV2 extends Foof{
	@Override
	public Object getObject() {
		return null;
	}
}

/*
class Milk{
	public int spoilTime() {
		return 16;
	}
}
class PasteurizedMilk extends Milk{
	public int spoilTime() {
		return 16*3;
	}
}

class KrishnaD{
	public Milk getMilk() {
		return new Milk();
	}
}

class KrishnaDImprovedVersion extends KrishnaD{
	@Override
	public PasteurizedMilk getMilk() {
		return new PasteurizedMilk();
	}
}




*/


public class DemoCovarientReturnType {

	public static void main(String[] args) {
		
	}
}
