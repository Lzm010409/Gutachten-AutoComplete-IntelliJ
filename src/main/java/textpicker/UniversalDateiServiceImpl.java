package textpicker;

import com.itextpdf.kernel.exceptions.PdfException;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import com.itextpdf.kernel.pdf.canvas.parser.filter.TextRegionEventFilter;
import com.itextpdf.kernel.pdf.canvas.parser.listener.FilteredTextEventListener;
import com.itextpdf.kernel.pdf.canvas.parser.listener.LocationTextExtractionStrategy;
import filechooser.FileChooser;

import java.io.File;

public class UniversalDateiServiceImpl {
    protected File fileToRead;
    protected String filePath;
    protected String pathToSave;
    protected String textFromFile;
    protected String textFromCoordinates;
    protected PdfDocument pdfToRead;
    protected FileChooser fileChooser = new FileChooser();

    public UniversalDateiServiceImpl() {
        this.fileToRead = fileChooser.chooseFile();
        this.filePath = this.fileToRead.getAbsolutePath();
    }

    public void readFile(ReadCoordinates coor) throws Exception {
        if (coor == null) {
            StringBuffer buff = new StringBuffer();
            try {
                PdfReader reader = new PdfReader(fileToRead);
                pdfToRead = new PdfDocument(reader);

                int num = pdfToRead.getNumberOfPages();
                for (int i = 0; i < num; i++) {
                    String str = PdfTextExtractor.getTextFromPage(pdfToRead.getPage(i));
                    buff.append(str + "/n");

                }
                textFromFile = buff.toString();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            PdfReader reader = new PdfReader(fileToRead);
            pdfToRead = new PdfDocument(reader);
            Rectangle rec = new Rectangle(coor.getFirst(), coor.getSecond(), coor.getThird(), coor.getFourth());
            TextRegionEventFilter filter = new TextRegionEventFilter(rec);
            FilteredTextEventListener eventlist = new FilteredTextEventListener(new LocationTextExtractionStrategy(),
                    filter);

            textFromCoordinates = PdfTextExtractor.getTextFromPage(pdfToRead.getPage(1), eventlist);

        }
        closeFile();
    }

    public String readFileWithReturn(ReadCoordinates coor) throws Exception {
        String readedFile = "";
        try {
            PdfReader reader = new PdfReader(fileToRead);
            pdfToRead = new PdfDocument(reader);
            Rectangle rec = new Rectangle(coor.getFirst(), coor.getSecond(), coor.getThird(), coor.getFourth());
            TextRegionEventFilter filter = new TextRegionEventFilter(rec);
            FilteredTextEventListener eventlist = new FilteredTextEventListener(new LocationTextExtractionStrategy(),
                    filter);

            readedFile = PdfTextExtractor.getTextFromPage(pdfToRead.getPage(1), eventlist);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return readedFile;
    }

    public void closeFile() throws PdfException {
        try {
            pdfToRead.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the fileToRead
     */
    public File getFileToRead() {
        return fileToRead;
    }

    /**
     * @param fileToRead the fileToRead to set
     */
    public void setFileToRead(File fileToRead) {
        this.fileToRead = fileToRead;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return the pathToSave
     */
    public String getPathToSave() {
        return pathToSave;
    }

    /**
     * @param pathToSave the pathToSave to set
     */
    public void setPathToSave(String pathToSave) {
        this.pathToSave = pathToSave;
    }

    /**
     * @return the textFromFile
     */
    public String getTextFromFile() {
        return textFromFile;
    }

    /**
     * @param textFromFile the textFromFile to set
     */
    public void setTextFromFile(String textFromFile) {
        this.textFromFile = textFromFile;
    }

    /**
     * @return the pdfToRead
     */
    public PdfDocument getPdfToRead() {
        return pdfToRead;
    }

    /**
     * @param pdfToRead the pdfToRead to set
     */
    public void setPdfToRead(PdfDocument pdfToRead) {
        this.pdfToRead = pdfToRead;
    }

    /**
     * @return the fileChooser
     */
    public FileChooser getFileChooser() {
        return fileChooser;
    }

    /**
     * @param fileChooser the fileChooser to set
     */
    public void setFileChooser(FileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

}
