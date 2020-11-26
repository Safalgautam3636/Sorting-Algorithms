static int []insertionSortImplementation(int A[]){
        int length=A.length;
        for(int i=1;i<length;i++){
            int x=A[i];
            int j=i-1;
            while (j>=0&&x<A[j]) {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=x;
        }
return A;

    }