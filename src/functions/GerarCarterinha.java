package functions;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import modelo.bean.Cliente;

public class GerarCarterinha {
 
    
    
    public void gerar(Cliente c, String txt) throws FileNotFoundException, DocumentException, IOException{
        
        
        
        Rectangle small = new Rectangle(400,200);
        Font smallfont = new Font(FontFamily.HELVETICA, 14);
        Font title = new Font(FontFamily.HELVETICA, 19, Font.BOLD);
        Document document = new Document(small, 5, 5, 5, 5);
        document.setMargins(25, 25, 25, 25);
        
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(txt));
        document.open();
        
        Image img = Image.getInstance("img\\livro.jpeg");
        img.setAlignment(Element.ALIGN_CENTER);
        document.add(img);
        
        PdfPTable table = new PdfPTable(new float[]{6,4});
        table.setWidthPercentage(95);
        
        table.getDefaultCell().setUseAscender(true);
        
            
        
        PdfPCell header = new PdfPCell(new Paragraph("Biblioteca municipal qualquer... \n \n",title));
        header.setColspan(2);
        header.setBorder(0);
        table.addCell(header);
       
            PdfPTable dados = new PdfPTable(new float[]{3,6});
            
            dados.setWidthPercentage(90);
            
            
            
            dados.addCell(new Paragraph("Codigo ", smallfont));
            dados.addCell(new Paragraph(String.valueOf(c.getId()), smallfont));
            dados.addCell(new Paragraph("Nome ", smallfont));
            dados.addCell(new Paragraph(c.getNome(), smallfont));
            dados.addCell(new Paragraph("Login ", smallfont));
            dados.addCell(new Paragraph(c.getLogin(), smallfont));
    
            
            PdfPCell doc = new PdfPCell(dados);
            doc.setBorder(0);
            
        
        table.addCell(doc);
        
        
        
        table.addCell(new Paragraph(" \n     Leitor ", title));
        document.add(table);
        document.close();
        
        Desktop.getDesktop().open(new File(txt));
        
    }
    
    
}