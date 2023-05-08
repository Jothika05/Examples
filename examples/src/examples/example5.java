package examples;

public class example5 {

	public static void main(String[] args) {
		int a[]={1,3,3};
		int b[]= {2,3,5,7};
		int len=a.length + b.length;
		int c[]=new int[len];
		
		for(int i=0;i<a.length;i++) 
		{
          c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++) {
			c[i]=b[j];
			j++;
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
