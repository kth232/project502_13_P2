package org.choongang.global;

import org.choongang.global.contents.Menu;
import org.choongang.main.MainRouter;

import java.util.Scanner;

public abstract class AbstractController implements Controller {
    protected Scanner sc; //컨트롤에 따라 입력받는 것이 다를 수 있음

    public AbstractController() {
        sc = new Scanner(System.in);
    }
    /**
     * 상단 공통 출력 부분
     */
    public void common() {
        System.out.println("학생관리 프로그램 ver1.0");
        System.out.println("------------------------");
    }

    /**
     * 입력 항목
     * 문자: q, exit, quit -> 종료
     * 숫자: 메뉴 항목 
     * * 숫자 외 문자가 들어오면 예외 처리
     * 기본 설정-main /재정의로 하위 컨트롤로 변경할 수 있음
     */
    public void prompt() {
        System.out.print("MENU 선택: ");
        String menu = sc.nextLine();
        if (menu.equals("q") || menu.equals("quit") || menu.equals("exit")) {
            System.exit(0); //0: 정상종료/1: 비정상 종료
        }
        try {
            int m = Integer.parseInt(menu);
            change(m); //라우터를 통해 메뉴 변경
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("메뉴는 [숫자]로 입력해주세요!");
        }
    }
    
    @Override
    public final void run() {
        common();
        show(); //하위 컨트롤러마다 다르게 보일 화면 정의
        prompt();
        } //템플릿 메서드 패턴: 절차는 바뀌면 안됨

    private void change(int menuNo) {
        Menu menu = null;
        switch (menuNo) {
            case 1: menu = Menu.JOIN; break; //회원가입, 간단한 조건절일 경우 줄개행 없이 break문 가능
            case 2: menu = Menu.LOGIN; break; //로그인
            default: menu = Menu.MAIN; //메인 화면
        }
        //메뉴 컨트롤러 변경 처리-Router/싱글톤 패턴으로 자원 절약
        MainRouter.getInstance().change(menu);
    }
}
