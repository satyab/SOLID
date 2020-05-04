package DIP.problem;

public class Research {

    public Research(RelationShip relationShip) {
        relationShip.getRelations().stream().filter(
            t -> t.getParent().getName().equals("John") && t.getRelation().equals(Relation.PARENT))
            .forEach(t -> System.out
                .println(t.getParent().getName() + " has child name " + t.getChild().getName()));
    }
}
