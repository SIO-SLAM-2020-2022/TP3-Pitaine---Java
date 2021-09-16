package fr.louis.Main;

import java.sql.*;

public class BDD {

    public static void main(String[] args) throws Exception{

        String URL = "jdbc:mysql://127.0.0.1:3306/tp3pitaine";
        String USERNAME = "root";
        String PASSWORD = "";

        System.out.println("Connecting database...");
        String rq = "select * from bateau";
        ResultSet result = null;

        try {
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connected");

            Statement stmt = con.createStatement();
            result = stmt.executeQuery(rq);
            while (result.next()){
                System.out.println(result.getInt("id") + " : " + result.getString("nom") + " :: " + result.getFloat("vitesse"));
            }

        } catch (SQLException e){
            System.out.println(e);
        }
    }

}
