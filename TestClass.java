package heap;

public class TestClass{
	public static void main(String[] args) {
		MaxHeap a = new MaxHeap(4);
		System.out.println(a.getSizeArr());
		a.insert(-17);
		a.insert(-36);
		a.insert(-1);
		a.insert(-100);
		a.insert(-25);
		
		a.toString();
		a.toStringLevel();
		
		//System.out.println(a.toStringLevel());
		//System.out.println(a.getSizeArr());
		
		//a.deleteMax();
		//System.out.println(a.deleteMax());

		int[] b =  {979749, -942943, 471557, 541806, 142504, 541806, -97694, 541806, -969944, 724691};
		
		MaxHeap c = new MaxHeap(10);
		c.insert(979749);
		c.insert(-942943);
		c.insert(471557);
		c.insert(541806);
		c.insert(142504);
		c.insert(541806);
		c.insert(-97694);
		c.insert(541806);
		c.insert(-969944);
		c.insert(724691);
		
		
		//c.deleteMax();
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
//		System.out.println(c.deleteMax());
		
		
		int[] bb = {863318, 219558, 870944, 978960, 388802, 430136, 187111, 870944, -811599, -338604, -441339, -338604, -585010, 457001,-181743};
		
		
		MaxHeap d = new MaxHeap(10);
		d.insert(863318);
		d.insert(219558);
		d.insert(870944);
		d.insert(978960);
		d.insert(388802);
		d.insert(430136);
		d.insert(187111);
		d.insert(870944);
		d.insert(-811599);
		d.insert(-338604);
		d.insert(-441339);
		d.insert(-338604);
		d.insert(-585010);
		d.insert(457001);
		d.insert(-181743);
		
		
//		d.deleteMax();
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
//		System.out.println(d.deleteMax());
		
		
	
	}
}