

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
				System.out.println("”¼Šp”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
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
					
					System.out.println("ˆÈ‰º‚Ì“à—e‚Å“o˜^‚µ‚Ü‚·‚©H");
					pr.PrintUserInformation(strID, strName, strTel);
					
					System.out.println("1:“o˜^,9:ƒLƒƒƒ“ƒZƒ‹");
				    System.out.print("=>");
				    submit = pr.ScanNextLine();
				    if (submit.equals("1")) {
						fl.WriteList(strID + "," + strName + "," + strTel);
						System.out.println("“o˜^‚µ‚Ü‚µ‚½");
						break;
					}
				    else {
						System.out.println("ƒLƒƒƒ“ƒZƒ‹‚³‚ê‚Ü‚µ‚½");
						break;
					} 
					
					
				}
			}
			if (intChoice == 2) {
				System.out.println("ˆÈ‰º‚Ì‚æ‚¤‚É“o˜^‚³‚ê‚Ä‚¢‚Ü‚·");
				fl.ReadList();
				continue;
			}
			if (intChoice == 9) {
				System.out.println("ˆ—‚ğI—¹‚µ‚Ü‚·B");
			}
			
			

		}
			
		
	}

}
