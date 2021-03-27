package comm.sgtesting.pageobjectmodels;

public class ExecuteAutoIT {

	public static void main(String[] args) {
		executeAutoITFile();

	}
	
	static void executeAutoITFile()
	{
		try
		{
			String FilePath="F:\\AutoIT\\SampleExample.exe";
			Runtime.getRuntime().exec(FilePath);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
