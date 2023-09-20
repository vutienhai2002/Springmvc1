package pxu.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderrdetail")
public class orderrdetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_orderrdetail")
	private int id_orderrdetail;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private int price;

	@ManyToOne
	@JoinColumn(name = "id_orderr", referencedColumnName = " id_orderr")
	private orderr orderr;

	@ManyToOne
	@JoinColumn(name = "product", referencedColumnName = " id_product")
	private product product;

	public int getId_orderrdetail() {
		return id_orderrdetail;
	}

	public void setId_orderrdetail(int id_orderrdetail) {
		this.id_orderrdetail = id_orderrdetail;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public orderr getOrderr() {
		return orderr;
	}

	public void setOrderr(orderr orderr) {
		this.orderr = orderr;
	}

	public product getProduct() {
		return product;
	}

	public void setProduct(product product) {
		this.product = product;
	}

	public orderrdetail(int id_orderrdetail, int quantity, int price, pxu.com.model.orderr orderr,
			pxu.com.model.product product) {
		super();
		this.id_orderrdetail = id_orderrdetail;
		this.quantity = quantity;
		this.price = price;
		this.orderr = orderr;
		this.product = product;
	}

	public orderrdetail() {
		super();
	}

}
