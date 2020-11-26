static void quickSort(int A[],int start,int end){
        if(start<end){
        int partition_index=partitioning(A,start,end);
        quickSort(A,0,partition_index-1);
        quickSort(A,partition_index+1,end);}

    }
    //   7->10->5->8->9
    static int partitioning(int A[],int start,int end){

        int last=A[end];
        int p_index=start;
        for(int i=start;i<end;i++){
            if(last>=A[i]){
                int temp=A[p_index];
                A[p_index]=A[i];
                A[i]=temp;
                p_index++;
            }
        }
        int temp=A[end];
        A[end]=A[p_index];
        A[p_index]=temp;
        return p_index;
    }