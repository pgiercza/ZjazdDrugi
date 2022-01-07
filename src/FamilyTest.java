public class FamilyTest {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Tomasz";
        dad.age = 33;
        System.out.println("Nazwisko rodu to: " + dad.surname);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname);
        System.out.println(dad.name + " " + dad.age);
        FamilyMember son = new FamilyMember();
        son.name = "Karol";
        son.age = 4;
        System.out.println(son.surname + " " + son.name + " " + son.age);
        dad.surname = "Kowalski";
        son.surname = "Kowalski";
        System.out.println(dad.surname);

    }
}
