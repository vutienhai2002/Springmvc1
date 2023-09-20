//package pxu.com.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="cartdetail")
//public class cartdetail {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)	
//	@Column(name="id_cartdetail")
//	private int id_cartdetail;
//	
//	@Column(name="id_cart")
//	private int id_cart;
//	
//	@Column(name="id_product")
//	private int id_product;
//	
//	@Column(name="quantity")
//	private int quantity;
//	
//	@Column(name="price")
//	private float price;
//	
//	
//	@ManyToOne
//	@JoinColumn(name="id_cart", referencedColumnName = " id_cart")
//	private cart cart;
//
//	@ManyToOne
//	@JoinColumn(name="id_product", referencedColumnName = " id_product")
//	private product product;
//
//	public int getId_cartdetail() {
//		return id_cartdetail;
//	}
//
//	public void setId_cartdetail(int id_cartdetail) {
//		this.id_cartdetail = id_cartdetail;
//	}
//
//	public int getId_cart() {
//		return id_cart;
//	}
//
//	public void setId_cart(int id_cart) {
//		this.id_cart = id_cart;
//	}
//
//	public int getId_product() {
//		return id_product;
//	}
//
//	public void setId_product(int id_product) {
//		this.id_product = id_product;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public float getPrice() {
//		return price;
//	}
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
//
//	public cart getCart() {
//		return cart;
//	}
//
//	public void setCart(cart cart) {
//		this.cart = cart;
//	}
//
//	public product getProduct() {
//		return product;
//	}
//
//	public void setProduct(product product) {
//		this.product = product;
//	}
//
//	public cartdetail() {
//		super();
//	}
//
//	public cartdetail(int id_cartdetail, int id_cart, int id_product, int quantity, float price,
//			pxu.com.model.cart cart, pxu.com.model.product product) {
//		super();
//		this.id_cartdetail = id_cartdetail;
//		this.id_cart = id_cart;
//		this.id_product = id_product;
//		this.quantity = quantity;
//		this.price = price;
//		this.cart = cart;
//		this.product = product;
//	}
//	
//	
//	
//}
