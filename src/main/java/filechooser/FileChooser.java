package filechooser;

import javax.swing.*;
import java.io.File;

public class FileChooser {
    private JFileChooser fileChooser = new JFileChooser();
    private File returnedFile;
    private File[] returnedFiles;

    public FileChooser() {

    }

    public File chooseFile() {
        int choice = fileChooser.showOpenDialog(null);

        try {
            if (choice == JFileChooser.APPROVE_OPTION) {
                this.returnedFile = fileChooser.getSelectedFile();

            }
        } catch (Exception e) {
            e.printStackTrace();
            this.returnedFile = null;
        }
        return this.returnedFile;
    }

    public File[] chooseFiles() {
        int choice = fileChooser.showOpenDialog(null);

        try {
            if (choice == JFileChooser.APPROVE_OPTION) {
                this.returnedFiles = fileChooser.getSelectedFiles();

            }
        } catch (Exception e) {
            e.printStackTrace();
            this.returnedFiles = null;
        }
        return this.returnedFiles;
    }
}
