package enumss;

public class TestCafe {
    public static void main(String[] args) {
       Cafe cafe1 = new Cafe();
       cafe1.setTamanoCafe(TamanoCafe.ALTO);
        System.out.println(cafe1.getTamanoCafe());
        System.out.println(cafe1.getTamanoCafe().getOnzas());
        System.out.println(cafe1.getTamanoCafe().getTipoTapa());

        Cafe cafe2 = new Cafe();
        cafe2.setTamanoCafe(TamanoCafe.MEDIANO);
        System.out.println("" + cafe2.getTamanoCafe());
        System.out.println(cafe2.getTamanoCafe().getOnzas());
        System.out.println(cafe2.getTamanoCafe().getTipoTapa());

        Cafe cafe3  = new Cafe();
        cafe3.setTamanoCafe(TamanoCafe.GRANDE);
        System.out.println("" + cafe3.getTamanoCafe());
        System.out.println(cafe3.getTamanoCafe().getOnzas());
        System.out.println(cafe3.getTamanoCafe().getTipoTapa());

        Cafe cafe4 = new Cafe();
        cafe4.setTamanoCafe(TamanoCafe.EXTRAGRANDE);
        System.out.println("" + cafe4.getTamanoCafe());
        System.out.println(cafe4.getTamanoCafe().getOnzas());
        System.out.println(cafe4.getTamanoCafe().getTipoTapa());
    }

}
