package ru.zhuravlev.homeworks.homework13.transport;

import ru.zhuravlev.homeworks.homework13.AreaType;

public interface Transport {
    boolean move(int distance, AreaType areaType);
}
