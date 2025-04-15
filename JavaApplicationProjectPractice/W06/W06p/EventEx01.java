package W06p;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx01 extends JFrame {
    EventEx01() {
        setTitle("버튼 이벤트 예제1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton btnOk = new JButton("확인");
        btnOk.addActionListener(new ActionListener() {  // 토큰 인식
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("확인 버튼을 클릭했습니다.");
                System.out.println(e);
            }
        });
        this.add(btnOk);

        JButton btnCancel = new JButton("취소");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("취소 버튼을 클릭했습니다.");
                System.out.println(e);
            }
        });
        this.add(btnCancel);

        this.setSize(300, 200);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new EventEx01();
    }
}
