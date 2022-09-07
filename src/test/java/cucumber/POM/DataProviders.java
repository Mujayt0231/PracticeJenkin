package cucumber.POM;
import org.testng.annotations.*;

public class DataProviders {
	
	
	
	@DataProvider(name = "dataProvider")
	public String[][] dataProvider(){
		
		String[][] datas = new String[1][4];
		
		datas[0][0] = "JumanJo";
		datas[0][1] = "JumanJo@gmail.com";
		datas[0][2] = "1234567";
		datas[0][3] = "1234567";
	
		

		return datas;
		
	}

}
