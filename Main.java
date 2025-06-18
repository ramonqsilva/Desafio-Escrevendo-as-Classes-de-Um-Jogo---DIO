import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;

        do {
            System.out.println("_____Criar Novo Personagem_____");
            System.out.print("Digite o nome do personagem: ");
            String name = scan.nextLine();

            System.out.print("Escolha a classe do personagem (Mago, Guerreiro, Monge, Ninja): ");
            String typeInput = scan.nextLine().toLowerCase();

            String type;
            switch (typeInput) {
                case "mago":
                case "guerreiro":
                case "monge":
                case "ninja":
                case "andarilho":
                    type = typeInput;
                    break;
                default:
                    type = "andarilho";
                    break;
            }

            Character newCharacter = new Character(name, 0, type);
            newCharacter.atack();

            System.out.println("\nDeseja criar outro personagem? (s/n)");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("s"));

        System.out.println("Saindo...");
        scan.close();
    }

    static class Character {
        String name;
        int damage;
        String type;

        public Character(String name, int damage, String type) {
            this.name = name;
            this.damage = damage;
            this.type = type;
        }

        public void atack() {
            String atack;

            switch (this.type.toLowerCase()) {
                case "mago":
                    atack = "magia";
                    damage = 130;
                    break;
                case "guerreiro":
                    atack = "espada";
                    damage = 180;
                    break;
                case "monge":
                    atack = "artes marciais";
                    damage = 70;
                    break;
                case "ninja":
                    atack = "shuriken";
                    damage = 90;
                    break;
                case "andarilho":
                default:
                    atack = "sequência de socos";
                    damage = 2;
            }
            System.out.println("O " + this.type + " " + this.name + " infligiu "+ this.damage + " de dano com ataque de " + atack + ".");
        }
    }
}