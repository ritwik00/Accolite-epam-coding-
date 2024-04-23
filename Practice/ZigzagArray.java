public class ZigzagArray {
    public static void main(String[] args) {
        int[] a = {4,5,8,6,8,4,5,6};
        int[] b = {4,5,6,4,5};
        int[] zig = zigzag(a,b);
        System.out.println(zig);
        for (int i : zig) {
            System.out.print(i+" ");
        }
    }

    public static int[] zigzag(int[] a, int[] b){
        int[] br = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            br[k++] = a[i++];
            br[k++] = b[j++];
        }
        while (i<a.length) {
            br[k++] = a[i++];
        }
        while (j<b.length) {
            br[k++] = b[j++];
        }
        return br;
    }
}
