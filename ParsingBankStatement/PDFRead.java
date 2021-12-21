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
		
	String[] lines= readlinesFromPDF("C:\\\\Users\\\\milin\\\\eclipse-workspace\\\\bankcode\\\\sample.pdf") ;
	BankStatementDetail BSD = getBankStatementDetail(lines);
	
	System.out.println(BSD.toString());
	System.out.println(BSD.getDate());
	System.out.println(BSD.getTotal());
	System.out.println(BSD.getAccountType());
	System.out.println(BSD.getBranchName());
	System.out.println(BSD.getBranchCode());
	System.out.println(BSD.getMIRCCode());
	System.out.println(BSD.getIFSCCode());
	System.out.println(BSD.getOpeningBalance());
	System.out.println(BSD.getClosingBalance());
			
		//for (String w:a)
			//System.out.println(w); 	
		
		//Directly print the PDF Document.
		//System.out.println(data);	
	}
	public static String[] readlinesFromPDF(String filePath)  throws IOException {
		
		
		File file = new File(filePath);
		InputStream is = new FileInputStream(file);
		
		PDFParser parser = new PDFParser(is);
		parser.parse();
		
		COSDocument cosdoc = parser.getDocument();
		PDDocument pddoc = new PDDocument(cosdoc);		
		
		PDFTextStripper str = new PDFTextStripper();
		String data = str.getText(pddoc);
		
		String a[] = data.split("\\n",0);
		//ParseData(a);
		return a;
		
	}
	
	public static BankStatementDetail getBankStatementDetail(String b[]) throws IOException { 
		BankStatementDetail BSD = new 	BankStatementDetail();
		
		BSD.Name = b[37];
		BSD.Date = b[10];
		BSD.Total = b[42];
		BSD.AccountType = b[75];
		BSD.BranchName = b[88];
		BSD.BranchCode  = b[89];
		BSD.MIRCCode = b[90];
		BSD.IFSCCode = b[91];
		BSD.OpeningBalance = b[107];
		BSD.ClosingBalance = b[108];
	    return BSD;
		
	    
//		System.out.println(b[37]);
//		System.out.println(b[10]);
//		System.out.println(b[42]);
//		System.out.println(b[56]);
//		System.out.println(b[75]);
//		System.out.println(b[88]);
//		System.out.println(b[89]);
//		System.out.println(b[90]);
//		System.out.println(b[91]);
//		System.out.println(b[106]);
//		System.out.println(b[107]);
//		System.out.println(b[108]);
		
	}

}
