package me.baobo.cm;

public class Saler extends Employee {
	private double salesNum; // ������Ա�����۶�

	Saler(String name, long salesNum) {
		super(name);
		id = ID;
		this.salesNum = salesNum;
	}

	public double getPay() {
		 return salesNum*0.04;
//		return Math.round(salesNum * 0.04); // ����Math.round()������������
	}

	public String toString() {
		return name + " " + id + " " + getPay();
	}
}
