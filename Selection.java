static int[] selectionSortImplementation(int A[]){
        for(int i=0;i<A.length-1;i++){
            int min_value_index=A[i];
            int j;
            for( j=i+1;j<A.length;j++){
                if(A[j]<A[min_value_index]){
                   min_value_index=j;
                }
            }
            int temp=A[i];
            A[i]=A[min_value_index];
            A[min_value_index]=temp;

        }
        return A;
}