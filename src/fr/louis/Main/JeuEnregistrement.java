package fr.louis.Main;

import com.google.protobuf.Any;

import javax.print.DocFlavor;
import java.sql.*;

public class JeuEnregistrement {

    private String requeteSQL;
    private final String url = "jdbc:mysql://127.0.0.1:3306/tp3pitaine";
    private final String id = "root";
    private final String passwd = "";
    private Connection con;
    private ResultSet result;
    private Statement stmt;

    public JeuEnregistrement(String requeteSQL){
        try {
            con = DriverManager.getConnection(url, id, passwd);
            stmt = con.createStatement();
            result = stmt.executeQuery(requeteSQL);
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public void suivant() throws SQLException {
        result.next();
    }

    public boolean fin() throws SQLException {
        return result.isLast();
    }

    public String getValeur(String nomChamp) throws SQLException {
        return result.getString(nomChamp);
    }

}

