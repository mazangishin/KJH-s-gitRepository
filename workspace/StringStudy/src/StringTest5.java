
public class StringTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2019/02/22
		
		String originDate = "2019/02/22";
		
		String changeDateForm = originDate.replace("/", "-");
		System.out.println(changeDateForm);

		changeDateForm = changeDateForm.replace("-", " ");
		System.out.println(changeDateForm);
		
		changeDateForm = originDate.replaceFirst("/", "-");
		System.out.println(changeDateForm);
		
		char[] originDateArr = {'2', '0', '1', '9', '/', '0', '2', '/', '2', '2'};
		int idx1 = originDate.indexOf('/');
		originDateArr[idx1] = '-';
		String newDateForm = new String(originDateArr);
		
		System.out.println(newDateForm);
		
		String[] newDateForm1 = originDate.split("/");
		String slash = "-";
		String completeDateForm = "";
		
		for (int i = 0; i < newDateForm1.length; i++) {
			
			if (i == newDateForm1.length) {
				completeDateForm = completeDateForm + newDateForm1[i];
			}else if (i < newDateForm1.length) {
				completeDateForm = completeDateForm + newDateForm1[i] + slash;
			}
		}
		
		System.out.println(completeDateForm);
		
		
	}

}
