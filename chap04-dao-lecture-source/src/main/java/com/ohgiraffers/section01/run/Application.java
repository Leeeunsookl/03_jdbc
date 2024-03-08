package com.ohgiraffers.section01.run;

import com.ohgiraffers.section01.model.dao.MenuDAO;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {

        Connection con = getConnection();
        MenuDAO registDAO = new MenuDAO();

        /* 필기. 1. 메뉴의 마지막 번호 조회 */

        int maxMenuCode = registDAO.selectLastMenuCode(con);

        System.out.println("maxMenuCode = " + maxMenuCode);

        /* 필기. 2. 카테고리 조회 */

        List<Map<Integer, String>> categoryList = registDAO.selectAllCategory(con);

        /* 필기. 3. 신규 메뉴 등록 */


    }

}
