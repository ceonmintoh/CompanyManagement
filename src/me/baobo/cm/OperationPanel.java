package me.baobo.cm;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class OperationPanel extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L; // �Զ����ɵ����л���Ϊ�˱��ְ汾�ļ����ԣ����Բ�д�������о���

	JLabel addIt = new JLabel("<html><font color=red>�����Ա</font></html>");
	JLabel managerName = new JLabel("����������");
	JTextField managerNameText = new JTextField(10);
	JButton addManager = new JButton("���");

	JLabel salerName = new JLabel("����������");
	JTextField salerNameText = new JTextField(10);
	JLabel salerSales = new JLabel("���۶�ȣ�");
	JTextField salerSalesText = new JTextField(10);
	JButton addSaler = new JButton("���");

	JLabel technicianName = new JLabel("����������");
	JTextField technicianNameText = new JTextField(10);
	JLabel technicianWork = new JLabel("����ʱ����");
	JTextField technicianWorkText = new JTextField(10);
	JButton addTechnician = new JButton("���");

	JLabel removeIt = new JLabel("<html><font color=red>ɾ����Ա</font></html>");
	JLabel removeID = new JLabel("��Ա��ţ���ѡ����");
	JTextField removeIDText = new JTextField(10);
	JLabel removeName = new JLabel("��Ա������");
	JTextField removeNameText = new JTextField(10);
	JButton removeHim = new JButton("ɾ��");

	JLabel modifyIt = new JLabel("<html><font color=red>�޸���Ա</font></html>");
	JLabel modifyID_Before = new JLabel("��Ա��ţ�");
	JTextField modifyIDText_Before = new JTextField(10);
	JLabel modifyID_After = new JLabel("�޸ı��Ϊ��");
	JTextField modifyIDText_After = new JTextField(10);
	JLabel modifyName = new JLabel("�޸�����Ϊ��");
	JTextField modifyNameText = new JTextField(10);
	JButton modifyHim = new JButton("�޸�");

	JLabel queryIt = new JLabel("<html><font color=red>��ѯ��Ա</font></html>");
	JLabel queryID = new JLabel("��Ա��ţ���ѡ����");
	JTextField queryIDText = new JTextField(10);
	JLabel queryName = new JLabel("��Ա������");
	JTextField queryNameText = new JTextField(10);
	JButton queryHim = new JButton("��ѯ");
	JButton queryThem = new JButton("��ѯ����");
	JButton queryAndSave = new JButton("��ѯ������");

	JLabel showIt = new JLabel("<html><font color=blue>��ʾ����</font></html>");
	JEditorPane jep = new JEditorPane(); // ��ʼ������ʾ����

	CompanyList cl0 = new CompanyList(); // ��ʼ��CompanyList��

	// ���췽��
	public OperationPanel() {
		// setTitle("CompanyManage");
		// setResizable(false);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel01 = new JPanel(); // panel01��һ�������
		panel01.setLayout(new BoxLayout(panel01, BoxLayout.Y_AXIS)); // ����panel01�Ĳ���Ϊ
																		// BoxLayout��BoxLayoutΪ��ֱ����
		panel01.add(Box.createVerticalStrut(10)); // ����һ�����ɼ��� Strut���Ӷ��Զ�������һ���Ŀռ�
		JPanel panel01_01 = new JPanel(); // panel01_01��һ������壬�������ù���ģ��ı��⣨����˴�addIt��Ӧ�ġ������Ա����ǩ��
		panel01_01.add(addIt);
		JPanel panel01_02 = new JPanel(); // panel01_02Ҳ��һ������壬��������box1
		Box box1 = Box.createHorizontalBox(); // ����һ����������ʾ�������box1������ˮƽ���������Ͱ�ť
		panel01_02.setLayout(new BoxLayout(panel01_02, BoxLayout.X_AXIS)); //// ����panel01_02�Ĳ���Ϊ
																			//// BoxLayout��BoxLayoutΪˮƽ����
		panel01_02.add(box1); // ��box1����panel01_02��
		// panel01_02.add(managerName);
		// panel01_02.add(managerAddName);
		// panel01_02.add(addManager);
		// panel01_02.add(salerName);
		// panel01_02.add(salerAddName);
		// panel01_02.add(salerSales);
		// panel01_02.add(salerAddSales);
		// panel01_02.add(addSaler);
		// panel01_02.add(technicianName);
		// panel01_02.add(technicianAddName);
		// panel01_02.add(technicianWork);
		// panel01_02.add(technicianAddWork);
		// panel01_02.add(addTechnician);
		box1.add(managerName); // �������Ͱ�ť�ȿؼ�����box1��
		box1.add(managerNameText);
		box1.add(addManager);
		box1.add(salerName);
		box1.add(salerNameText);
		box1.add(salerSales);
		box1.add(salerSalesText);
		box1.add(addSaler);
		box1.add(technicianName);
		box1.add(technicianNameText);
		box1.add(technicianWork);
		box1.add(technicianWorkText);
		box1.add(addTechnician);
		panel01.add(panel01_01); // ��panel01_01����panel01��
		panel01.add(panel01_02); // ��panel01_02����panel01��
		panel01.add(Box.createVerticalStrut(10)); // ����һ�����ɼ��� Strut���Ӷ��Եײ�����һ���Ŀռ�

		JPanel panel02 = new JPanel();
		panel02.setLayout(new BoxLayout(panel02, BoxLayout.Y_AXIS));
		panel02.add(Box.createVerticalStrut(10));
		JPanel panel02_01 = new JPanel();
		panel02_01.add(removeIt);
		JPanel panel02_02 = new JPanel();
		Box box2 = Box.createHorizontalBox();
		panel02_02.setLayout(new BoxLayout(panel02_02, BoxLayout.X_AXIS));
		panel02_02.add(box2);
		box2.add(removeID);
		box2.add(removeIDText);
		box2.add(removeName);
		box2.add(removeNameText);
		box2.add(removeHim);
		panel02.add(panel02_01);
		panel02.add(panel02_02);
		panel02.add(Box.createVerticalStrut(10));

		JPanel panel03 = new JPanel();
		panel03.setLayout(new BoxLayout(panel03, BoxLayout.Y_AXIS));
		panel03.add(Box.createVerticalStrut(10));
		JPanel panel03_01 = new JPanel();
		panel03_01.add(modifyIt);
		JPanel panel03_02 = new JPanel();
		Box box3 = Box.createHorizontalBox();
		panel03_02.setLayout(new BoxLayout(panel03_02, BoxLayout.X_AXIS));
		panel03_02.add(box3);
		box3.add(modifyID_Before);
		box3.add(modifyIDText_Before);
		box3.add(modifyID_After);
		box3.add(modifyIDText_After);
		box3.add(modifyName);
		box3.add(modifyNameText);
		box3.add(modifyHim);
		panel03.add(panel03_01);
		panel03.add(panel03_02);
		panel03.add(Box.createVerticalStrut(10));

		JPanel panel04 = new JPanel();
		panel04.setLayout(new BoxLayout(panel04, BoxLayout.Y_AXIS));
		panel04.add(Box.createVerticalStrut(10));
		JPanel panel04_01 = new JPanel();
		panel04_01.add(queryIt);
		JPanel panel04_02 = new JPanel();
		Box box4 = Box.createHorizontalBox();
		panel04_02.setLayout(new BoxLayout(panel04_02, BoxLayout.X_AXIS));
		panel04_02.add(box4);
		box4.add(queryID);
		box4.add(queryIDText);
		box4.add(queryName);
		box4.add(queryNameText);
		box4.add(queryHim);
		box4.add(queryThem);
		box4.add(queryAndSave);
		panel04.add(panel04_01);
		panel04.add(panel04_02);
		panel04.add(Box.createVerticalStrut(10));

		JPanel panel05 = new JPanel();
		panel05.setLayout(new BoxLayout(panel05, BoxLayout.Y_AXIS));
		panel05.add(Box.createVerticalStrut(10));
		JPanel panel05_01 = new JPanel();
		panel05_01.add(showIt);
		JPanel panel05_02 = new JPanel();
		Box box5 = Box.createVerticalBox();
		panel05_02.setLayout(new BoxLayout(panel05_02, BoxLayout.X_AXIS));
		// JTextArea jta = new JTextArea(100,100);
		// jta.setLineWrap(true);
		// jta.setWrapStyleWord(true);
		// jta.setPreferredSize(new Dimension(200, 200));
		// jta.setTabSize(10);
		// JEditorPane jep = new JEditorPane();
		jep.setPreferredSize(new Dimension(100, 100));
		JScrollPane jsp = new JScrollPane(jep); // ��ʼ��һ��JScrollPane���������á���ʾ����
		box5.add(jsp);
		panel05_02.add(box5);
		panel05.add(panel05_01);
		panel05.add(panel05_02);
		panel05.add(Box.createVerticalStrut(10));

		// ���� panelContainer
		JPanel panelContainer = new JPanel();
		// panelContainer �Ĳ���Ϊ GridBagLayout
		panelContainer.setLayout(new GridBagLayout()); // panelContainer����GridBagLayout���в���

		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.weightx = 1.0;
		c1.weighty = 0;
		c1.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel01, c1);

		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 1;
		c2.weightx = 1.0;
		c2.weighty = 0;
		c2.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel02, c2);

		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 0;
		c3.gridy = 2;
		c3.weightx = 1.0;
		c3.weighty = 0;
		c3.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel03, c3);

		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 0;
		c4.gridy = 3;
		c4.weightx = 1.0;
		c4.weighty = 0;
		c4.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel04, c4);

		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 0;
		c5.gridy = 4;
		c5.weightx = 1.0;
		c5.weighty = 0;
		c5.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel05, c5);

		JFrame frame = new JFrame("��ҵ��Ա��Ϣ����ϵͳ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �����û��ڴ˴����Ϸ���"close"
																// ʱĬ��ִ�йرղ���
		panelContainer.setOpaque(true); // ���ÿؼ��Ƿ�͸���ģ�true��ʾ��͸��
		frame.setSize(new Dimension(1000, 400)); // ���ô����С����1000����400
		frame.setContentPane(panelContainer); // ����panelContainerΪ�������
		frame.setVisible(true); // ���ô���ɼ��ԣ�trueΪ�ɼ�
		frame.setResizable(false); // ���ô������죬falseΪ������

		// ��ÿ����ť��Ӽ�����
		addManager.addActionListener(this);
		addSaler.addActionListener(this);
		addTechnician.addActionListener(this);
		removeHim.addActionListener(this);
		modifyHim.addActionListener(this);
		queryHim.addActionListener(this);
		queryThem.addActionListener(this);
		queryAndSave.addActionListener(this);

	}

	// main����
	public static void main(String[] args) {

		new OperationPanel(); // ��ʼ������
		// op.pack();
		// op.setVisible(true);

		// Employee m = new Manager("������");
		// System.out.println(m.toString());
		//
		// Employee s = new Saler("������",5000);
		// System.out.println(s.toString());
		//
		// Employee t = new Technician("���",200);
		// System.out.println(t.toString());

		// CompanyList cl0 = new CompanyList();
		// cl0.add(m);
		// cl0.add(s);
		// cl0.add(t);
		// cl0.remove("������");
		// cl0.remove(1003);
		// cl0.queryAll();
		// cl0.query("T");
		// cl0.query(1001);
		// cl0.modify(1002,"M",1002);
		// cl0.queryAll();
		// cl0.save();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// CompanyList cl0 = new CompanyList();
		// ��Ӿ���
		if (e.getSource() == addManager) {
			String tmp = managerNameText.getText().toString(); // ��ȡ������е�����
			if (tmp.isEmpty()) {
				jep.setText("Warning! You must fill the blank!"); // �����Ϊ�����������
			} else {
				Employee m = new Manager(tmp);
				cl0.add(m);
			}
		}
		// �������
		if (e.getSource() == addSaler) {
			String tmp = salerNameText.getText().toString();
			String work_s = salerSalesText.getText().toString();
			if (tmp.isEmpty() || work_s.isEmpty()) { // �ж�������Ƿ�հ�
				jep.setText("Warning! You must fill the blank!"); // �����Ϊ�����������
			} else {
				long work_l = Long.parseLong(work_s); // ��String���͵�����ת��Ϊlong����
				Employee s = new Saler(tmp, work_l);
				cl0.add(s);
			}
		}
		// ��Ӽ���
		if (e.getSource() == addTechnician) {
			String tmp = technicianNameText.getText().toString();
			String work_s = technicianWorkText.getText().toString();
			if (tmp.isEmpty() || work_s.isEmpty()) { // �ж�������Ƿ�հ�
				jep.setText("Warning! You must fill the blank!"); // �����Ϊ�����������
			} else {
				long work_l = Long.parseLong(work_s);
				Employee t = new Technician(tmp, work_l);
				cl0.add(t);
			}
		}
		// ɾ����Ա
		if (e.getSource() == removeHim) {
			String tmpID_s = removeIDText.getText().toString();
			// long tmpID_l = Long.parseLong(tmpID_s);
			String tmpName = removeNameText.getText().toString();
			if (!tmpID_s.isEmpty()) { // �����������������
				// System.out.println("Step 1");
				long tmpID_l = Long.parseLong(tmpID_s);
				// System.out.println("Step 2");
				cl0.remove(tmpID_l);
				// System.out.println("Step 3");
			} else if (!tmpName.isEmpty()) { // �����������û�����ݣ����������������
				// System.out.println("Step 4");
				cl0.remove(tmpName);
				// System.out.println("Step 8");
			}
		}
		// �޸���Ա
		if (e.getSource() == modifyHim) {
			String tmpID01_s = modifyIDText_Before.getText().toString();
			long tmpID01_l = Long.parseLong(tmpID01_s);
			String tmpID02_s = modifyIDText_After.getText().toString();
			long tmpID02_l = Long.parseLong(tmpID02_s);
			String tmpName = modifyNameText.getText().toString();
			cl0.modify(tmpID01_l, tmpName, tmpID02_l);
		}
		// ��ѯ������Ա
		if (e.getSource() == queryHim) {
			String tmpID_s = queryIDText.getText().toString();
			// long tmpID_l = Long.parseLong(tmpID_s);
			String tmpName = queryNameText.getText().toString();
			if (!tmpID_s.isEmpty()) { // �����������������
				// cl0.query(tmp);
				long tmpID_l = Long.parseLong(tmpID_s);
				jep.setText(cl0.query(tmpID_l));
			} else if (!tmpName.isEmpty()) { // �����������û�����ݣ����������������
				// cl0.query(tmpID_l);
				jep.setText(cl0.query(tmpName));
			}
		}
		// ��ѯ������Ա
		if (e.getSource() == queryThem) {
			// String tmp = cl0.queryAll();
			jep.setText(cl0.queryAll());
		}
		// ��ѯ���ұ���
		if (e.getSource() == queryAndSave) {
			jep.setText(cl0.save());
		}
	}

}