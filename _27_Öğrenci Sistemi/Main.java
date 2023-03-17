public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut","TRH","555");
        Teacher t2= new Teacher("Graham Bell","FZK","444");
        Teacher t3 = new Teacher("Steve","BIO","1111");
        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik =new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course bio = new Course("Bioloji","101","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Burak Ançel","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(50,50,50);
        s1.addSozlu(20,20,20);

        s1.printNote();
        s1.isPass();


    }
}
