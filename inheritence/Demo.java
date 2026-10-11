public class Demo {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(10, 20);
        int r2 = obj.sub(20, 10);
        int r3 = obj.mul(10, 20);
        int r4 = obj.div(20, 10);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

    }
}
