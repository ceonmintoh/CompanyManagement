package me.baobo.cm;

public class Technician extends Employee {
	private double workHours; // ������Ա�Ĺ���Сʱ��

	Technician(String name, long workHours) {
		super(name);
		id = ID;
		this.workHours = workHours;
	}

	public double getPay() {
		return workHours * 100;
	}

	public String toString() {
		return name + " " + id + " " + getPay();
	}
}
