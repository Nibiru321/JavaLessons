import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public void setGoodStanding(boolean goodStanding) {
        this.hasGoodStanding = goodStanding;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "\"" + name + "\" " + gradYear + " " + hasGoodStanding;
    }
}

class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            MemberInfo newMember = new MemberInfo(name, gradYear, true);
            memberList.add(newMember);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> goodStandingGraduates = new ArrayList<MemberInfo>();
        Iterator<MemberInfo> iterator = memberList.iterator();

        while (iterator.hasNext()) {
            MemberInfo member = iterator.next();
            if (member.getGradYear() <= year) {
                if (member.inGoodStanding()) {
                    goodStandingGraduates.add(member);
                }
                iterator.remove();
            }
        }

        return goodStandingGraduates;
    }

    public void setGoodStanding(String name, boolean standing) {
        for (MemberInfo m : memberList) {
            if (m.getName().equalsIgnoreCase(name)) {
                m.setGoodStanding(standing);
                return;
            }
        }
    }

    public void printMemberList() {
        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }
}

class ClubApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClubMembers club = new ClubMembers();

        System.out.print("Enter number of members to add: ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter graduation year: ");
            int gradYear = Integer.parseInt(scanner.nextLine());
            club.addMembers(new String[]{name}, gradYear);

            System.out.print("Is the member in good standing? (true/false): ");
            boolean standing = Boolean.parseBoolean(scanner.nextLine());
            club.setGoodStanding(name, standing);
        }

        System.out.print("\nEnter graduation year cutoff to remove members: ");
        int cutoff = Integer.parseInt(scanner.nextLine());

        ArrayList<MemberInfo> removed = club.removeMembers(cutoff);

        System.out.println("\nRemoved good-standing graduates:");
        for (MemberInfo m : removed) {
            System.out.println(m);
        }

        System.out.println("\nRemaining club members:");
        club.printMemberList();

        scanner.close();
    }
}
