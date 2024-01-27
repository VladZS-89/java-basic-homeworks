package ru.zhuravlev.homeworks.homework13.transport;

import ru.zhuravlev.homeworks.homework13.AreaType;
import ru.zhuravlev.homeworks.homework13.Human;

public interface Transport {
    boolean move(int distance, AreaType areaType);

    void setDriver(Human driver);
}
