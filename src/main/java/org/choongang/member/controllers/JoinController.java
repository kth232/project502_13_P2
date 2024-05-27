package org.choongang.member.controllers;

import org.choongang.global.AbstractController;
import org.choongang.global.contents.Menu;
import org.choongang.template.Templates;

/**
 * 회원가입 컨트롤러
 */
public class JoinController extends AbstractController {
    @Override
    public void show() {
        Templates.getInstance().render(Menu.JOIN);
    }
}
