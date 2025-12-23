import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.io.*;

public class JavaLesson31 extends JFrame {

	static String filePath,parentDirectory;

	static File randomDir, randomFile,randomFile2;





	public static void main(String[] args) {

		randomDir = new File("/Users/mcars/OneDrive/Belgeler/Random");		

		randomDir.mkdir();

		randomFile = new File("random.txt");

		randomFile2 = new File("/Users/mcars/OneDrive/Belgeler/Random/random2.txt");

		try {
			randomFile.createNewFile();

			randomFile2.createNewFile();

			filePath = randomFile.getCanonicalPath();






		} catch (IOException e) {
			e.printStackTrace();



		}
		if(randomFile.exists()) {
			System.out.println("File Exists");

			System.out.println("File Readable " + randomFile.canRead());

			System.out.println("File Writable " + randomFile.canWrite());

			System.out.println("File Name " + randomFile.getName());

			System.out.println("Parent Directory " + randomFile.getParent());

			parentDirectory = randomFile2.getParent();

			System.out.println("File 2 Parent " + parentDirectory);

			System.out.println("Is it a Directory " + randomDir.isDirectory());

			String[] filesInDir = randomDir.list();

			System.out.println("Files in Directory\n");

			for(String fileName : filesInDir) {
				System.out.println(fileName + "\n");

			}

			System.out.println("Is a File " + randomFile.isFile());

			System.out.println("Is Hidden " + randomFile.isHidden());


			System.out.println("Last Modified " + randomFile.lastModified());;

			System.out.println("File Size " + randomFile.length());

			randomFile2.renameTo(new File("/Users/mcars/OneDrive/Belgeler/Random/random3.txt"));;

			new JavaLesson31();

		} else {
			System.out.println("File doesnt exist");
		}
		if (randomFile.delete()) {
			System.out.println("File Deleted");
		}
		File[] filesInDir = randomDir.listFiles();


		for(File fileName : filesInDir) {
			fileName.delete();			
		}

		if(randomDir.delete()) {
			System.out.println("Directory Deleted");
		}


	} //END OF main

	public JavaLesson31() {

		JFileChooser fileChooser = new JFileChooser(randomDir);

		fileChooser.showOpenDialog(this);

	}

} //END OF JavaLesson31 Class
