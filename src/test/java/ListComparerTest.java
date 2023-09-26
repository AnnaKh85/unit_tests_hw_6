import org.example.ListComparer;
import static org.junit.Assert.*;

import org.example.ListStatistics;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListComparerTest {
    private ListComparer listComparer;

    @Before
    public void setUp() {
        listComparer = new ListComparer();
    }

    @Test
    public void testCompareLists_FirstListLarger() {
        List<Integer> list1 = Arrays.asList(5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        ListStatistics stats1 = new ListStatistics(list1);
        ListStatistics stats2 = new ListStatistics(list2);
        assertEquals("The first list has a larger average value", listComparer.compareLists(stats1, stats2));
    }

    @Test
    public void testCompareLists_SecondListLarger() {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(8, 10, 12);
        ListStatistics stats1 = new ListStatistics(list1);
        ListStatistics stats2 = new ListStatistics(list2);
        assertEquals("The second list has a larger average value", listComparer.compareLists(stats1, stats2));
    }

    @Test
    public void testCompareLists_EqualAverages() {
        List<Integer> list1 = Arrays.asList(2, 4, 6);
        List<Integer> list2 = Arrays.asList(3, 5, 7);
        ListStatistics stats1 = new ListStatistics(list1);
        ListStatistics stats2 = new ListStatistics(list2);
        assertEquals("Average values are equal", listComparer.compareLists(stats1, stats2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListStatistics_NullList() {
        new ListStatistics(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListStatistics_EmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        new ListStatistics(emptyList);
    }
}
