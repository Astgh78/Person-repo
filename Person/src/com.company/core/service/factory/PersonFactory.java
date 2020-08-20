package Core.service.factory;

public class PersonFactory {
    public static BasePersonAction getPersonType(BasePerson person) {
        if (person instanceof Dancer) {
            Dancer dancer = (Dancer)person;
            return new DancerImpl(dancer.getName(), dancer.getDesignation(), dancer.getGroupName());

        } else if (person instanceof Singer) {
            Singer singer = (Singer) person;
            return new SingerImpl(singer.getName(), singer.getDesignation(), singer.getBandName());


        } else if (person instanceof Programmer) {
            Programmer programmer = (Programmer) person;
            return new ProgrammerImpl(programmer.getName(), programmer.getDesignation(), programmer.getCompanyName());

        }

        return null;
    }

}
