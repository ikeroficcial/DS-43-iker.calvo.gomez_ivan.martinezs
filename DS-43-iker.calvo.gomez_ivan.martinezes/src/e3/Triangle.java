package e3;

import java.util.Objects;

public class Triangle {
    int angle0, angle1, angle2;

    public Triangle(int angel0, int angel1, int angel2) {
        this.angle0 = angel0;
        this.angle1 = angel1;
        this.angle2 = angel2;
        if (angel0 + angel1 + angel2 != 180) {
            throw new IllegalArgumentException();
        }
    }

    public int angle0() {
        return angle0;
    }

    public int angle1() {
        return angle1;
    }

    public int angle2() {
        return angle2;
    }

    public Triangle(Triangle t) {
        this.angle0 = t.angle0;
        this.angle1 = t.angle1;
        this.angle2 = t.angle2;
        if (angle0 + angle1 + angle2 != 180) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isRight() {
        if (angle0 == 90 || angle1 == 90 || angle2 == 90) {
            return true;
        } else return false;
    }

    public boolean isAcute() {
        if (angle0 < 90 && angle1 < 90 && angle2 < 90) {
            return true;
        } else return false;
    }

    public boolean isObtuse() {
        if (angle0 > 90 || angle1 > 90 || angle2 > 90) {
            return true;
        } else return false;
    }

    public boolean isEquilateral() {
        if (angle0 == angle1 && angle2 == angle0) {
            return true;
        } else return false;
    }

    public boolean isIsosceles() {
        if (angle0 == angle1 || angle2 == angle0 || angle2 == angle1) {
            return true;
        } else return false;
    }

    public boolean isScalene() {
        if (angle0 != angle1 && angle2 != angle0 && angle2 != angle1) {
            return true;
        } else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        if (angle0==triangle.angle0){
            if (angle1==triangle.angle1){
                if (angle2==triangle.angle2){
                    return true;
                }
                else return false;
            }
            if (angle1==triangle.angle2){
                if (angle2==triangle.angle1){
                    return true;
                }
                else return false;
            }
        }
        if (angle0==triangle.angle1){
            if (angle1==triangle.angle0){
                if (angle2==triangle.angle2){
                    return true;
                }
                else return false;
            }
            if (angle1==triangle.angle2){
                if (angle2==triangle.angle0){
                    return true;
                }
                else return false;
            }
        }
        if (angle0==triangle.angle2){
            if (angle1==triangle.angle1){
                if (angle2==triangle.angle0){
                    return true;
                }
                else return false;
            }
            if (angle1==triangle.angle0){
                if (angle2==triangle.angle1){
                    return true;
                }
                else return false;
            }
        }
        return angle0 == triangle.angle0 && angle1 == triangle.angle1 && angle2 == triangle.angle2;

    }

    @Override
    public int hashCode() {
        int result = 1;
        result+=angle1*angle1+angle0*angle0+angle2*angle2;
        return result;
    }
}

