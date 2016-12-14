public class MainFunction implements ActionListener {

	Frame frmX = new Frame("医院管理系统");

	// 管理系统选择界面
	Label k1 = new Label("欢迎使用医院管理系统");
	Button patientInfo = new Button("病人资料管理");
	Button price = new Button("相关价格管理");
	Button chufang = new Button("医生处方管理");
	Button emp = new Button("医院员工管理");
  public MainFunction() {
		// 选择界面配置
		k1.setBounds(110, 50, 150, 30);
		patientInfo.setBounds(70, 100, 90, 30);
		price.setBounds(210, 100, 90, 30);
		chufang.setBounds(70, 180, 90, 30);
		emp.setBounds(210, 180, 90, 30);
		frmX.add(k1);
		frmX.add(patientInfo);
		frmX.add(price);
		frmX.add(chufang);
		frmX.add(emp);


	}
}
1
