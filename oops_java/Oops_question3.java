package oops_java;
class Author{
	String name;
	String email;
	char gender;
	public void setAuthor(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getAuthor() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
}
class Book{
	String nam;
	String AuthorN;
	double price;
	int qtyInStock;
	public void setBook(String nam,String AuthorN,double price,int qtyInStock) {
		this.nam=nam;
		this.AuthorN=AuthorN;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getBookn() {
		return nam;
	}
	public String getBookA() {
		return AuthorN;
	}
	public double getPrice() {
		return price;
	}
	public int getqty() {
		return qtyInStock;
	}
	
}
public class Oops_question3 {

	public static void main(String[] args) {
	  Author a=new Author();
	  Book b=new Book();
	  a.setAuthor("Teju","mlteju",'F');
	  b.setBook("Novel","Tejaswi",10000,131);
	  System.out.println("Name of the Author "+a.getAuthor());
	  System.out.println("Author email"+a.getEmail());
	  System.out.println("Gender of the Author"+a.getGender());
	  System.out.println("Name of the Book "+b.getBookA());
	  System.out.println("Price of the book "+b.getPrice());
	  System.out.println("Qty in stock"+b.getqty());
	  
	}

}
