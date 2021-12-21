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
		
		String a[] = data.split("\\n",0);
		ParseData(a);
		
			
		//for (String w:a)
			//System.out.println(w); 	
		
		//Directly print the PDF Document.
		//System.out.println(data);	
	}
	
	public static void ParseData(String b[]) throws IOException {
		
		System.out.println(b[37]);
		System.out.println(b[10]);
		System.out.println(b[42]);
		System.out.println(b[56]);
		System.out.println(b[75]);
		System.out.println(b[88]);
		System.out.println(b[89]);
		System.out.println(b[90]);
		System.out.println(b[91]);
		System.out.println(b[106]);
		System.out.println(b[107]);
		System.out.println(b[108]);
		
	}
	
	

}
