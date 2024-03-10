package lt.vtmc.praktiniai.users;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
//        int count = 0;
//        for (User user: users){
//            if ( user.getAge() > 25 ){
//                count++;
//            }
//        }
        return (int) users.stream()
                .filter(u -> u.getAge() > 25).count();

    }

    public static double getAverageAge(List<User> users) {
//        double userAge = 0;
//        for (User user: users){
//            userAge = userAge + user.getAge();
//        }
//        return (double) userAge / users.size();
        return users.stream()
                .mapToInt(User::getAge)
                .average().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
//        int userMinAge = users.get(0).getAge();
//        for (User user: users){
//           if (user.getAge() < userMinAge){
//               userMinAge = user.getAge();
//            }
//        }
//        return userMinAge;
        return users.stream()
                .mapToInt(User::getAge)
                .min().orElse(0);
    }

    public static User findByName(List<User> users, String name) {
//        for (User user : users) {
//            if (user.getName().equals(name)) {
//                return user;
//            }
//        }
//        return null;
        return users.stream()
                .filter(u -> u.getName().equals(name)).findFirst().get();
    }

    public static List<User> sortByAge(List<User> users) {
//        Collections.sort(users, new UserAgeComparator());

//        return users;
        return users.stream()
                .sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
//        User userOldest = users.get(0);
//        for (User user : users){
//            if (user.getAge() > userOldest.getAge()){
//                userOldest = user;
//            }
//        }
//       return userOldest;
        return users.stream()
                .max(Comparator.comparing(User::getAge)).orElse(null);

    }

    public static int sumAge(List<User> users) {
//        int sumAge = 0;
//        for (User user: users){
//            sumAge = sumAge + user.getAge();
//        }
//        return sumAge;
        return users.stream()
                .mapToInt(User::getAge).sum();

    }
}
