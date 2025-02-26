import java.io.*;
import java.sql.*;

public class OutFile {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ExploreHub?useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        int fileId = 1; // Change this if needed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement("SELECT file_data FROM Files WHERE file_id = ?");
            stmt.setInt(1, fileId);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Get the binary data
                Blob blob = rs.getBlob("file_data");
                InputStream inputStream = blob.getBinaryStream();
                int fileSize = (int) blob.length();
                System.out.println("Retrieved file size: " + fileSize + " bytes");

                // Debug: If file size is 0, there's an issue with storage
                if (fileSize == 0) {
                    System.out.println("Error: Retrieved file is empty!");
                    return;
                }

                // Save the file
                File outputFile = new File("retrieved_image.png"); // Ensure correct extension
                FileOutputStream outputStream = new FileOutputStream(outputFile);

                byte[] buffer = new byte[4096]; // Use a larger buffer size
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                inputStream.close();
                outputStream.close();
                System.out.println("File successfully retrieved: " + outputFile.getAbsolutePath());

            } else {
                System.out.println("File not found in the database.");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
