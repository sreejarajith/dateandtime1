package dateandtime;
import java.util.List;
import java.util.ArrayList;

public class LambdaImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>friends=new ArrayList<>();
		friends.add(0, "bindhu");
		friends.add(1, "sindhu");
		friends.add(2, "indhu");
		friends.add(3, "vindhu");
		friends.add(4, "nindhu");
		System.out.println("name of friends"+friends);
		friends.forEach((n)->{
			System.out.println(n);
		
		});
		

	}

}
