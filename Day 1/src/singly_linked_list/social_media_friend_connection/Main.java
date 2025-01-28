package singly_linked_list.social_media_friend_connection;

public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 28);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);
        sm.removeFriend(1, 2);
        sm.displayFriends(1);

        sm.searchUser("Charlie", null);
        sm.countFriends();
    }
}
