
public class Test {

	public static void main(String[] args) {
		//---------------ผัดซีอิ๊ว-------------------------
		Padsioiw p1 =new Padsioiw();
		String pm1=p1.food("หมู");
		int pp1=p1.price(30);
		
		Padsioiw p2 =new Padsioiw();
		String pm2=p2.food("ทะเล");
		int pp2=p2.price(40);
		//----------------ผัดไท-----------------------
		Padtai pt1 =new Padtai();
		String ptm1=pt1.food("หมู");
		int ptp1=pt1.price(30);
		
		Padtai pt2 =new Padtai();
		String ptm2=pt2.food("ทะเล");
		int ptp2=pt2.price(40);
		
		Padtai pt3 =new Padtai();
		String ptm3=pt3.food("กุ้งสด");
		int ptp3=pt3.price(50);
		//--------------ก๋วยเตี๋ยว------------------------
		noodle np=new noodle();
		String npm=np.food("แห้ง");
		int npp=np.price(30);
		
		noodle np2=new noodle();
		String npm2=np2.food("น้ำ");
		int npp2=np2.price(30);
		
		noodle np3=new noodle();
		String npm3=np3.food("ต้มยำ");
		int npp3=np3.price(35);
		
		/* ตัวแปร		  ความหมาย
		 * pm 		= 1)ผัดซีอิ๊วหมู 2)ทะเล
		 * pp ราคา  	= 1)30  2)40  บาท 
		 * ptp		= 1)ผัดไทหมู 2)ทะเล 3)กุ้งสด
		 * ptm ราคา	= 1)30 2)40 3)50 บาท
		 * npm		= 1)แห้ง  2)น้ำ   3)ต้มยำ
		 * npp ราคา	= 1)30 2)30 3)35 บาท
		 * 
		 * */
	
	STD sun =new STD();
	sun.name("ซัน",npm,npp);
	np.taste("น้ำตาล 2ช้อน");
	
	/*
	STD jame = new STD();
	jame.name("เจมส์");
	jame.food("ผัดซีอิ๊ว");
	jame.setprice(jame.price(30));
	STD ploy = new STD();
	ploy.name("พลอย");
	ploy.food("ก๋วยเตี๋ยว");
	ploy.setprice(ploy.price(30));
	STD wit = new STD();
	wit.name("วิท");
	wit.food("ข้าวผัดกุ้ง");
	wit.setprice(wit.price(30));
	
	System.out.println("ราคารวม : "+(wit.price(30)+jame.price(30)+sun.price(30)+ploy.price(30)));*/
	}

}
