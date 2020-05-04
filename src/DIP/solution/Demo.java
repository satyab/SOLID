package DIP.solution;

public class Demo {

    public static void main(String[] args) {
        Person john = new Person("John");
        Person chris = new Person("Chris");
        Person susan = new Person("Susan");
        Person suzi = new Person("Suzi");

        RelationShip relationShip = new RelationShip();
        relationShip.addParentChildRelation(john, chris);
        relationShip.addParentChildRelation(john, suzi);

        Research research = new Research(relationShip);

    }
}
