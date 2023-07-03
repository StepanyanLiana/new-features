package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        Set<String> allZones = ZoneId.getAvailableZoneIds();
        allZones.forEach(System.out::println);
    }
}
