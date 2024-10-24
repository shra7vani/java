import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame
{
    private JTextArea textArea;
    private String currentFilePath;
    public Notepad()
    {
        setTitle("simple notpad");
        setSize(1100,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    textArea= new JTextArea();
    JScrollPane scrollPane=new JScrollPane(textArea);
    add (scrollPane,BorderLayout.CENTER);

JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("file");
JMenuItem openItem= new JMenuItem("Open");
JMenuItem saveItem = new JMenuItem("Save");
JMenuItem exitItem = new JMenuItem("Exit");

fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.addSeparator();
fileMenu.add(exitItem);
menuBar.add(fileMenu);
setJMenuBar(menuBar);

// Add action listeners
openItem.addActionListener(e -> openFile());
saveItem.addActionListener(e -> saveFile());
exitItem.addActionListener(e -> System.exit(0));

setVisible(true);
}

private void openFile() {
JFileChooser fileChooser = new JFileChooser();
if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
    File file = fileChooser.getSelectedFile();
    currentFilePath = file.getPath();
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        textArea.setText("");
        String line;
        while ((line = br.readLine()) != null) {           textArea.append(line + "\n");
    }
} catch (IOException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error opening file");
}
}
}

private void saveFile() {
if (currentFilePath == null) {
JFileChooser fileChooser = new JFileChooser();
if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
    File file = fileChooser.getSelectedFile();
    currentFilePath = file.getPath();
}
}

try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentFilePath))) {
bw.write(textArea.getText());
JOptionPane.showMessageDialog(this, "File saved successfully");
} catch (IOException e) {
e.printStackTrace();
JOptionPane.showMessageDialog(this, "Error saving file");
}
}

public static void main(String[] args) {
SwingUtilities.invokeLater(Notepad::new);
}
}


    
