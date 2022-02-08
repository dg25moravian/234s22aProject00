

public class Team5 extends Team
{
    public Team5(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Davin Glynn"));

        members.add(new TeamMember("Kyle Adams"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}

