package com.exam;

import java.sql.Date;

public class Transaction {
	int tid;
	String ttype;
	int quantity;
	Date tdate;
	double price;
	double vat;
	double tax;
	double discount;
	double totalprice;

	public Transaction() {
		super();
	}

	public Transaction(int tid) {
		super();
		this.tid = tid;
	}

	public Transaction(int tid, String ttype, int quantity, Date tdate, double price, double vat, double tax,
			double discount, double totalprice) {
		super();
		this.tid = tid;
		this.ttype = ttype;
		this.quantity = quantity;
		this.tdate = tdate;
		this.price = price;
		this.vat = vat;
		this.tax = tax;
		this.discount = discount;
		this.totalprice = totalprice;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", ttype=" + ttype + ", quantity=" + quantity + ", tdate=" + tdate
				+ ", price=" + price + ", vat=" + vat + ", tax=" + tax + ", discount=" + discount + ", totalprice="
				+ totalprice + "]";
	}

}
