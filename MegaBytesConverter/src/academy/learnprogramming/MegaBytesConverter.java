package academy.learnprogramming;

public class MegaBytesConverter {

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		int megaBytes = kiloBytes / 1024;
		int remaingKiloBytes = kiloBytes % 1024;

		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remaingKiloBytes);
		}
	}
}
