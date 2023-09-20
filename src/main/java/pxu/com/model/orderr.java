package pxu.com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderr")
public class orderr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id_orderr")
	private int id_orderr;
	
	
	@Column(name="date")
	private Date date;

	@Column(name="status")
	private String status;

	public int getId_orderr() {
		return id_orderr;
	}

	public void setId_orderr(int id_orderr) {
		this.id_orderr = id_orderr;
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

	public orderr() {
		super();
	}

	public orderr(int id_orderr, Date date, String status) {
		super();
		this.id_orderr = id_orderr;
		this.date = date;
		this.status = status;
	}
	

	
}
