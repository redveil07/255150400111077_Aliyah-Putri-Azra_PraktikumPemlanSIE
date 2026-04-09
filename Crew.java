public class Crew implements ICrew, Player{
    private String name;
    private boolean isAlive = true;

    public Crew(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("crew " + this.name + "bekerja");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setAlive(boolean status) {
        this.isAlive = status;
    }

    @Override
    public void kick() {
        System.out.println(this.name + " has been kicked out!");
    }


    
    public boolean isAlive() {
        return this.isAlive;
    }

    public void callMeeting() {
        if (isAlive) {
            System.out.print(this.name + " ada mayat bro ");
            System.out.print("semuanyaaaa diskusiiiii ");
            System.out.println("Ayo cari si imposter sussyyyy");
        } else {
            System.out.println(this.name + " sudah meninggal tidak bisa meeting");
        }
    }
}