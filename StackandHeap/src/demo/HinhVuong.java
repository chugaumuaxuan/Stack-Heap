package demo;

public class HinhVuong {
	public void ChuVI() {
		System.out.println("Chu vi");
	}
	
	public static void XinChao(HinhVuong hv) {	//void XinChao duoc luu trong stack
		//doi so hv duoc luu trong stack
		
		String s = "xin chao";	//doi tuong String luu trong Heap
		//bien tham chieu s nam trong bo nho Stack	
		
		System.out.println("xin chao");
		hv.ChuVI(); //lenh goi ham duoc luu trong bo nho Stack
	}
	
	public static void main(String[] args) {	//khoi tao trong Stack
		
		HinhVuong square = new HinhVuong(); //object HinhVuong khoi tao trong bo nho Heap
		//bien tham chieu square luu trong stack
		
		int x = 10;		 //khoi tao trong Stack
		System.out.println(x);
		
		
		XinChao(square); 
	
	}

}
