package fr.louis.Main;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

public class PDF extends Document{

    private String nomDocument;

    public PDF(String NomDocument){
        this.nomDocument = NomDocument;
        try {
            PdfWriter writer = PdfWriter.getInstance(this, new FileOutputStream(NomDocument));

            System.out.println("Ecriture du PDF....");
            ouvert();
            int i = 0;
            do {
                BateauVoyageur bateauVoyage = Passerelle.chargerBateauxVoyageur().get(i);
                chargerImage(bateauVoyage.getImageBateauVoyageur());
                chargerTexte(bateauVoyage.toString());
                i++;
            } while (i != longueurTab());
            System.out.println("PDF écrit : sauvegarde  ...");
            fermer();
            writer.close();
            System.out.println("PDF sauvegardé et prêt à lire !");

        } catch (DocumentException | IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void chargerTexte(String LeTexte) throws DocumentException {
        this.add(new Paragraph(LeTexte));
    }

    public void chargerImage(String EmplacementImage) throws SQLException, IOException, DocumentException {
        Image image_ = Image.getInstance(EmplacementImage);
        image_.setAlignment(Element.ALIGN_CENTER);
        this.add(image_);
    }

    public int longueurTab() throws SQLException {
        return Passerelle.chargerBateauxVoyageur().size();
    }
    public void fermer(){
        this.close();
    }
    public void ouvert(){
        this.open();
    }
}
