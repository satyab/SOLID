package DIP.solution;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RelationShip implements RelationShipBrowser {

    static class Triplets {

        Person parent;
        Person child;
        Relation relation;

        public Triplets(Person parent, Person child, Relation relation) {
            this.parent = parent;
            this.child = child;
            this.relation = relation;
        }

        public Person getParent() {
            return parent;
        }

        public void setParent(Person parent) {
            this.parent = parent;
        }

        public Person getChild() {
            return child;
        }

        public void setChild(Person child) {
            this.child = child;
        }

        public Relation getRelation() {
            return relation;
        }

        public void setRelation(Relation relation) {
            this.relation = relation;
        }
    }

    private List<Triplets> relations;

    public RelationShip() {
        this.relations = new ArrayList<>();
    }

    public List<Triplets> getRelations() {
        return relations;
    }

    public void addParentChildRelation(Person parent, Person child) {
        this.relations.add(new Triplets(parent, child, Relation.PARENT));
        this.relations.add(new Triplets(child, parent, Relation.CHILD));
    }

    @Override
    public List<Person> getAllChildrens(String name) {
        return this.relations.stream().filter(
            t -> t.getParent().getName().equals(name) && t.getRelation().equals(Relation.PARENT))
            .map(Triplets::getChild)
            .collect(
                Collectors.toList());

    }

}
