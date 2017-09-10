package com.java8.sample.data;

import java.util.HashMap;
import java.util.Map;

public class MapSampleData {

  public static Map<Integer, String> mapSampleDataIntegerString() {

    Map<Integer, String> mapData = new HashMap<>();

    mapData.put(1, "Shyam");
    mapData.put(2, "Shyam");
    mapData.put(3, "Ram");

    return mapData;
  }
}
