package Chapter2;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: ImplementPredicate
 * Date: 2017-09-20
 * Time: 오후 5:24
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ImplementPredicate {
    public String getNamesSatisfyingCondition(
            Predicate<String> condition, String... names) {
        return Arrays.stream(names)
                .filter(condition)
                .collect(Collectors.joining(", "));
    }

    public static final Predicate<String> LENGTH_FIVE = s -> s.length() == 5;
    public static final Predicate<String> STARTS_WITH_S = s -> s.startsWith("S");
}
