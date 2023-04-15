//jagged Array program, in jagged Array size of row are same but size of coloum ,we can change acoording to our need
package OOPs_Concept.Array;
public class JaggedArray {
    public static void main(String[] args) {

        String[][] a= new String[4][];
        a[0] = new String[3];
        a[1] = new String[4];
        a[2] = new String[2];
        a[3] = new String[2];
        a[0][0]="my_name";
        a[0][1]="is";
        a[0][2]="kiran_katiyar";
        a[1][0]="my";
        a[1][1]="son";
        a[1][2]="name_is";
        a[1][3]="kishu_katiyar";
        a[2][0]="state";
        a[2][1]="madhaya_pradesh";
        a[3][0]="city";
        a[3][1]="bhopal";
        System.out.println("SHOW JAGGED ARRAY");
        System.out.println("my Personal Details in Jagged Araay ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"    ");}
            System.out.println( " " );
        }
    }
}
