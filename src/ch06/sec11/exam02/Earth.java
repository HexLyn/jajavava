package ch06.sec11.exam02;

public class Earth {
    static final double EARTH_RADIUS = 6400;
//상수를 표시할 땐 전부 대문자로 표기하는게 관례.
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
    }
}
