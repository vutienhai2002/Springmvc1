package pxu.com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_cart")
	private int id_cart;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="status")
	private String status;

	public int getId_cart() {
		return id_cart;
	}

	public void setId_cart(int id_cart) {
		this.id_cart = id_cart;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public cart() {
		super();
	}

	public cart(int id_cart, Date date, String status) {
		super();
		this.id_cart = id_cart;
		this.date = date;
		this.status = status;
	}
	
	
}
