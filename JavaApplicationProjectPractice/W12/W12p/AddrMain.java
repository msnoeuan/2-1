package W12p;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();

	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 전체 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.print("메뉴를 입력하세요: >> ");

			int in = sc.nextInt();
			//선택한 메뉴별로 메소드 실행 추가

			switch(in) {
				case 1 :
					addrInput();
					break;
				case 2 :
					addrSearch();
					break;
				case 3 :
					addrJohoi();
					break;
				case 4 :
					addrUpdate();
					break;
				case 5 :
					addrDelete();
					break;
			}

			if(in == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close(); //프로그램이 끝나는 곳에 넣어야 함
	}

	//입력
	public static void addrInput() {
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.next();
		System.out.print("전화번호를 입력하세요 >> ");
		String tel = sc.next();
		System.out.print("회사 이름을 입력하세요 >> ");
		String com = sc.next();
		LocalDateTime now = LocalDateTime.now();

		addlist.add(new Addr(name, tel, com, now));
	}

	//검색
	static private void addrSearch() {
		System.out.print("검색할 이름을 입력하시오 >>");
		String name = sc.next();
		boolean bool = false;

		for(Addr emp : addlist) {
			if(name.equals(emp.getName())) {
				System.out.println(emp);
				bool = true;
				break;
			}
		}

		if(!bool) {
			System.out.println("입력한 이름이 저장되어 있지 않습니다.");
		}

	}

	//전체 조회
	static void addrJohoi() {
		for(Addr emp : addlist) {
			System.out.println(emp);
		}
	}

	//수정
	static void addrUpdate() {
		System.out.print("수정할 이름을 입력하시오. >> ");
		String name = sc.next();
		boolean bool = false;

		for(Addr emp : addlist) {
			if(name.equals(emp.getName())) {
				System.out.print("새로운 이름을 입력하세요 >> ");
				String newName = sc.next();
				System.out.print("새로운 전화번호를 입력하세요 >> ");
				String newTel = sc.next();
				System.out.print("새로운 회사명을 입력하세요 >> ");
				String newCom = sc.next();
				LocalDateTime now = LocalDateTime.now();  // 수정된 시간

				emp.setName(newName);
				emp.setTel(newTel);
				emp.setCom(newCom);
				emp.setCreateDate(now);

				System.out.println(emp);

				bool = true;
				break;
			}
		}

		if(!bool)
			System.out.println("입력한 이름이 저장되어 있지 않습니다.");
	}

	//삭제
	static void addrDelete() {
		System.out.print("삭제할 이름을 입력하시오. >> ");
		String name = sc.next();
		boolean bool = false;

		for(int i = 0; i < addlist.size(); i ++) {
			if(addlist.get(i).getName().equals(name)) {
				addlist.remove(i);
				bool = true;
				System.out.println("입력한 이름을 삭제하였습니다.");
				break;
			}
		}

		if(!bool)
			System.out.println("입력한 이름이 저장되어 있지 않습니다.");
	}
}
