import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.print(emperorCast);
		System.out.println("");
		emperorCast.remove(2);
		emperorCast.add(2, "Chaca");
		emperorCast.add(3, "Tipo");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.print(emperorCast);
		

	}

}
