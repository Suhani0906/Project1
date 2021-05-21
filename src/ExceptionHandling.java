import java.util.ArrayList;

public class ExceptionHandling {
	public static void main(String args[])
	{
		ArrayList<String> arrayList = new ArrayList<>();

		try {
			arrayList.add("Suhani");
			arrayList.add("Riya");
		//	exceptionFunction(arrayList);
			
////			arrayList.add(2,"Test");  //ArrayIndexofBondException
//			
//			if(arrayList.size()<3) {
//				Exception ex= new Exception();
//				throw ex;
//			}
//			arrayList.add("something");
		}catch(Exception ex)
		{
			System.out.println("Error Genrated: " +ex.getMessage());
		}finally {
			
		for (int i=0;i<arrayList.size();i++);
			{
int i = 0;
				//				System.out.println(arrayList.get(i));
				System.out.println(arrayList.get(i));

			}
		}
	}

}
