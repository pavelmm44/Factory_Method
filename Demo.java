public class Demo {

    public static void main(String[] args){
        Character character = new Character("Jace", ClassFactory.getClass("Barbarian"));

        character.setAttributes(Stats.generate());
        character.printSheet();

    }
}