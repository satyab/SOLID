package DIP.solution;

import java.util.List;

public class Research {

    public Research(RelationShipBrowser relationShip) {
        List<Person> john = relationShip.getAllChildrens("John");

        for (Person child : john) {
            System.out.println("John has a child name " + child.getName());
        }

    }
}
