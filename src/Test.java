
public class Test {

	public static void main(String[] args) {
		//---------------�Ѵ������-------------------------
		Padsioiw p1 =new Padsioiw();
		String pm1=p1.food("���");
		int pp1=p1.price(30);
		
		Padsioiw p2 =new Padsioiw();
		String pm2=p2.food("����");
		int pp2=p2.price(40);
		//----------------�Ѵ�-----------------------
		Padtai pt1 =new Padtai();
		String ptm1=pt1.food("���");
		int ptp1=pt1.price(30);
		
		Padtai pt2 =new Padtai();
		String ptm2=pt2.food("����");
		int ptp2=pt2.price(40);
		
		Padtai pt3 =new Padtai();
		String ptm3=pt3.food("���ʴ");
		int ptp3=pt3.price(50);
		//--------------���������------------------------
		noodle np=new noodle();
		String npm=np.food("���");
		int npp=np.price(30);
		
		noodle np2=new noodle();
		String npm2=np2.food("���");
		int npp2=np2.price(30);
		
		noodle np3=new noodle();
		String npm3=np3.food("�����");
		int npp3=np3.price(35);
		
		/* �����		  ��������
		 * pm 		= 1)�Ѵ��������� 2)����
		 * pp �Ҥ�  	= 1)30  2)40  �ҷ 
		 * ptp		= 1)�Ѵ���� 2)���� 3)���ʴ
		 * ptm �Ҥ�	= 1)30 2)40 3)50 �ҷ
		 * npm		= 1)���  2)���   3)�����
		 * npp �Ҥ�	= 1)30 2)30 3)35 �ҷ
		 * 
		 * */
	
	STD sun =new STD();
	sun.name("�ѹ",npm,npp);
	np.taste("��ӵ�� 2��͹");
	
	/*
	STD jame = new STD();
	jame.name("����");
	jame.food("�Ѵ������");
	jame.setprice(jame.price(30));
	STD ploy = new STD();
	ploy.name("����");
	ploy.food("���������");
	ploy.setprice(ploy.price(30));
	STD wit = new STD();
	wit.name("�Է");
	wit.food("���ǼѴ���");
	wit.setprice(wit.price(30));
	
	System.out.println("�Ҥ���� : "+(wit.price(30)+jame.price(30)+sun.price(30)+ploy.price(30)));*/
	}

}
