package curs12;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfTextExample {

	public static void main(String[] args) throws IOException {
		
//		File file = new File("ATX-038702213.pdf");
//		
//		PDDocument document = PDDocument.load(file);
//		
//		PDFTextStripper pdfStripper = new PDFTextStripper();
//		
//		String text = pdfStripper.getText(document);
//		System.out.println(text);
//		
//		document.close();
		
		System.out.println(readLineFromPdf("ATX-038702213.pdf", "Cont", "77"));
	}
	
	public static String readLineFromPdf(String path, String inceput, String finish) {
		
		String returnString = "";
		
		try {
			PDDocument document = PDDocument.load(new File(path));
			
			PDFTextStripperByArea pdfStrip = new PDFTextStripperByArea();
			pdfStrip.setSortByPosition(true);
			
			PDFTextStripper pdfStripper = new PDFTextStripper();
			String allTExt = pdfStripper.getText(document);
			String strStart = inceput;
			String strEnd = finish;
			
			int startIndex = allTExt.indexOf(strStart);
			int endIndex = allTExt.indexOf(strEnd);
			
			returnString = allTExt.substring(startIndex, endIndex);
			
			
		} catch (IOException e) {
			returnString = "Nu a functionat";
//			e.printStackTrace();
		}
		
		return returnString;
	}

}
