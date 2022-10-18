package crown.lib.structural.filter;

import java.util.List;

/**
 * Description：
 */
interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
