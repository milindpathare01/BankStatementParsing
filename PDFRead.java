package bankcode;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;


public class PDFRead {

	public static void main(String[] args) throws IOException   {
		
		File file = new File("C:\\Users\\milin\\eclipse-workspace\\bankcode\\sample.pdf");
		InputStream is = new FileInputStream(file);
	  
		
		PDFParser parser = new PDFParser(is);
		parser.parse();
		
		COSDocument cosdoc = parser.getDocument();
		PDDocument pddoc = new PDDocument(cosdoc);		
		
		PDFTextStripper str = new PDFTextStripper();
		String data = str.getText(pddoc);
		
		
		//To SPlit the document with the limit of array.(0 means there is no limit)
		//If the limit is 1 it will print as it is.
		//If the limit set to 100 , it will print the first 100 splited lines.
		
		String a[] = data.split("\\n",0);
		System.out.println(a[37]);
		System.out.println(a[10]);
		System.out.println(a[42]);
		System.out.println(a[56]);
		System.out.println(a[75]);
		System.out.println(a[88]);
		System.out.println(a[89]);
		System.out.println(a[90]);
		System.out.println(a[91]);
		System.out.println(a[106]);
		System.out.println(a[107]);
		System.out.println(a[108]);
		
		
		
		
		//for (String w:a)
			//System.out.println(w); 	
		
	    //If we split the String data then it will print the hash value. 
		//System.out.println(data.split("\\s"));
		
		//Directly print the PDF Document.
		//System.out.println(data);
		
		
	}

}
