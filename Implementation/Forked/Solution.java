// Problem link : https://codeforces.com/problemset/problem/1904/A

import java.util.*;
public class Answer{
    static int[] dx = {1,-1,-1,1} ;
    static int [] dy = {1,1,-1,-1};
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a , b;
            a = sc.nextInt();
            b= sc.nextInt();
            int x_king , y_king;
            x_king = sc.nextInt();
            y_king = sc.nextInt();
            int x_queen=  sc.nextInt();
            int y_queen = sc.nextInt();
            Set<List<Integer>>king  = new HashSet<>();
            Set<List<Integer>>queen  = new HashSet<>();
            for(int i = 0 ; i< 4 ;i++){
                king.add(Arrays.asList((x_king+dx[i]*a),(y_king+dy[i]*b)));
                king.add(Arrays.asList((x_king+dx[i]*b),(y_king+dy[i]*a)));
                
                queen.add(Arrays.asList((x_queen+dx[i]*a),(y_queen+dy[i]*b)));
                queen.add(Arrays.asList((x_queen+dx[i]*b),(y_queen+dy[i]*a)));
            }
            
          king.retainAll(queen);
          System.out.println(king.size());
          
        }
        sc.close();
    }
}
