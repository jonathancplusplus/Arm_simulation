package kinematics;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class ForwardK {
    private double Q[];
    private double L[];

    public ForwardK(double[] l) {
        L = l;
    }
    public double[] getCartesian(double [] q){
        Q = q;


        //ordenando
        //x->y
        //y->z
        //z->x
        //aqui opera solo con radianes


        double x = (L[0]*cos(Q[1])+L[1]*cos(Q[1]+Q[2]))*sin(Q[0]);
        double y = (L[0]*cos(Q[1])+L[1]*cos(Q[1]+Q[2]))*cos(Q[0]);
        double z =  L[0]*sin(Q[1])+L[1]*sin(Q[1]+Q[2]);


        //if(angle==Angle.DEGREES) for(int i=0;i<Q.length;i++) Q[i] = Q[i]*(180/Math.PI);

        double cartesian[] = new double[3];
        cartesian[0] = x;
        cartesian[1] = y;
        cartesian[2] = z;



        return cartesian;
    }



}