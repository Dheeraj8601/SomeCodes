class Bike {
    final int spped = 90;
}

class Honda3 extends Bike {
    int spped = 150;

    public static void main(String args[]) {
        Honda3 obj = new Honda3();
        System.out.println(obj.spped);
    }
}