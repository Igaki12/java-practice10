

public class Main {

	public static void main(String[] args) {
		System.out.println(System.getProperty("file.encoding"));
		Print pr = new Print();
		Filing fl = new Filing();
		
		int intChoice = 1;
		while (intChoice != 9) {
			pr.PrintChoices();
			String strChoice = pr.ScanNextLine();
			try {
				intChoice = Integer.parseInt(strChoice);
			}catch (NumberFormatException nfe) {
				System.out.println("半角数字を入力してください");
				continue;
			}
			
			if (intChoice == 1) {
				String submit = "9";
				while(true)  {
					System.out.print("=>ID:");
					String strID = pr.ScanNextLine();
					System.out.print("=>name:");
					String strName = pr.ScanNextLine();
					System.out.print("=>tel:");
					String strTel = pr.ScanNextLine();
					
					System.out.println("以下の内容で登録しますか？");
					pr.PrintUserInformation(strID, strName, strTel);
					
					System.out.println("1:登録，9:キャンセル");
				    System.out.print("=>");
				    submit = pr.ScanNextLine();
				    if (submit.equals("1")) {
						fl.WriteList(strID + "," + strName + "," + strTel);
						System.out.println("登録しました");
						break;
					}
				    else {
						System.out.println("キャンセルされました");
						break;
					} 
					
					
				}
			}
			if (intChoice == 2) {
				System.out.println("以下のように登録されています");
				fl.ReadList();
				continue;
			}
			if (intChoice == 9) {
				System.out.println("処理を終了します");
			}
			
			

		}
			
		
	}

}
