package boardrent.src.boardinghousemanagement;

import boardinghousemanagement.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Haier
 */
public class MessageService {

    public static void saveMessage(String username, String message) throws SQLException {
        try (Connection conn = (Connection) DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement("INSERT INTO messaging (Username, Message) VALUES (?, ?)")) {
            pstmt.setString(1, username);
            pstmt.setString(2, message);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
