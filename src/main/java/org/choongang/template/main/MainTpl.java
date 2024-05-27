package org.choongang.template.main;

import org.choongang.template.Template;

public class MainTpl implements Template {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer(2000); //버퍼 생성
        sb.append("MAIN MENU\n")
            .append("1. SIGN UP\n")
            .append("2. LOGIN\n")
            .append("-----------------\n");
        
        return sb.toString();
    }
}
