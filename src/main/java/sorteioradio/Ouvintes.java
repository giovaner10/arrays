package sorteioradio;

import java.util.ArrayList;
import java.util.Comparator;

public class Ouvintes {

    private String nome;

    private int lance;

    private int numeroJogadas;

    private int numeroAcertos;



    public Ouvintes(String nome) {
        this.nome = nome;
    }

    public Ouvintes() {

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLance() {
        return lance;
    }

    public void setLance(int lance) {
        this.lance = lance;
    }

    public int getNumeroJogadas() {
        return numeroJogadas;
    }

    public void setNumeroJogadas(int numeroJogadas) {
        this.numeroJogadas = numeroJogadas;
    }

    public int getNumeroAcertos() {
        return numeroAcertos;
    }

    public void setNumeroAcertos(int numeroAcertos) {
        this.numeroAcertos = numeroAcertos;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean criarOuvinte(Ouvintes ouvintes, ArrayList<Ouvintes> ouvintesArrayList) {

        boolean add = ouvintesArrayList.add(ouvintes);

        return add;
    }


    public void listarTodos(ArrayList<Ouvintes> ouvintesArrayList) {

        if (ouvintesArrayList.isEmpty()) {
            System.out.println("Lista vazia");

        } else {

            for (Ouvintes ouvinte : ouvintesArrayList) {

                System.out.println(ouvinte.toString());
            }
        }
    }




    public void listarPorIndex(ArrayList<Ouvintes> ouvintesArrayList, int index) {

        System.out.println(ouvintesArrayList.get(index));
    }

    public void apagarPorIndex(ArrayList<Ouvintes> ouvintesArrayList, int index) {

        try {
            ouvintesArrayList.remove(index);
            System.out.println("Usuario deletado");

        } catch (Exception e) {
            System.out.println("Posicao invalida, verifique sua lista e tente novamente");
        }
    }

    public void editarPorIndex(ArrayList<Ouvintes> ouvintesArrayList, int index, String novoNome) {


        try {
            ouvintesArrayList.get(index).setNome(novoNome);
            System.out.println("Nome alterado com sucesso");


        } catch (Exception e) {
            System.out.println("Posicao invalida, verifique sua lista e tente novamente");
        }
    }






    public void jogadaUsuario(ArrayList<Ouvintes> ouvintesArrayList, int index, int pesoDoJogo, int lance) {

        try {


            ouvintesArrayList.get(index).setNumeroJogadas(
                    ouvintesArrayList.get(index).getNumeroJogadas() + 1
            );


            if(
                     lance >= pesoDoJogo - 150 &&
                             lance <= pesoDoJogo + 150

            ){
                ouvintesArrayList.get(index).setNumeroAcertos(
                        ouvintesArrayList.get(index).getNumeroAcertos() + 1
                );

                System.out.println("Usuario acertou");
                System.out.println(ouvintesArrayList.get(index).toString());
            }else {
                System.out.println("Infelizmente vc nao acertou");
            }


        } catch (Exception e) {
            System.out.println("Posicao invalida, verifique sua lista e tente novamente");
        }
    }

    public void verRanking(ArrayList<Ouvintes> ouvintesArrayList) {

        ouvintesArrayList.sort(Comparator.comparing(Ouvintes::getNumeroAcertos));
        listarTodos(ouvintesArrayList);
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + " - Lance: " + getLance() + " - Numero de de lances: " + numeroJogadas + " - numero de acertos " + numeroAcertos;
    }

   /* @Override
    public String toString() {
        return super.toString();
    }*/


}
