import java.util.Scanner;

public class Print {
    public void PrintChoices() {
    	System.out.println(">1:new employee");
    	System.out.println(">2:show employee");
    	System.out.println(">9:finish");
    	System.out.print("=>(������I��)");
    	
    }
    public void PrintUserInformation(String strID, String strName, String strTel) {
    	System.out.println("ID:" + strID);
    	System.out.println("name:" + strName);
    	System.out.println("tel:" + strTel);
    	
    }
    public String ScanNextLine() {
    	Scanner sc = new Scanner(System.in);
    	String r = null;
    	for (int i = 0; i < 3; i++) {
    		r = sc.nextLine();
    		if (r == null) {
    			System.out.println("���͂���Ă��܂���");
    		}
    		if (r.contains(",")) {
    			System.out.println("�J���}�i,�j����͂��Ȃ��ł�������");
    		}
    		if (r.contains(" ")) {
    			System.out.println("�󔒁u�@�v���g�p���Ȃ��ł�������");
    		}
    		
    		
    		else {
    			sc.close();
    	    	return r;
    		}	
    	}
    	sc.close();
    	return "None";
    	
    	
    	
    	
    }
}
