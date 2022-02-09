public class Exercise14 {
    public static void main(String[] args) {
       int gradeLevel = 11;
       boolean isSenior = gradeLevel == 12;
       boolean isInterestedInVolunteering = true;
       boolean shouldSendVolunteerInfo = isSenior == true && isInterestedInVolunteering == true;

       System.out.println("Grade: "+gradeLevel + "\nSenior: "+isSenior
               + "\nInterested in Volunteering: "+isInterestedInVolunteering
               + "\nSend Volunteering Info: "+shouldSendVolunteerInfo);
    }
}
