import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class assignmentFour {

	public static void main(String[] args) {

		int i = 0;
		
		// question 1
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Bryce");
		employeeNames.add("Pricilla");
		employeeNames.add("Nicole");
		employeeNames.add("Kelsey");
		employeeNames.add("Jamie");
		
		// question 2
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(10001);
		ids.add(10002);
		ids.add(10003);
		ids.add(10004);
		ids.add(10005);
		
		// question 3
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		// question 5
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		System.out.println(employeeMap);
		System.out.println("");
		
		// question 6
		for (Integer employee : employeeMap.keySet()) {
			System.out.println(employee + " : " + employeeMap.get(employee));
		}
		System.out.println("");
		// question 7
		StringBuilder idsBuilder = new StringBuilder();
		for (Integer id : ids) {
			idsBuilder.append(id + " — ");
		}
		System.out.println(idsBuilder.toString());
		
		// question 11
		StringBuilder namesBuilder = new StringBuilder();
		for(String employeeName : employeeNames) {
			namesBuilder.append(employeeName + "  ");
		}
		System.out.print(namesBuilder.toString());
		
	}

}
