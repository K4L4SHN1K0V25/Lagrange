
package lagrande2;

public class Lagrange2 {

	private double y[];
	private double x[];
	private double a[];

	public Lagrange2(double y[], double x[]) {
		this.x = x;
		this.y = y;
		a=new double[x.length];
	}

    private void getPolinomios_a() {
        double mult;
	for(int i=0;i<y.length;i++){
            mult = 1;
            for(int j=0;j<x.length;j++){
		if(i==j)continue;
                    mult=(x[i]-x[j])*mult;
            }
            a[i]=y[i]/mult;
            ///System.out.print("a"+"["+i+"]="+a[i]+"  ");
	}
    }
	
    public double getResultadoP(int p){
        getPolinomios_a();
	double mult=1;
	double valores[]=new double[a.length];
	//System.out.println("");
	for(int i=0;i<a.length;i++){
            mult=1;
            for(int j=0;j<a.length;j++){
		if(i==j)continue;
                    mult=(p-x[j])*mult;
            }
            valores[i]=a[i]*mult;
            //System.out.print(valores[i]);
            //if(i!=a.length-1)System.out.print(" + ");
	}
	double resultado=0;
	for(int k=0;k<valores.length;k++){
            resultado=resultado+valores[k];
	}
	return resultado;
    }



	public static void main(String[] args) {
		
	  double x[]={160,170,180};
	  double y[]={37.8,43.6,45.7};
          int z = 162;
	  Lagrange2 l=new Lagrange2(y, x);
	  double res=l.getResultadoP(z);
	  
	  System.out.println("El resultado es "+res);

	}

}

/*System.out.println("\n--METODO DE LAGRANGE--");
System.out.println("X es "+x[0] +", " +x[1] +", " +x[2]);
System.out.println("Y es "+y[0] +", " +y[1] +", " +y[2]);
System.out.println("T es "+z);*/
