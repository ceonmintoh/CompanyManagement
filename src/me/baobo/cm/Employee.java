package me.baobo.cm;

public class Employee {
	public String name; // Ա������
	public long id; // Ա�����
	public static int ID = 1000; // Ա����Ż���Ϊ1000

	Employee(String name) {
		this.name = name;
		ID++;
	}
}
