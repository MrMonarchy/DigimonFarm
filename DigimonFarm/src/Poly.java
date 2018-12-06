//Class used to demonstrate a polymorph
public class Poly {
	class DemoOverload{

	    public int add(int x, int y){  

	    return x+y;

	    }

	    public int add(int x, int y, int z){ 

	    return x+y+z;

	    }

	    public int add(double x, int y){ 

	    return (int)x+y;

	    }

	    public int add(int x, double y){ 

	    return x+(int)y;

	    }

	}

	class Test{

	    public void main(String[] args){

	    DemoOverload demo=new DemoOverload();

	    System.out.println(demo.add(2,3));  

	    System.out.println(demo.add(2,3,4));    

	    System.out.println(demo.add(2,3.4));   

	    System.out.println(demo.add(2.5,3));   

	    }

	}

}

//learned how to set up this polymorph from a Java tutorial online







