package acme.server.entity;

// Generated 30/11/2011 12:52:12 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Loan generated by hbm2java
 */
public class Loan implements java.io.Serializable {

	private long idLoan;
	private Customer customer;
	private Material material;
	private String status;
	private String comments;
	private Date loanDate;
	private Date returnDate;
	private Ticket ticket;

	public Loan() {
	}

	public Loan(long idLoan) {
		this.idLoan = idLoan;
	}

	public Loan(long idLoan, Customer customer, Material material,
			String status, String comments, Date loanDate, Date returnDate,
			Ticket ticket) {
		this.idLoan = idLoan;
		this.customer = customer;
		this.material = material;
		this.status = status;
		this.comments = comments;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
		this.ticket = ticket;
	}

	public long getIdLoan() {
		return this.idLoan;
	}

	public void setIdLoan(long idLoan) {
		this.idLoan = idLoan;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getLoanDate() {
		return this.loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
