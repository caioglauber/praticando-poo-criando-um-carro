
package carro;

public class Carro {

    private double velocidade;
    private int cambio;
    public boolean status;

    public Carro() {
        this.setStatus(false);
        this.cambio = 0;
        this.velocidade = 0;
    }

    public boolean ligado() {
        return this.getStatus();
    }

   

    public void ligarCarro() {

        if (this.cambio == 0) {
            System.out.println("Carro Ligado");
            this.setStatus(true);
            info();

            return;
        }
        this.setStatus(false);
        System.out.println("Colocar Marcha em Neutro. TROQUE A MARCHA PARA MUDAR");
    }

    public void desligarCarro() {
        if (this.cambio == 0 && this.velocidade == 0) {
            System.out.println("Carro Desligado!");
            this.setVelocidade(0);
            this.setStatus(false);
            info();

            return;
        }
        System.out.println("Diminua a Velocidade e selecione a marcha para Neutro");
    }

    public void acelerarCarro() {
        if (ligado() && this.cambio == 0) {
            System.out.println("Nao eh possivel acelerar - Troque a Marcha");
            info();
            return;

        } else if (ligado() && this.cambio > 0) {
            if (this.velocidade < 20 && this.cambio == 1) {
                this.velocidade++;
                info();
                return;
                
            } else if (this.velocidade >= 20 && this.velocidade < 40 && this.cambio == 2) {
                this.velocidade++;
                info();
                return;
            } else if (this.velocidade >= 40 && this.velocidade < 80 && this.cambio == 3) {
                this.velocidade++;
                info();
                return;
            } else if (this.velocidade >= 80 && this.velocidade < 100 && this.cambio == 4) {
                this.velocidade++;
                info();
                return;
            } else if (this.velocidade >= 100 && this.velocidade < 120 && this.cambio == 5) {
                this.velocidade++;
                info();
                return;
            } else if (this.velocidade >= 120 && this.cambio == 5) {
                System.out.println("Nao pode Ultrapassar 120 km/h");
                info();
                return;
            } else {
                System.out.println("Trocar a Marcha");
                return;

            }
        }

        System.out.println("Veiculo Desligado!");
        this.setStatus(false);
        info();

    }

    public void diminuirVelocidade() {
        if (this.getVelocidade() > 0 && this.getVelocidade() <= 120) {
            this.setVelocidade(this.getVelocidade() - 1);
            info();
            return;
        }
        System.out.println("Nao eh possivel Diminuir a Velocidade!");
        info();

    }

    public void virarEsquerda() {
        if (movimentando()) {
            if (this.cambio == 1 || this.cambio == 2) {
                System.out.println("Virando a Esquerda");
                return;
            }
            System.out.println("Diminua a velocidade!");
            info();
            return;
        }

        System.out.println("Veiculo Parado!");
        info();

    }

    public void virarDireita() {
        if (movimentando()) {
            if (this.cambio == 1 || this.cambio == 2) {
                System.out.println("Virando a Direita");
                return;
            }
            System.out.println("Diminua a velocidade!");
            info();
            return;
        }

        System.out.println("Veiculo Parado!");
        info();
    }

    public void verificarVelocidade() {
        info();
    }

    public void trocarMarcha() {
        if (movimentando()) {
            while (this.cambio < 5) {
                System.out.println("Marcha Anterior:  " + this.getCambio());
                this.cambio++;
                System.out.println("Marcha Atual:  " + this.getCambio());
                info();
                return;
            }
            System.out.println("Nao tem mais Marcha!");
            this.cambio = 0;
            System.out.println("Cambio NEUTRO");
            return;
        }
        System.out.println("Veiculo Parado!");
        
        System.out.println("Marcha Anterior:  " + this.getCambio());
        this.cambio++;
        
        if (this.cambio > 5) {
            System.out.println("Nao tem mais Marcha!");
            this.cambio = 0;
            System.out.println("Cambio NEUTRO");
            return;
        }
       System.out.println("Marcha Atual:  " + this.getCambio());
    }

    public void info() {
        System.out.println("Velocidade: " + this.getVelocidade() + " km/h");
        System.out.println("Marcha: " + this.getCambio());
        System.out.println("Ligado? " + this.getStatus());
    }

    public boolean movimentando() {
        return this.velocidade > 0;
    }
    
     public int cambio() {
        if (this.velocidade == 0) {
            this.cambio = 0;
        } else if (this.velocidade > 0 && this.velocidade <= 20) {
            this.cambio = 1;
        } else if (this.velocidade > 20 && this.velocidade <= 40) {
            this.cambio = 2;
        } else if (this.velocidade > 40 && this.velocidade <= 60) {
            this.cambio = 3;
        } else if (this.velocidade > 60 && this.velocidade <= 80) {
            this.cambio = 4;
        } else if (this.velocidade > 80 && this.velocidade <= 100) {
            this.cambio = 5;
        }

        return this.cambio;
    }

    public int getCambio() {
        return this.cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}
