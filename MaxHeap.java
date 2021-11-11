package heap;

import java.util.Arrays;
import java.util.Objects;
import java.lang.Math;


public class MaxHeap {
	
	private Integer[] heap;
	private int size; //for array size
	private int heapSize;	//for heap size
	
	//getters
	public Integer[] getHeap() {
        return heap;
    }

    public int getSizeArr() {
        return size;
    }

    public int getSizeHeap() {
        return heapSize;
    }
	
	public MaxHeap(int size) {//creates an empty heap
		
		if(size<= 0) {//size cannot be less than 1
			throw new IllegalArgumentException("Invalid size");
		}
	
		this.heap = new Integer[size]; //create new array
		this.heapSize = 0; //initialize size to 0
		this.size = heap.length; //make heap size array length which is 1

	}
	
	
	public MaxHeap(Integer[] someArray) {
		if(someArray == null) {//cannot be null
			throw new IllegalArgumentException("Invalid argumemt");
		}
		
		if(someArray.length == 0) {//array cannot be empty
			throw new IllegalArgumentException("Invalid size");
		}
		
		this.heap = new Integer[someArray.length]; //create array same size as someArray 
		this.heapSize = 0; //initialize size to 0
		this.size = heap.length; //make heap size someArray length 
		
		for(int i =0; i<someArray.length;i++) {
			this.insert(someArray[i]); //correctly place values in array in sorted order: greatest to least
		}	
		
	}
	

	public void insert(int n) {
		
		if(heapSize>=size) {//array is full
			resize();
		}
		heap[heapSize] = n; //inserting at the end of the array
		
		int i = heapSize; //define i as the end of the array
		while( i  != 0 &&heap[i]>= heap[Parent(i)]) {//short circuit while loop due to root being negative
			
			swap(i,Parent(i));//swap indexes
			i = Parent(i); //make i the new parent when swapped
			
			
		}
		
		heapSize = heapSize +1; //increase heapsize by 1
		
	}
	
	private int deleteMax() {
	
		 	int maxVal = heap[0]; //get the root
	        heap[0] = heap[--size]; //redefine root element of array

	       
	        int i = 0;//beginning of tree
	        while (i < size / 2) {//rearrange tree
	            int lchild = leftChild(i);
	            int rchild = rightChild(i);

	            
	            if (heap[i] < heap[lchild] || heap[i] < heap[rchild]) {//compare right and left children and correctly swap the smaller elements
	                if (heap[lchild] > heap[rchild]) {
	                    swap(i, lchild);
	                    i = lchild;
	                } else {
	                    swap(i, rchild);
	                    i = rchild;
	                }
	            } else {//no swaps needed
	                
	            			break;
	            }
	        }

		return maxVal; //return max value
		
	}
	
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<heapSize;i++) {
			s.append(heap[i]).append(",");
		}
		
		return s.toString();		
		
	}
	
	public static void heapsort(Integer[] arrayToSort) {
		
		MaxHeap temp = new MaxHeap(arrayToSort); //create an instance of the class in order to access non-static members of class
		//Construct a MaxHeap object storing array length
		for(int i = 0; i<=arrayToSort.length-1; i++) {
			if(arrayToSort.length-1 == 0) //empty tree
				throw new IllegalArgumentException("Invalid size");
			arrayToSort[i] = temp.deleteMax();
		
			}
		//apply the delete max repeatedly on the heap, then copy back the items in the array in sorted order by transversing backwards through array as array is from least to greatest	
		
	}
	
	public int Parent(int i) {//get parent
		
		int val = 0;
		
		if(i%2 == 0) {//for even numbers
			val = (i-2)/2;
		}
		
		else{//for odd numbers
			val = (i-1)/2;
		}
		
		return val;
		
	}
	
	public int rightChild(int i) {return (i*2)+2;}//get right child
		
		
	public int leftChild(int i) {return (i*2)+1;} //get left child
	
	public void swap(int a,int b) {// swap elements in heap array
		
		int temp = heap[a];	
		heap[a] = heap[b];
		heap[b] = temp;
			
	}
	
	public void resize() {
		Integer[] temp = heap; //old heap
		size = size*2; //update array size
		
		heap = new Integer[size]; //define new heap	
		
		for(int i=0; i<temp.length;i++) {//populate heap
			heap[i] = temp[i];
		}
		
	}
	public String toStringLevel(){//printing function
        String out = "";
        int level = 0;

        for(int i = 0; i < heapSize; i++){
            out += heap[i] + " ";

            if(i == Math.pow(2,level+1)-2){
                level += 1;
                out += "\n";
            }
        }

        return out;
    }

}
