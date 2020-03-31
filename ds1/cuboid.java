public class cuboid {
    int length, breath, heigth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;

    }

    public void vol() {

        int height = 0;

        System.out.println("Your volume is :" + " " + length * breath * height);
    }

    public static void main(String[] args) {
        cuboid obj = new cuboid();
        obj.setLength(1);
        obj.setBreath(7);
        obj.setHeigth(5);
        obj.vol();
    }
}