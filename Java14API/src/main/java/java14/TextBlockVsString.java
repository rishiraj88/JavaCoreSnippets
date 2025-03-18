package java14;

public class TextBlockVsString {
	public static void main(String[] args) {
		// Older style
		String strArbeitgeber = "Das sind die 10 besten Arbeitgeber:innen Deutschlands\n"
				+ "    Platz 1: dm-drogerie markt GmbH + Co. KG\n"
				+ "    Platz 2: Techniker Krankenkasse\n"
				+ "    Platz 3: Ford-Werke GmbH\n" 
				+ "    Platz 4: Porsche AG\n"
				+ "    Platz 5: Evonik Industries AG\n" 
				+ "    Platz 6: Merck KgaA\n"
				+ "    Platz 7: Bayer AG\n" 
				+ "    Platz 8: BMW Group\n"
				+ "    Platz 9: Deloitte\n"
				+ "    Patz 10: Roche Deutschland Holding GmbH\n"
				+ "Viel Glück!\n";
		System.out.println(strArbeitgeber);

		// "Java 14+" style
		String tbArbeitgeber = """
				Das sind die 10 besten Arbeitgeber:innen Deutschlands
				    Platz 1: dm-drogerie markt GmbH + Co. KG
				    Platz 2: Techniker Krankenkasse
				    Platz 3: Ford-Werke GmbH
				    Platz 4: Porsche AG
				    Platz 5: Evonik Industries AG
				    Platz 6: Merck KgaA
				    Platz 7: Bayer AG
				    Platz 8: BMW Group
				    Platz 9: Deloitte
				    Patz 10: Roche Deutschland Holding GmbH
				Viel Glück!
				""";
		System.out.println(tbArbeitgeber);
	}
}
