package alist;

public class AList {


	int[] ar  = new int[100];
	int count = 0;

	public int get(int pos)
	{
		return ar[pos];
	}
	public void set(int pos, int val)
	{
		ar[pos] = val;
	}

	public void addEnd(int val)
	{
		ar[count++] = val;
	}

	public void addStart(int val)
	{
		for (int i = count; i >0 ; i--) 
		{
			ar[i]=ar[i-1];
		}
		ar[0]=val;
		count++;

	}
	public void addPos(int pos, int val)
	{
		for (int i = count; i > pos; i--) 
		{

			ar[i]=ar[i-1];
		}
		if(count>pos)
		{
			ar[pos]=val;
			count++;
		}
		else
		{
			count=pos+1;
			ar[pos]=val;
		}	

	}
	public void delStart()
	{
		for (int i = 0; i < count; i++) 
		{
			ar[i]=ar[i+1];
		}
		if(count>0)
			count--;
//		else 
//			throw
	}
	public void delEnd()
	{
		count--;
	}
	public void delPos(int pos)
	{
		for (int i = pos; i < count; i++) 
		{
			ar[i]=ar[i+1];
		}
		count--;
	}
	public int size()
	{
		return count;
	}
	public void sort()
	{
		for (int i = 0; i < count; i++) 
		{
			for (int j = 0; j < count-1; j++) 
			{
				if(ar[j]>ar[j+1])
				{
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	public void reverseHalf()
	{
		int a=count%2==0?count/2:count/2-1;


		for (int i = 0; i < a; i++) 
		{
			int temp = ar[i];
			ar[i]=ar[a+i];
			ar[a+i]=temp;
		}
	}
	public void reverse()
	{
		int a=count%2==0?count/2:count/2-1;
		int first = 0;
		for (int i = count-1; i > a; i--) 
		{
			int temp = ar[first];
			ar[first]= ar[i];
			ar[i]    = temp;
			first++;

		}
	}

	public void reverse2()
	{
		for (int i = 0; i < count/2; i++) 
		{
			int tmp = ar[i];
			ar[i] = ar[count-i-1];
			ar[count-i-1] = tmp;
		}
	}

	public int [] toArray()
	{
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=ar[i];
		}
		return array;
	}
	public void init (int[]array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			ar[i] = array[i];
		}
		count = array.length;
	}
	public int max()
	{
		int max=ar[0];
		for (int i = 0; i < count; i++) 
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}
		return max;
	}
	public int min()
	{
		int min=ar[0];
		for (int i = 0; i < count; i++) 
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		return min;
	}
	public int maxInd()
	{
		int max=ar[0];
		for (int i = 0; i < count; i++) 
		{
			if(max<ar[i])
			{
				max=i;
			}
		}
		return max;
	}
	public int minInd()
	{
		int min=ar[0];
		for (int i = 0; i < count; i++) 
		{
			if(min>ar[i])
			{
				min=i;
			}
		}
		return min;
	}
	public void clear()
	{
		count = 0;
	}

	@Override
	public String toString() 
	{
		String str="[";
		for (int i = 0; i < count; i++) 
		{
			str+=ar[i]+",";
		}
		str+="]";

		return str;
	}
}

