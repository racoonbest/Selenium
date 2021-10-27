package polymorphism;

import java.util.List;

public class WorkPlace {
    public void goToWork(List<Parent>parents){
        for (Parent parent:parents
        ) {parent.work();

        }
    }

}
