import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class FileJdbc {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ExploreHub?useSSL=false";
    private static final String DB_USER = "root";  // Change if needed
    private static final String DB_PASSWORD = "root";  // Change if needed

    public static void main(String[] args)throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Project ID: ");
        int projectId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter file path (e.g., C:/Users/.../file.pdf): ");
        String filePath = scanner.nextLine();
        
        System.out.print("Enter file type (Document or Image): ");
        String fileType = scanner.nextLine();

        File file = new File(filePath);
        
        if (!file.exists()) {
            System.out.println("File not found! Please check the path.");
            return;
        }

        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO Files (project_id, file_data, file_name, file_type, uploaded_at) VALUES (?, ?, ?, ?, NOW())");
             FileInputStream fis = new FileInputStream(file);
            stmt.setInt(1, projectId);
            stmt.setBinaryStream(2, fis, (int) file.length());
			stmt.setString(3, file.getName());
            stmt.setString(4, fileType);
			

            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted > 0 ? "File uploaded successfully!" : "Upload failed.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
