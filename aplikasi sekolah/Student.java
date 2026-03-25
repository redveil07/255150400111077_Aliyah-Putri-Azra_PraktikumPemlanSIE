
public class Student {
private String nama;
private int skor;
public Student(String nama) {
this.nama = nama;
}
private void setNama(String nama) {
this.nama = nama;
}
public void updateNama(String nama) {
    this.nama = nama; 
}

public String getNama(){
    return nama;

}

public void setSkor(int skor) {
    this.skor = skor; 
}
public int getSkor() {
return this.skor;
}

public static void setNama(Student std, String nama) {
    std.nama = nama;
}
}

