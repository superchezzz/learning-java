public class Pattern2{
    public static void main(String[] args){
        for(int x=3; x>=0; x--){
            for(int y=3;y>x; y-- ){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}