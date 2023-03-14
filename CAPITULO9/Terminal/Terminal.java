

 class Terminal {
    private String numero;
    private int tiempoConversacion;

    Terminal(String numero){
        this.numero=numero;
        this.tiempoConversacion=0;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero=numero;
    }

    public int gettiempoConversacion(){
        return tiempoConversacion;
    }

    public void settiempoConversacion(int tiempoConversacion){
        this.tiempoConversacion=tiempoConversacion;
    }

    @Override

    public String toString(){
        return "Num "+numero+" - "+this.tiempoConversacion+" seg de conversacion";
    }
    
    public void llama (Terminal t,int segundosLlamada){
        this.tiempoConversacion+=segundosLlamada;
        t.tiempoConversacion+=segundosLlamada;
    }
}
