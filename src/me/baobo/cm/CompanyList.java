package me.baobo.cm;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompanyList {

	List<Employee> cl = new ArrayList<>(); // ��ʼ��һ��ArrayList���ϣ����������Ա��Ϣ

	// �����Ա
	public void add(Employee e) {
		cl.add(e);
	}

	// ɾ����Ա
	public void remove(String name) { // ͨ������ɾ����Ա
		// System.out.println("Step 5");
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).name.matches(name)) { // ���ﲻ��д��cl.get(i).name==name�������޷�ƥ��ɹ�
				// System.out.println("Step 6");
				cl.remove(cl.get(i));
				// System.out.println("Step 7");
				break;
			}
		}
	}

	public void remove(long id) { // ͨ�����ɾ����Ա
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).id == id) {
				cl.remove(cl.get(i));
				break;
			}
		}
	}

	// �޸�Ա���������ͱ��
	public void modify(long id1, String name, long id2) {
		boolean okToMod = true; // �жϱ�ʶ������ȷ���Ƿ��ܹ��޸�Ա����Ϣ
		for (int j = 0; j < cl.size(); j++) {
			if (id1 == id2 || cl.get(j).name.matches(name) || cl.get(j).id == id2) { // �޸ĺ��Ա������name���߱��id�������������ͬ�����޸�
				okToMod = false; // false��ʾ���޸�
				break;
			}
		}
		if (okToMod) {
			for (int i = 0; i < cl.size(); i++) {
				if (cl.get(i).id == id1) { // ���ұ��Ϊid1��Ա��
					if (name != null) { // �޸ĺ�name��Ϊ��ֵ���޸ģ�Ϊ��ֵ�򲻱仯
						cl.get(i).name = name;
					}
					// for(int j=0;j<cl.size();j++){ //��������
					// if(cl.get(j).id==id2){ //�޸ĺ��id��������������ͬ
					// break;
					// }else{
					cl.get(i).id = id2;
					// }
					// }
				}
				// if(cl.get(i).id==id2){
				// break;
				// }else{
				// cl.get(i).id=id2;
				// }
			}
		}
	}

	// ��ѯ������Ա
	public String queryAll() {
		String tmp = "";
		for (Employee e : cl) {
			// System.out.println(e.toString());
			tmp += " { " + e.toString() + " } ";
		}
		return tmp;
	}

	// ��ѯԱ��������Ϣ������ͨ����������Ų�ѯ
	public String query(String name) { // ͨ��������ѯ
		String tmp = "";
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).name.matches(name)) { // ���ﲻ��д��cl.get(i).name==name�������޷�ƥ��ɹ�
				// System.out.println(cl.get(i));
				tmp = cl.get(i).toString();
			}
		}
		return tmp;
	}

	public String query(long id) { // ͨ����Ų�ѯ
		String tmp = "";
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).id == id) {
				// System.out.println(cl.get(i));
				tmp = cl.get(i).toString();
			}
		}
		return tmp;
	}

	// ��ѯ����Ա����Ϣ�����洢��EmployeeData.txt�ļ�
	public String save() {
		String tmp = "Failed to save!"; // Ĭ�Ϸ���ʧ�����
		try {
			FileWriter fw = new FileWriter("EmployeeData.txt"); // �ļ�����ַ���
			BufferedWriter bw = new BufferedWriter(fw); // �������������
			for (Employee e : cl) {
				bw.write(e.toString()); // ���ļ���д������
				bw.newLine(); // ����
			}
			bw.flush(); // ǿ�ƽ��������е����ݷ��ͳ�ȥ,���صȵ���������
			bw.close();
			fw.close();
			// System.out.println("Saved Successfully!");
			tmp = "Saved Successfully!"; // ִ�гɹ����سɹ����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmp;
	}
}
