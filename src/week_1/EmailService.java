package week_1;

// Dependency relationship
// Lớp thụ thuộc (Client) - phụ thuộc vào EmailMessage
public class EmailService {


    // Dependency qua tham số phương thức
    public void sendEmail(EmailMessage massage) {
        try {
            massage.validate(); // call method của đối tượng phụ thuộc
            System.out.println("Dang gui email toi: " + massage.getRecipient());
            System.out.println("Noi dung: " + massage.getContent());
            System.out.println("Da gui thanh cong !");

        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    // Dependency qua biến cục bộ
    public void sendWellcomeEmail(String userEmail){
        // tạo và sử dụng đối tượng phụ thuộc vào trong method
        EmailMessage wellcomeMsg = new EmailMessage("Chào mừng bạn đến với hệ thống!", userEmail );
        // wellcomeMsg là một biến cục bộ,
        sendEmail(wellcomeMsg);// gọi phương thức khác cùng trong một lớp
    }

    // Dependency qua giá trị trả về
    public EmailMessage createErrorMessage(String error){
        return new EmailMessage("Da xay ra loi: " +  error, "admin@sysoutem");

    }




}
