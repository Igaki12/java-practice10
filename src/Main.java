

public class Main {

	public static void main(String[] args) {
		Print pr = new Print();
		Print pr2 = new Print();
		Filing fl = new Filing();
		
		int intChoice = 1;
		while (intChoice != 9) {
			pr.PrintChoices();
			String strChoice = pr.ScanNextLine();
			try {
				intChoice = Integer.parseInt(strChoice);
			}catch (NumberFormatException nfe) {
				System.out.println("���p��������͂��Ă�������");
				continue;
			}
			
			if (intChoice == 1) {
				String submit = "9";
				while(true)  {
					System.out.print("=>ID:");
					String strID = pr2.ScanNextLine();
					System.out.print("=>name:");
					String strName = pr.ScanNextLine();
					System.out.print("=>tel:");
					String strTel = pr.ScanNextLine();
					
					System.out.println("�ȉ��̓��e�œo�^���܂����H");
					pr.PrintUserInformation(strID, strName, strTel);
					
					System.out.println("1:�o�^,9:�L�����Z��");
				    System.out.print("=>");
				    submit = pr.ScanNextLine();
				    if (submit.equals("1")) {
						fl.WriteList(strID + "," + strName + "," + strTel);
						System.out.println("�o�^���܂���");
						break;
					}
				    else {
						System.out.println("�L�����Z������܂���");
						break;
					} 
					
					
				}
			}
			if (intChoice == 2) {
				System.out.println("�ȉ��̂悤�ɓo�^����Ă��܂�");
				fl.ReadList();
				continue;
			}
			if (intChoice == 9) {
				System.out.println("�������I�����܂��B");
			}
			
			

		}
			
		
	}

}
