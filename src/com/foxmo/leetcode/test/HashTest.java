package com.foxmo.leetcode.test;

import java.util.HashMap;
import java.util.Objects;

public class HashTest {
    public static class Key{
        public String name;

        public Key(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(name, key.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {
        HashMap<Key, String> map = new HashMap<>();
        map.put(new Key("1"),"a");
        map.put(new Key("2"),"b");
        map.put(new Key("3"),"c");
        map.put(new Key("4"),"d");
        System.out.println(map.get(new Key("1")));  //null

    }
}
