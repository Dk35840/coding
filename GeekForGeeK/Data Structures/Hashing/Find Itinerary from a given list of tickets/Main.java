import java.util.HashMap;
import java.util.Map;

class Main {
	static  String startingPoint= "none";
	public static void main(String[] str) {
		Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("Chennai", "Banglore");
		dataSet.put("Bombay", "Delhi");
		dataSet.put("Goa", "Chennai");
		dataSet.put("Delhi", "Goa");

		printResult(dataSet);
	}

	private static void printResult(Map<String, String> dataSet) {
		Map<String, String> reverseDataSet = new HashMap<String, String>();
		for (String str : dataSet.keySet()) {
			reverseDataSet.put(dataSet.get(str), str);
		}

		for (String str : dataSet.keySet()) {
				if(!reverseDataSet.containsKey(str)) {
					startingPoint=str;
					break;
				}
		}
		
		String to=dataSet.get(startingPoint);
		while(to!=null) {
			System.out.println(startingPoint+ "->"+to);
			startingPoint= to;
			to =dataSet.get(to);
		}
	}
}