package homeWork3.Advanced.Task1;

public class Main {
    public static void main(String[] args) {
        Flora fir = new Trees("fir",true );
        Flora pine = new Trees("pine",true);
        Flora rose = new Bushes("rose");
        Flora fern = new Bushes("fern");

        Flora[] floras = {fir,pine,rose,fern};
        for (Flora flora: floras) {
            flora.showWhatYouCan();
        }
    }



}
