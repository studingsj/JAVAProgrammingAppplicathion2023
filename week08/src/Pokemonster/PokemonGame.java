package Pokemonster;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PokemonGame { //week08 NullPointerException(다른 번호 선택시 예외 처리로 해결)
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다.\n야생 포켓몬이 나타났습니다.");
//        System.out.println(Math.random());  // 0.0 <= x < 1.0
//        System.out.println((int)(Math.random() * 6) + 1 );  // 1.0 <= x < 6.0

        //적군 포켓몬스터 랜덤 생성
        Pokemon enemy = null;
        int enemyPick = (int)(Math.random() *3 );
        if(enemyPick == 0 ) {
            NoFly noFly = new NoFly();
            enemy = new Pikachu(noFly);
        } else if (enemyPick == 1 ) {
            NoFly noFly = new NoFly();
            enemy= new Squirtle(noFly);
        } else if (enemyPick  == 2 ) {
            Wings wings = new Wings();
            enemy = new Charizard(wings);
        } else {
            System.out.println("여긴 영원히 실행 안됩니다.");
        }

//        플레이어 포켓몬
//        Pokemonster.Pokemon player = new Pokemonster.Pokemon(); //객체 생성 불가능

        try{
            Pokemon player = null; //추상클래스의 변수 선언운 거눙 (upcasting 용)
            Scanner s = new Scanner(System.in);
            while(true) {
                System.out.println("포겟몬을 고르세요. \n1) 피카쥬 2) 꼬부기 3) 리자몽 : ");
                int menu = s.nextInt();
                if (menu == 1) {
                    player =new Pikachu(new NoFly());
                    break;
                } else if ( menu == 2) {
                    player = new Squirtle(new NoFly());
                    break;
                } else if ( menu == 3) {
                    player = new Charizard(new Wings());
                    break;
                } else {
                    System.out.println("정상적인 값이 아닙니다.");
                }
            }

            int menu2 , skillMenu;
            while (true) {
                System.out.print("\t1) 전투 2) 도망 3) 종료 : ");
                menu2 = s.nextInt();
                if (menu2 == 1) {
                    System.out.print("전투 기술 \n 1) " +player.skills.get(0) + "    2) " + player.skills.get(1) + "    3) " + player.skills.get(2) + "  : ");
                    skillMenu =s.nextInt();
//                player.attack(enemy , player.skills[skillMenu-1]);
                    player.attack(enemy, skillMenu);

                    enemy.attack(player, (int)(Math.random() * 3) + 1);
                } else if (menu2 == 2) {

                } else {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }
        } catch (InputMismatchException err) {
            System.out.println("입력 값은 숫자로 입력하셔야 합니다.");
            System.out.println("예외 내용 : " + err.getMessage());
        } catch (NullPointerException err ) {
            System.out.println("플레이어 객체가 생성되지 않았습니다.");
            System.out.println("에외 내용 : " + err.getMessage());
        } catch (IndexOutOfBoundsException err) {
            System.out.println("존재하지 않는 스킬입니다.(기술 범위를 벗어남)");
            System.out.println("에외 내용 : " + err.getMessage());
        } catch (Exception err) {
            System.out.println("예외가 발생했습니다.");
            System.out.println("예외 내용 : " + err.getMessage());
        } finally {
            System.out.println("프로그램 종료!");
        }
    }
}
