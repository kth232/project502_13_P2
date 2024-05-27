package org.choongang.main.controllers;

import org.choongang.global.AbstractController;

/**
 * 메인 컨트롤러
 */
public class MainController extends AbstractController {
    @Override
    public void show() {
        System.out.println("MAIN MENU");
        System.out.println("1. 회원가입");
        System.out.println("2. 로그인");
        System.out.println("----------------");
        System.out.println("▼ 원하시는 메뉴 번호를 입력해주세요.");
    }
}
