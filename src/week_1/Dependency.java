package week_1;

// Lớp triển khai dependency
public class Dependency {
    public static void main(String[] args) {
        // thành phần phụ thuộc
        EmailService emailService = new EmailService();

        // Dependency qua tham số
        EmailMessage msg = new EmailMessage("Hello", "user@exam");
        emailService.sendEmail(msg);

        //Depependency qua biến cục bộ
        emailService.sendWellcomeEmail("newUser@example.com");

        // Dependency qua giá trị trả về
        EmailMessage errorMg = emailService.createErrorMessage("404 not found");
        emailService.sendEmail(errorMg);




    }
}