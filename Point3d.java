public class Point3d {

/** ���������� X **/
private double xCoord;

/** ���������� Y **/
private double yCoord;

/** ���������� Z **/
private double zCoord;


/** ����������� ��� ������������� ����� �� ��������� (x, y, z) **/ 
public Point3d(double x, double y, double z) {
xCoord = x;
yCoord = y;
zCoord = z;
}

/** ����������� ��� ����������: �� ��������� ������������ ����� � ������ ��������� **/
public Point3d() {
this(0, 0, 0);
}

/** ���������� ���������� X **/
public double getX() {
return xCoord;
}

/** ���������� ���������� Y **/
public double getY() {
return yCoord;
}

/** ���������� ���������� Z **/
public double getZ() {
return zCoord;
}

/** ������������� �������� ���������� X **/ 
public void setX(double val) {
xCoord = val;
}

/** ������������� �������� ���������� Y **/ 
public void setY(double val) {
yCoord = val;
}

/** ������������� �������� ���������� Z **/ 
public void setZ(double val) {
zCoord = val;
}

/** ��������� �� ����� SPoint **/
public double distanceTo(Point3d SPoint) {
return Math.sqrt(Math.pow(- this.xCoord + SPoint.xCoord, 2)
+ Math.pow(- this.yCoord + SPoint.yCoord, 2)
+ Math.pow(- this.zCoord + SPoint.zCoord, 2));
}

public boolean equals(Point3d SPoint) 
{ 
if(SPoint.xCoord == this.xCoord &&
SPoint.yCoord == this.yCoord &&
SPoint.zCoord == this.zCoord) return true;
else return false;
}

}
