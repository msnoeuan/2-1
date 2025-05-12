package W09p;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonItemEventEx extends JFrame {
    private JRadioButton[] radio = new JRadioButton[3];
    private String[] text = {"사과", "배", "체리"};
    private ImageIcon[] image = {
            new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/apple.png"),
            new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/pear.png"),
            new ImageIcon("/Users/yooseungmin/Desktop/2-1/JavaApplicationProjectPractice/W09/images/cherry.png")
    };
    private JLabel imageLabel = new JLabel();

    RadioButtonItemEventEx() {
        setTitle("라디오버튼 Item Event 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup g = new ButtonGroup();

        for(int i = 0; i < radio.length; i ++) {
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addItemListener(new MyItemListener());
        }
        radio[2].setSelected(true);
        add(radioPanel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setSize(250, 200);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.DESELECTED)
                return;
            if(radio[0].isSelected())
                imageLabel.setIcon(image[0]);
            else if(radio[1].isSelected())
                imageLabel.setIcon(image[1]);
            else
                imageLabel.setIcon(image[2]);
        }
    }

    public static void main(String[] args) {
        new RadioButtonItemEventEx();
    }
}
