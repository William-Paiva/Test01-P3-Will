package br.edu.univas.vo;

public class Masters extends Student{

    Masters master;

    public Masters(int cpf, String name, String email) {
        super(cpf, name, email);
    }

    public Masters getMaster() {
        return master;
    }

    public void setMaster(Masters master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Masters{" +
                "master=" + master +
                '}';
    }
}
