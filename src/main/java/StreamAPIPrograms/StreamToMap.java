package StreamAPIPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToMap {

    public static void main(String[] args) {
        User user1
                = new User(1, "User1", "Pune");

        User user2
                = new User(2, "User2", "Mumbai");

        User user3
                = new User(3, "User3", "Nagpur");

        System.out.println(toMap(user1, user2, user3));
    }

    private static Map<Integer, User> toMap(User u1, User u2, User u3){
        return Stream.of(u1,u2,u3).collect(Collectors.toMap(User::getUserId, user -> user));
    }

    private static Map<String, List<User>> anotherMap(User u1, User u2, User u3){
        return Stream.of(u1,u2,u3).collect(Collectors.groupingBy(User::getCity));
    }
}

class User {

    // Attributes of the user class
    private int userId;
    private String name;
    private String city;

    public User(int userId, String name,
                String city)
    {
        this.userId = userId;
        this.name = name;
        this.city = city;
    }
    public int getUserId() { return userId; }

    public String getName() { return name; }

    public String getCity() { return city; }
    @Override
    public String toString()
    {
        return "User [userId = "
                + userId + ", name = "
                + name + ", city = "
                + city + "]";
    }
}
