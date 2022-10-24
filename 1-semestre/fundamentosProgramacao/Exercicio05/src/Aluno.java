public class Aluno {
    private String matricula, nome;
    private double frequencia, p1, p2, p3, me, mediaG1, mediaG2;
    private boolean g1, g2;

    public Aluno() {
        this.matricula = "<VALOR NÃO INFORMADO>";
        this.nome = "<VALOR NÃO INFORMADO>";
        this.frequencia = 0;
        this.p1 = 0;
        this.p2 = 0;
        this.p3 = 0;
        this.me = 0;
        this.mediaG1 = 0;
        this.mediaG2 = 0;
        this.g1 = false;
        this.g2 = false;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", frequencia=" + frequencia +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", me=" + me +
                ", mediaG1=" + mediaG1 +
                ", g1=" + g1 +
                ", g2=" + g2 +
                '}';
    }

    public void calculaG1(){
        calculaMediaG1();
        if (this.mediaG1>=7 && this.frequencia >= 75){
            this.g1 = true;
        }else {
            this.g1 = false;
        }
    }

    public void calculaG2(){
        double notaG2 = getMediaG1()+getMediaG2();
        if (this.mediaG1>=4 && this.frequencia>=75){
            if (notaG2>=5){
                this.g2 = true;
            }else {
                this.g2=false;
            }
        }else {
            this.g2=false;
        }

    }

    public String aprovacao(){
        calculaMediaG1();
        if (this.g1){
            return "Aluno APROVADO em G1";
        }else if (g2){
            return "Aluno APROVADO em G2";
        } else if (!g1 && !g2 &&frequencia>=75){
            return "Aluno REPROVADO em G1 e G2";
        }else{
            return "Aluno REPROVADO sem direito a G2";
        }
    }

    public void calculaMediaG1(){
        this.mediaG1 = (this.p1+this.p2+this.p3+this.me)/4;
    }


    public String relatorioAluno(){
        return  "\nMatricula= " + getMatricula() +
                "\nNome= " + getNome() +
                "\nFrequencia= " + getFrequencia() +"%"+
                "\nP1= " + getP1() +
                "\nP2= " + getP2() +
                "\nP3= " + getP3() +
                "\nMedia de exercíos= " + getMe() +
                "\nStatus =" + this.aprovacao();
    }
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFrequencia() {
        return this.frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getP1() {
        return this.p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return this.p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return this.p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getMe() {
        return this.me;
    }

    public void setMe(double me) {
        this.me = me;
    }

    public double getMediaG1() {
        return this.mediaG1;
    }

    public void setMediaG1(double mediaG1) {
        this.mediaG1 = mediaG1;
    }

    public boolean isG1() {
        return this.g1;
    }

    public void setG1(boolean g1) {
        this.g1 = g1;
    }

    public boolean isG2() {
        return this.g2;
    }

    public void setG2(boolean g2) {
        this.g2 = g2;
    }

    public double getMediaG2() {
        return this.mediaG2;
    }

    public void setMediaG2(double mediaG2) {
        this.mediaG2 = mediaG2;
    }
}
