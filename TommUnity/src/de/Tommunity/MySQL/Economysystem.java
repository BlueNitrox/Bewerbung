package de.Tommunity.MySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class Economysystem {

    public static boolean isUserExists(UUID uuid) {
        try {
            PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Money FROM money WHERE UUID = ?");
            ps.setString(1, uuid.toString());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void update(UUID uuid, int amount, boolean remove, String playername) {
        int money = getMoney(uuid);

        if(remove) {
            amount-=money;
        }else {
            amount+=money;
        }
        if(isUserExists(uuid)) {
            try {
                PreparedStatement ps = MySQL.getConnection().prepareStatement("UPDATE money SET Money = ? WHERE UUID = ?");
                ps.setInt(1, amount);
                ps.setString(2, uuid.toString());
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            try {
                PreparedStatement ps = MySQL.getConnection().prepareStatement("INSERT INTO money (UUID, Spielername, Money) VALUES (?,?,?)");
                ps.setString(1, uuid.toString());
                ps.setString(2, playername);
                ps.setInt(3, money);
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void delete(UUID uuid) {
        if(isUserExists(uuid)) {
            try {
                PreparedStatement ps = MySQL.getConnection().prepareStatement("DELETE * FROM money WHERE UUID = ?");
                ps.setString(1, uuid.toString());
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("[MySQL] Der Spieler mit der UUID: " + uuid.toString() + " ist nicht in der Datenbank gespeichert!");
        }
    }
    public static Integer getMoney(UUID uuid) {
        try {
            PreparedStatement ps = MySQL.getConnection().prepareStatement("SELECT Money FROM money WHERE UUID = ?");
            ps.setString(1, uuid.toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return rs.getInt("Money");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1000;
    }
    public static boolean hasEnoughMoney(UUID uuid, int amount) {
        if(getMoney(uuid) >= amount) {
            return true;
        }else {
            return false;
        }
    }

}
