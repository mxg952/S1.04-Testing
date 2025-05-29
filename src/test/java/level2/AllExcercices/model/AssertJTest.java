package level2.AllExcercices.model;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    void givenTwoEqualIntegers_whenCompared_thenTheyAreEqual() {
        Integer a = 5;
        Integer b = 5;
        assertThat(a).isEqualTo(b);
    }

    @Test
    void givenTwoDifferentIntegers_whenCompared_thenTheyAreNotEqual() {
        Integer a = 5;
        Integer b = 10;
        assertThat(a).isNotEqualTo(b);
    }

    @Test
    void givenTwoSameReferences_whenCompared_thenTheyAreSame() {
        String x = "hello";
        String y = x;
        assertThat(x).isSameAs(y);
    }

    @Test
    void givenTwoDifferentObjectsWithSameContent_whenCompared_thenTheyAreNotSame() {
        String x = new String("hello");
        String y = new String("hello");
        assertThat(x).isNotSameAs(y);
    }

    @Test
    void givenTwoEqualArrays_whenCompared_thenTheyAreEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assertThat(array1).isEqualTo(array2);
    }

    @Test
    void givenOrderedListOfFruits_whenChecked_thenContainsInCorrectOrder() {
        Skater punk = new Skater("Dustin Dolin");
        Skater flat = new Skater("Leticia Buffoni");
        Skater bowl = new Skater ("Grant Taylor");

        List<Skater> skaters = List.of(punk, flat, bowl);

        assertThat(skaters).containsExactly(punk, flat, bowl);
    }

    @Test
    void givenListOfFruits_whenChecked_thenContainsInAnyOrder() {
        Skater punk = new Skater("Dustin Dolin");
        Skater flat = new Skater("Leticia Buffoni");
        Skater bowl = new Skater ("Grant Taylor");

        List<Skater> skaters = List.of(punk, flat, bowl);

        assertThat(skaters).containsExactlyInAnyOrder(flat, bowl, punk);
    }

    @Test
    void givenListOfFruits_whenChecked_thenOneObjectAppearsOnlyOnce() {
        Skater punk = new Skater("Dustin Dolin");
        Skater flat = new Skater("Leticia Buffoni");
        Skater bowl = new Skater ("Grant Taylor");

        List<Skater> skaters = List.of(punk, flat, bowl);

        assertThat(skaters).containsOnlyOnce(punk);
    }

    @Test
    void givenListOfFruits_whenChecked_thenDoesNotContainElement() {
        Skater punk = new Skater("Dustin Dolin");
        Skater flat = new Skater("Leticia Buffoni");
        Skater bowl = new Skater ("Grant Taylor");
        Skater oldSchool = new Skater ("Jay Adams");

        List<Skater> skaters = List.of(punk, flat, bowl);

        assertThat(skaters).doesNotContain(oldSchool);
    }

    @Test
    void givenMapWithEntries_whenChecked_thenContainsKeyAndValue() {
        Map<String, Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("Leticia Bufoni", 30);
        namesAndAges.put("Tony Hawk", 25);

        assertThat(namesAndAges).containsKey("Leticia Bufoni");
        assertThat(namesAndAges).containsEntry("Tony Hawk", 25);
    }

    @Test
    void givenArray_whenAccessingInvalidIndex_thenThrowsException() {
        int[] array = {1, 2, 3};

        assertThatThrownBy(() -> {
            int x = array[10];
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

    @Test
    void givenEmptyOptional_whenChecked_thenIsEmpty() {
        Optional<String> empty = Optional.empty();
        assertThat(empty).isEmpty();
    }
}
