package com.javacollections;
import java.util.*
;
enum  METRO_CITIES { CHENNAI, BENGALURU, MUMBAI, KUALA_LUMPUR, JAKARTA, SHANGAI}

public class SetTypes {
    public static void main(String[] args) {
        
        Set<Integer> hash_set = new HashSet<>();
        hash_set.addAll(Arrays.asList(new Integer[] {12,34,45,67,78,89, 12}));
        
        Set<METRO_CITIES> enum_set;
        enum_set = EnumSet.of(METRO_CITIES.CHENNAI, METRO_CITIES.BENGALURU, METRO_CITIES.JAKARTA, METRO_CITIES.BENGALURU ,METRO_CITIES.SHANGAI);
   
        Set<String> linked_hashset = new LinkedHashSet<>();
        linked_hashset.addAll(Arrays.asList(new String[] {"India", "Singapore", "Malaysia", "Indonesia", "Japan", "India"}));

        Set<Character> tree_set = new TreeSet<>();
        tree_set.addAll(Arrays.asList(new Character[] {'A', 'B', 'C', 'D', 'E', 'A'}));

        System.out.println("\nSet Implementation: ");
        System.out.println("\nHast Set: " + hash_set);
        System.out.println("EnumSet: " + enum_set);
        System.out.println("Linked HastSet: " + linked_hashset);
        System.out.println("Tree Set: " + tree_set);

        System.out.println("\nIterator Method: ");
        Iterator<Integer> iterate_hash = hash_set.iterator();
        System.out.print("Iterating HashSet: ");
        while (iterate_hash.hasNext()) {
            System.out.print(iterate_hash.next() + " ");
        }

        Iterator<METRO_CITIES> iterate_enum = enum_set.iterator();
        System.out.print("\nIterating EnumSet: ");
        while (iterate_enum.hasNext()) {
            System.out.print(iterate_enum.next() + " ");
        }

        Iterator<String> iterate_linked_hashset = linked_hashset.iterator();
        System.out.print("\nIterating LinkedHashSet: ");
        while (iterate_linked_hashset.hasNext()) {
            System.out.print(iterate_linked_hashset.next() + " ");
        }

        Iterator<Character> iterate_treeset = tree_set.iterator();
        System.out.print("\nIterate TreeSet: " );
        while (iterate_treeset.hasNext()) {
            System.out.print(iterate_treeset.next() + " ");
        }
        System.out.println();
    }
}
