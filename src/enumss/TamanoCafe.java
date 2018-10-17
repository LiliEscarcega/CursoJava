package enumss;

public enum TamanoCafe {
    ALTO(8),
    MEDIANO(10),
    GRANDE(16),
    EXTRAGRANDE(20) {
        public String getTipoTapa(){
            return "B";

        }

    };

    private int onzas;

    TamanoCafe(int onzas){
        this.onzas = onzas;

    }

    public int getOnzas() {
        return onzas;
    }

    public String getTipoTapa (){
        return "A";
    }

}
