package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_PokemonDonTGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> pokeList= Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int pokeSum = 0;

        while(pokeList.size()>0){
            int pokeIndex = Integer.parseInt(sc.nextLine());
            int pokePower = 0;

                if(pokeIndex<0){
                    pokePower = pokeList.get(0);
                    pokeList.remove(0);
                    pokeSum+=pokePower;
                    int lastPokemon = pokeList.get(pokeList.size()-1);
                    pokeList.add(0,lastPokemon);
                    pokeModify(pokeList,pokePower);
                }
                else if(pokeIndex>pokeList.size()-1){
                    pokePower=pokeList.get(pokeList.size()-1);
                    pokeList.remove(pokeList.size()-1);
                    pokeSum+=pokePower;
                    int firstPokemon=pokeList.get(0);
                    pokeList.add(firstPokemon);
                    pokeModify(pokeList,pokePower);
                }else{
                    pokePower = pokeList.get(pokeIndex);
                    pokeSum += pokePower;
                    pokeList.remove(pokeIndex);
                    pokeModify(pokeList,pokePower);
                }
        }
        System.out.println(pokeSum);
    }
    public static void pokeModify(List<Integer> pokemons, int pokePower) {
        for (int i = 0; i <= pokemons.size() - 1; i++) {
            int currentPokemon = pokemons.get(i); //текущ елемент
            if (currentPokemon <= pokePower) {
                currentPokemon += pokePower;
            } else {
                currentPokemon -= pokePower;
            }
            pokemons.set(i, currentPokemon);
        }
    }
}
