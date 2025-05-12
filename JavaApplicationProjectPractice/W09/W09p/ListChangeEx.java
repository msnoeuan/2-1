package W09p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListChangeEx extends JFrame {
    private JTextField tf = new JTextField(8);
    private ArrayList<String> arr = new ArrayList<>();
    private JList<String> nameList = new JList<>();

    ListChangeEx() {
        setTitle("리스트 변경 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("이름 입력 후 <Enter> 키"));
        arr.add("황기태");
        arr.add("이재문");
        add(tf);
        nameList.setListData(arr.toArray(new String[0]));
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                arr.add(t.getText());
                t.setText("");
                nameList.setListData(arr.toArray(new String[0]));
                // String 타입 배열을 반환, 필요하면 크기는 알아서 맞춰줌
                // 리스트 전체가 통째로 바뀜 => 기존 항목은 날아가고 전달한 데이터로 새롭게 구성
            }
        });

        nameList.setVisibleRowCount(5);  // JList에서 동시에 보이도록 설정할 행의 개수
        nameList.setFixedCellWidth(50);  // 리스트의 각 셀의 너비를 고정돈 픽셀 크기로 설정
        add(new JScrollPane(nameList));

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListChangeEx();
    }
}
