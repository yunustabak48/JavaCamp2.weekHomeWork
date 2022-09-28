package classesWithAttirbutes;

public class main {

	public static void main(String[] args) {
		Product product= new Product(1,"Laptop","Asusj Laptop",3000,2,"Siyah");
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product); 
		System.out.println(product.getKod());
			
		
		

	}

}
