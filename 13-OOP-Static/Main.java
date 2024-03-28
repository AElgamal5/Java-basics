
public class Main {

    public static void main(String[] args) {
        /*
         * static: is a keyword modifier
         * - can be used with properties or methods
         * - also called static member
         * - any static member is shared between the owner class so shared between
         * objects
         * - can be used without creating new object
         * - example of static : 'Math' class
         */

        System.out.println(Friend.totalFriendsNo); // 0

        Friend f1 = new Friend("Amir", 50);
        System.out.println(f1);

        System.out.println(Friend.totalFriendsNo); // 1

        Friend f2 = new Friend("Samir", 51);
        System.out.println(f2);

        System.out.println(Friend.totalFriendsNo); // 2
        System.out.println(Friend.getTotalFriendsNo()); // 2

        Math.min(0, 0);
    }

}

class Friend {
    static int totalFriendsNo = 0;
    String name;
    int friendNum;

    Friend(String name, int friendNum) {
        this.name = name;
        this.friendNum = friendNum;
        Friend.totalFriendsNo++;
    }

    public String toString() {
        return (this.name + " " + this.friendNum);
    }

    static int getTotalFriendsNo() {
        return Friend.totalFriendsNo;
    }
}
