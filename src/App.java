import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas1 = new ArrayList<>();
        List<String> frutas2 = new ArrayList<>();
        List<String> frutasEmComum = new ArrayList<>();

		frutas1.add("Morango");
		frutas1.add("Uva");
		frutas1.add("Acerola");
		frutas1.add("Manga");

		frutas2.add("Pêra");
		frutas2.add("Caju");
		frutas2.add("Morango");
		frutas2.add("Kiwi");


		for(int i = 0; i < frutas1.size(); i++) {
			String fruta1 = frutas1.get(i);

			for(int j = 0; j < frutas2.size(); j++) {
				String fruta2 = frutas2.get(j);

				if(fruta1.equals(fruta2)){
					frutasEmComum.add(fruta2);
					System.out.println(fruta2);
				}
			}
		}
    }
}
