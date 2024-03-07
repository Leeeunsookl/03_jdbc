package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. Statement 에 대해 이해하고 사용할 수 있다. */

        /* 필기.
        *   Statement 란?
        *   SQL문을 저장하고 실행한 뒤 결과를 받아 주는
        *   메소드들이 묶여있는 타입의 클래스
        *  */

        Connection con = getConnection();

        /* 필기. 쿼리문을 저장하고 실행하는 기능을 하는 용도의 인터페이스 */
        Statement stmt = null;

        /* 필기. select 조회의 결과 집합을 받아 올 용도의 인터페이스 */
        ResultSet rset = null;

        try {
            /* 필기. connection을 이용해서 statement 인스턴스 생성 */
            stmt = con.createStatement();



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
