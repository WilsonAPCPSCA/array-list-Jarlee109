import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args) {
		ArrayList<Integer> numsRandom = new ArrayList<Integer>();
		for (int i=0; i<=10; i++){
			numsRandom.add((int) Math.floor(Math.random() * 101));
		}
		System.out.print(numsRandom);
		System.out.println("");
		for (int i=0; i<numsRandom.size(); i++){
			numsRandom.set(i, 0);
		}
		System.out.print(numsRandom);

	}

}
