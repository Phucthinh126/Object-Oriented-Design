package week_1;
// Dependency relationship
// Lớp bị phụ thuộc (Supplier)
public class EmailMessage {
    private String content; // nội dung tin nhắn
    private String recipient; // người nhận

    public EmailMessage(String content, String recipient) {
        this.content = content;
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public String getRecipient() {
        return recipient;
    }

    public  void validate(){
        if(recipient == null || !recipient.contains("@")){
            throw new IllegalArgumentException("Email khong hop le");
        }
    }

}
